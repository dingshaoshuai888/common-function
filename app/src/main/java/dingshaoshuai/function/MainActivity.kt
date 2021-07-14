package dingshaoshuai.function

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import dingshaoshuai.base.feature.image.ImageLoaderProxy
import dingshaoshuai.function.ui.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun btnSaveClick(view: View) {
        val list = listOf(Account("火币", "火币的key", "111111"), Account("币安", "币安的key", "222222"))
        AccountsCache.setValue(list)
    }

    fun btnGetClick(view: View) {

        val parseList = listOf(Account("火币", "火币的key", "111111"), Account("币安", "币安的key", "222222"))

        val accounts = mutableListOf<Account>()
        AccountsCache.getValue()?.let { list ->
            accounts.addAll(list)
        }
        accounts.addAll(parseList)
        AccountsCache.setValue(accounts)




        val value = AccountsCache.getValue()
        Log.i(TAG, "btnGetClick: ${value?.toString()}")
        value?.forEach {
            Log.i(TAG, "btnGetClick: $it")
        }

    }

    companion object {
        private const val TAG = "test_dss"
    }

}