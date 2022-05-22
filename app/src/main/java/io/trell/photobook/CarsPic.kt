package io.trell.photobook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CarsPic : AppCompatActivity() {
    lateinit var btnNext1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cars_pic)

        btnNext1=findViewById(R.id.btnNext1)
        btnNext1.setOnClickListener {
            val intent=Intent(this,ShoesPic::class.java)
            startActivity(intent)
        }
    }
}