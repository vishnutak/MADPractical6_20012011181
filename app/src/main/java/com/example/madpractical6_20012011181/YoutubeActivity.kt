package com.example.madpractical6_20012011181

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class YoutubeActivity : AppCompatActivity() {
    private  val  youtubeId = "g6fnFALEseI"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        val MyWebView = findViewById<WebView>(R.id.WebView)
        val setting = MyWebView.settings
        setting.javaScriptEnabled=true
        setting.loadWithOverviewMode=true
        setting.useWideViewPort=true
        MyWebView.loadUrl("https://www.youtube.com/embed/$youtubeId")
    }
}