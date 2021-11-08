package com.example.reycleview_prajna_26

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class CookieRun(
    val imgcookie:Int,
    val namecookie:String,
    val descriptioncookie:String
):Parcelable
