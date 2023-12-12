package kz.course.homework3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    private lateinit var changeActivityButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        initViews()
        initListeners()
    }

    private fun initViews() {
        changeActivityButton = findViewById(R.id.changeActivityButton)
    }

    private fun initListeners() {
        changeActivityButton.setOnClickListener {
            changeActivity()
        }
    }

    private fun changeActivity() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }


}