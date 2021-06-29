package dingshaoshuai.function

import android.content.Context
import dingshaoshuai.base.feature.cache.CacheProxy
import dingshaoshuai.base.feature.image.ImageLoaderProxy
import dingshaoshuai.base.feature.json.JsonParseProxy
import dingshaoshuai.function.impl.CacheImpl
import dingshaoshuai.function.impl.ImageLoaderImpl
import dingshaoshuai.function.impl.JsonParseImpl

/**
 * @author: Xiao Bo
 * @date: 29/6/2021
 */
object Function {

    internal lateinit var context: Context

    fun init(context: Context) {
        this.context = context
        ImageLoaderProxy.init(ImageLoaderImpl())
        JsonParseProxy.init(JsonParseImpl())
        CacheProxy.init(CacheImpl(context))
    }
}