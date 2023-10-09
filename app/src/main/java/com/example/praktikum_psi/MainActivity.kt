package com.example.praktikum_psi
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val signUp = SignUp()
        val splashScreen = SplashScreen()
        supportFragmentManager.beginTransaction().apply {

            replace(R.id.fragment_main, splashScreen)
            commit()
        }
        findViewById<Button>(R.id.btn_one).setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_main, splashScreen)
                commit()
            }
        }
        findViewById<Button>(R.id.btn_two).setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_main,signUp)
                commit()
            }
        }
    }
}