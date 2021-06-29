package dingshaoshuai.function.impl

import android.content.Context
import com.tencent.mmkv.MMKV
import dingshaoshuai.base.feature.cache.Cache

/**
 * @author: Xiao Bo
 * @date: 29/6/2021
 */
class CacheImpl(context: Context) : Cache {

    init {
        MMKV.initialize(context)
    }

    override fun clear() {
        MMKV.defaultMMKV().clear()
    }

    override fun delete(key: String) {
        MMKV.defaultMMKV().removeValueForKey(key)
    }

    override fun get(key: String, default: Boolean): Boolean {
        return MMKV.defaultMMKV().decodeBool(key, default)
    }

    override fun get(key: String, default: Int): Int {
        return MMKV.defaultMMKV().decodeInt(key, default)
    }

    override fun get(key: String, default: String): String {
        return MMKV.defaultMMKV().decodeString(key, default)
    }

    override fun save(key: String, value: Boolean) {
        MMKV.defaultMMKV().encode(key, value)
    }

    override fun save(key: String, value: Int) {
        MMKV.defaultMMKV().encode(key, value)
    }

    override fun save(key: String, value: String) {
        MMKV.defaultMMKV().encode(key, value)
    }
}