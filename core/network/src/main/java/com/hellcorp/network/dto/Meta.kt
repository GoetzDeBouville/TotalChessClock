package com.hellcorp.network.dto

data class Meta(
    val current_page: Int,
    val from: Int,
    val last_page: Int,
    val path: String,
    val perPage: Int,
    val to: Int,
    val total: Int
)