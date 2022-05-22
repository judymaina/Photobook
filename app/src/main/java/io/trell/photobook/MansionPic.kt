package io.trell.photobook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MansionPic : AppCompatActivity() {
    lateinit var btnNext3:Button
    lateinit var btnPrev2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mansion_pic)
        btnNext3=findViewById(R.id.btnNext3)
        btnPrev2=findViewById(R.id.btnPrev2)
        btnNext3.setOnClickListener {
            val intent=Intent(this,DiaryPic::class.java)
            startActivity(intent)
        }
        btnPrev2.setOnClickListener {
            val intent=Intent(this,ShoesPic::class.java)
            startActivity(intent)
        }

    }

    }



