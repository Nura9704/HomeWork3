package kz.course.homework3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    private lateinit var showFragmentButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        initListener()
    }

    private fun initViews() {
        showFragmentButton = findViewById(R.id.showFragmentButton)
    }

    private fun initListener() {
        showFragmentButton.setOnClickListener {
            showFragment(MyFragment())
        }
    }

    private fun showFragment(fragment: Fragment) {
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.contentFragment, fragment)
        transaction.commit()
    }


}