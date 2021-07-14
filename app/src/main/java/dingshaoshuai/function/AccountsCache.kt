package dingshaoshuai.function

import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import dingshaoshuai.function.cache.BaseAnyCache
import dingshaoshuai.function.kt.toList

/**
 * @author: Xiao Bo
 * @date: 3/7/2021
 */
object AccountsCache : BaseAnyCache<List<Account>>() {
    override val key: String
        get() = "dbchain_auth_account"

    override fun json2any(valueJson: String): List<Account> {
        val type = object : TypeToken<List<Account>>() {}.type
        return GsonBuilder().serializeNulls().create().fromJson<List<Account>>(valueJson, type)
//        return valueJson.toTest(Account::class.java) ?: mutableListOf()
    }
}