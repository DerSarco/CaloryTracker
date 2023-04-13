package com.dersarco.tracker_data.remote.dto

import com.squareup.moshi.Json

data class Product(
    @field:Json(name = "image_front_thumb_url")
    val imageFrontThumbUrl: String?,
    @field:Json(name = "product_name")
    val productName: String?,
)
