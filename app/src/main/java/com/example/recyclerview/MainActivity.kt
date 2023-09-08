package com.example.recyclerview

import android.icu.text.CaseMap.Title
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.voice.VoiceInteractionSession.ActivityId
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<News>
    lateinit var  imageId: Array<Int>
    lateinit var text1: Array<String>
    lateinit var title: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
        )

        text1 = arrayOf(
            "qwertyuihgfbnm,bvcvbnmjhgfghgfbjhbnhbnhbnbnjnm",
            "qwertyuihgfbnm,bvcvbnmjhgfghgfbjhbnhbnhbnbnjnm",
            "qwertyuihgfbnm,bvcvbnmjhgfghgfbjhbnhbnhbnbnjnm",
            "qwertyuihgfbnm,bvcvbnmjhgfghgfbjhbnhbnhbnbnjnm",
            "qwertyuihgfbnm,bvcvbnmjhgfghgfbjhbnhbnhbnbnjnm",
            "qwertyuihgfbnm,bvcvbnmjhgfghgfbjhbnhbnhbnbnjnm",
            "qwertyuihgfbnm,bvcvbnmjhgfghgfbjhbnhbnhbnbnjnm",
            "qwertyuihgfbnm,bvcvbnmjhgfghgfbjhbnhbnhbnbnjnm",
        )
        title = arrayOf(
            "title1",
            "title2",
            "title3",
            "title4",
            "title5",
            "title6",
            "title7",
            "title8",
        )

        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager( this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<News>()
        getUserdata()
    }

    private fun getUserdata() {
        for (i in imageId.indices){

            val news = News(imageId[i],title[i],text1[i])
            newArrayList.add((news))
        }

        newRecyclerView.adapter = MyAdapter(newArrayList)
    }
}