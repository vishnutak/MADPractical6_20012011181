package com.example.madpractical6_20012011181


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mediaController= MediaController(this)
        val uri: Uri = Uri.parse("android.resourse://"+packageName+"/"+R.raw.thestoryoflight)
        val MyVideoView = findViewById<VideoView>(R.id.videoView)
        MyVideoView.setMediaController(mediaController)
        mediaController.setAnchorView(MyVideoView)
        MyVideoView.setVideoURI(uri)
        MyVideoView.requestFocus()
        MyVideoView.start()
        val button= findViewById<FloatingActionButton>(R.id.floatingActionButton)
        button.setOnClickListener {
            Intent(this,YoutubeActivity::class.java).apply { startActivity(this)}
        }


    }
}