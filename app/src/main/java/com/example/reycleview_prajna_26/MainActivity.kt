package com.example.reycleview_prajna_26

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //misal pengubahan data atau input data kaya gambar, nama, dan desc itu disini.
        val cookierunList = listOf<CookieRun>(
            CookieRun(
                R.drawable.expresso,
                namecookie = "Expresso Cookie",
                descriptioncookie = "Expresso cookie is have magical coffe"
            ),
            CookieRun(
                 R.drawable.lilac,
                 namecookie = "Lilac Cookie",
                 descriptioncookie = "Lilac cookie is support cookie with 5% CRIT"

            ),
            CookieRun(
                R.drawable.madeline,
                namecookie = "Madeline Cookie",
                descriptioncookie = "Madeline cookie is my favorite defense cookie"
            ),
            CookieRun(
                R.drawable.twizzly,
                namecookie = "Twizzly Gummy Cookie",
                descriptioncookie = "Twizzly is special character from hallowen event 2021"

            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.cookierun)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = CookierunAdaptor(this, cookierunList){
            }
    }
}