package com.example.madpractical4_20012021037

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var buttonBrowse=findViewById<Button>(R.id.button_browse)
        buttonBrowse.setOnClickListener{
            var intent=Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.google.com")).apply { startActivity(this) }
        }
        var buttoncall=findViewById<Button>(R.id.button_call)
        buttoncall.setOnClickListener{
            var intent=Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:+919313617011")).apply { startActivity(this) }
        }
    }
}