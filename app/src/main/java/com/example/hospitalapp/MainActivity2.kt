package com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.hospitalapp.R
import com.example.hospitalapp.dubaihp
import com.example.hospitalapp.latifahp
import com.example.hospitalapp.rashidhp

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val Intent= Intent(this, dubaihp::class.java)
            startActivity(Intent)
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val Intent = Intent(this, latifahp::class.java)
            startActivity(Intent)
        }
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val Intent = Intent(this, rashidhp::class.java)
            startActivity(Intent)
        }
    }
}