package com.example.hope

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.klinker.android.link_builder.Link
import com.klinker.android.link_builder.applyLinks
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        linkSetup()
    }
//    private fun linkSetup (){
//
//val instagramlink = Link("INSTAGRAM")
//    .setTextColor(Color.BLUE)
//    .setTextColorOfHighlightedLink(Color.CYAN)
//    .setHighlightAlpha(.4f)
//    .setUnderlined(true)
//    .setBold(false)
//    .setOnClickListener { Toast.makeText(this,"INSTAGRAM LINK CLICKED",Toast.LENGTH_SHORT).show() }
//    .setOnClickListener {  }
//
//textView2.applyLinks(instagramlink)
//
//    }
}