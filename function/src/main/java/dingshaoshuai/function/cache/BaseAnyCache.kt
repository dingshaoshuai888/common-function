package dingshaoshuai.function.cache

import android.text.TextUtils
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import dingshaoshuai.base.feature.cache.CacheProxy
import dingshaoshuai.function.kt.toJsonString

/**
 * @author: Xiao Bo
 * @date: 15/6/2021
 */
abstract class BaseAnyCache<T : Any> : AbstractCache<T>() {

    abstract fun json2any(valueJson: String): T
    private val liveData by lazy { MutableLiveData<T>() }

    override fun setValue(value: T) {
        CacheProxy.instance.save(key, value.toJsonString())
        mValue = value
        liveData.value = mValue
    }

    override fun getValue(): T? {
        if (mValue != null) {
            return mValue
        }
        val valueJson = CacheProxy.instance.get(key, "")
        mValue = if (TextUtils.isEmpty(valueJson)) {
            null
        } else {
            json2any(valueJson)
        }
        return mValue
    }

    override fun clear() {
        CacheProxy.instance.delete(key)
        mValue = null
    }

    fun observer(owner: LifecycleOwner, observer: Observer<T>) {
        liveData.observe(owner, observer)
    }
}