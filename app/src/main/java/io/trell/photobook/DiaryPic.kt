package io.trell.photobook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DiaryPic : AppCompatActivity() {
    lateinit var btnNext4:Button
    lateinit var btnprev3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diary_pic)
        btnNext4=findViewById(R.id.btnNext4)
        btnprev3=findViewById(R.id.btnPrev3)
        btnNext4.setOnClickListener {
          val intent=Intent(this,WaterBottles::class.java)
            startActivity(intent)
        }
        btnprev3.setOnClickListener {
            val intent=Intent(this,MansionPic::class.java)
            startActivity(intent)
        }
    }
}