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

fun <T> String.toList(clazz: Class<T>): List<T> {
    return JsonParseProxy.instance.toList(this, clazz)
}

fun <T> String.toMap(): Map<String, T> {
    return JsonParseProxy.instance.toMap(this)
}

fun <T> String.toListMap(): List<Map<String, T>> {
    return JsonParseProxy.instance.toListMap(this)
}