package dingshaoshuai.function

import android.content.Context
import dingshaoshuai.base.feature.cache.Cache
import dingshaoshuai.base.feature.cache.CacheProxy
import dingshaoshuai.base.feature.image.ImageLoader
import dingshaoshuai.base.feature.image.ImageLoaderProxy
import dingshaoshuai.base.feature.json.JsonParse
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

    fun init(
        context: Context,
        imageLoader: ImageLoader? = null,
        jsonParse: JsonParse? = null,
        cache: Cache? = null
    ) {
        this.context = context
        ImageLoaderProxy.init(imageLoader ?: ImageLoaderImpl())
        JsonParseProxy.init(jsonParse ?: JsonParseImpl())
        CacheProxy.init(cache ?: CacheImpl(context))
    }
}