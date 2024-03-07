package com.hellcorp.network.dto

data class Event(
    val `data`: List<Data>,
    val links: Links,
    val meta: Meta
)