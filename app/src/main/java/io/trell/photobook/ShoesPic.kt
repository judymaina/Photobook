package io.trell.photobook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ShoesPic : AppCompatActivity() {
   lateinit var btnNext2:Button
   lateinit var btnPrev1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shoes_pic)
        btnNext2=findViewById(R.id.btnNext2)
        btnPrev1=findViewById(R.id.btnPrev1)
        btnNext2.setOnClickListener {
            val intent=Intent(this,MansionPic::class.java)
            startActivity(intent)
        }
        btnPrev1.setOnClickListener {
            val intent=Intent(this,CarsPic::class.java)
            startActivity(intent)
        }

    }
}