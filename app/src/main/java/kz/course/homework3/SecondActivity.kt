package kz.course.homework3

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d("create", "onCreate")

        initViews()
    }

    private fun initViews() {
        textView = findViewById(R.id.textView)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            textView.text = "1"
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            textView.text = "0"
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("start", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("resume", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("pause", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("stop", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("restart", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("destroy", "onDestroy")
    }

}