package dingshaoshuai.function

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import dingshaoshuai.function.ui.getScreenPixels

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val screenPixels = getScreenPixels()
        Log.i(TAG, "onCreate: width = ${screenPixels[0]}")
        Log.i(TAG, "onCreate: height = ${screenPixels[1]}")
    }

    companion object{
        private const val TAG = "MainActivity"
    }
}