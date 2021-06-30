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
        val screenPixels = getScreenPixels()
        Log.i(TAG, "onCreate: width = ${screenPixels[0]}")
        Log.i(TAG, "onCreate: height = ${screenPixels[1]}")


        Log.i(TAG, "onCreate1: ${resourceString(R.string.app_name)}")
        Log.i(TAG, "onCreate2: ${resourceStringArray(R.array.string_array)[0]}")
        Log.i(TAG, "onCreate3: ${resourceInteger(R.integer.interger_100)}")
        Log.i(TAG, "onCreate4: ${resourceIntArray(R.array.int_array)[0]}")
        Log.i(TAG, "onCreate5: ${resourceBoolean(R.bool.boolean_true)}")

        findViewById<View>(R.id.tv).setBackgroundColor(resourceColor(R.color.black))
        findViewById<ImageView>(R.id.iv).setImageDrawable(resourceDrawable(R.drawable.ic_logout))
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}