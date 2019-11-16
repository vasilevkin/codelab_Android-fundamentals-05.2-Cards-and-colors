package com.example.android.materialme


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide


class DetailActivity : AppCompatActivity() {

    private lateinit var sportsTitle: TextView
    private lateinit var sportsImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        sportsTitle = findViewById(R.id.titleDetail)
        sportsImage = findViewById(R.id.sportsImageDetail)

        sportsTitle.text = intent.getStringExtra("title")
        Glide.with(this).load(intent.getIntExtra("image_resource",0))
                .into(sportsImage)
    }
}
