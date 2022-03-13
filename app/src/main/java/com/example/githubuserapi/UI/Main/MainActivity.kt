package com.example.githubuserapi.UI.Main

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.githubuserapi.R


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_intent)
        btnMoveActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?){
        when(v?.id) {
            R.id.btn_intent -> {
                val moveIntent = Intent(this@MainActivity, ActivityDua::class.java)
                startActivity(moveIntent)
            }
        }
    }

}