package dingshaoshuai.function

import android.app.Application

/**
 * @author: Xiao Bo
 * @date: 29/6/2021
 */
class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Function.init(this)
    }
}