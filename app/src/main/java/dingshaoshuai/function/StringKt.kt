package dingshaoshuai.function

import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken

/**
 * @author: Xiao Bo
 * @date: 8/7/2021
 */
inline fun <reified T> String.toTest(t: Class<T>): List<T>? {
    val type = object : TypeToken<List<T>>() {}.type
    return GsonBuilder().serializeNulls().create().fromJson<List<T>>(this, type)
}