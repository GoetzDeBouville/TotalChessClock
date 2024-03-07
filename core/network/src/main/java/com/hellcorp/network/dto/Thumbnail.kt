package com.hellcorp.network.dto

data class Thumbnail(
    val id: Int,
    val originalUrl: String,
    val seo: Seo,
    val thumbUrl: String
)