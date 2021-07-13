package dingshaoshuai.function.kt

import dingshaoshuai.base.feature.json.JsonParseProxy

/**
 * @author: Xiao Bo
 * @date: 30/6/2021
 */
fun <T> String.toObject(clazz: Class<T>): T {
    return JsonParseProxy.instance.toObject(this, clazz)
}

fun Any.toJsonString(): String {
    return JsonParseProxy.instance.toJsonString(this)
}
