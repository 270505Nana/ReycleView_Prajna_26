package com.example.reycleview_prajna_26

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CookierunAdaptor (private val context: Context, private val CookieRun: List<CookieRun>, val listener:(CookieRun)-> Unit)
    :RecyclerView.Adapter<CookierunAdaptor.CookieRunViewHolder>() {
    class CookieRunViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imgcookie = view.findViewById<ImageView>(R.id.img_item_photo)
        val namecookie = view.findViewById<TextView>(R.id.tv_item_name)
        val descriptioncookie = view.findViewById<TextView>(R.id.tv_item_description)


        fun bindView(cookierun:CookieRun, listener: (CookieRun) -> Unit){
            imgcookie.setImageResource(cookierun.imgcookie)
            namecookie.text = cookierun.namecookie
            descriptioncookie.text = cookierun.descriptioncookie
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CookieRunViewHolder {
        return CookieRunViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_cookierun, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CookieRunViewHolder, position: Int) {
        holder.bindView(CookieRun[position],listener)
    }

    override fun getItemCount(): Int = CookieRun.size
}


