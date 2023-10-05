package com.example.praktikum_psi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var tv_onPause: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_onPause = findViewById(R.id.textview)
//        tv_onPause.text = "Activity is active! OnCreate telah jalan"
        Log.i("MainActivity", "onCreate()")
        val text = tv_onPause.text
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, text, duration) // in Activity
        toast.show()
    }

    override fun onStart() {
        super.onStart()
//        findViewById<TextView>(R.id.textview).setText("Activity sudah pernah melewati onStart()")
        Log.i("MainActivity", "onStart()")
        val text = tv_onPause.text
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, text, duration) // in Activity
        toast.show()
    }
    override fun onRestart() {
        super.onRestart()
//        findViewById<TextView>(R.id.textview).setText("Activity sudah pernah melewati onRestart()")
        Log.i("MainActivity", "onRestart()")
        val text = tv_onPause.text
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, text, duration) // in Activity
        toast.show()
    }
    override fun onResume() {
        super.onResume()
//        findViewById<TextView>(R.id.textview).setText("Activity sudah pernah melewati onResume() \nReqyan Lazuardi Imanimansur\n215150207111056")
        Log.i("MainActivity", "onResume()")
        val text = tv_onPause.text
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, text, duration) // in Activity
        toast.show()
    }

    override fun onPause() {
        super.onPause()
        tv_onPause.text = "Activity sudah pernah melewati onPause()"
        Log.i("MainActivity", "onPause()")
        val text = tv_onPause.text
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, text, duration) // in Activity
        toast.show()
    }

    override fun onStop() {
        super.onStop()
        findViewById<TextView>(R.id.textview).setText("Activity sudah pernah melewati onStop()")
        Log.i("MainActivity", "onStop()")
        val text = tv_onPause.text
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, text, duration) // in Activity
        toast.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        findViewById<TextView>(R.id.textview).text = "Telah Melewati onDestroy()"
        Log.i("MainActivity", "onDestroy()")
        val text = tv_onPause.text
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, text, duration) // in Activity
        toast.show()
    }


}