package com.example.dagger2example

import android.content.Intent
import android.icu.text.IDNA
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    // val info = Info()

   @Inject lateinit var info : Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         DaggerMagicBox.create().inject(this)
        tv.text = info.text

        b1.setOnClickListener()
        {
            intent = Intent(this,Main2Activity::class.java)
            startActivity(intent)
        }
    }
}






class Info @Inject constructor(){
    val text = "Hello Dagger2"
}

