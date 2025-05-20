package com.wayllertt.dto

import java.time.LocalDateTime

data class VideoDto (

    val id: Long,
    val title: String,
    val url: String,
    val thumbnaiUrl: String,
    val castMembers: String,
    val director: String,
    val description: String,
    val views: Long,
    val likes: Long,
    val createdAt: LocalDateTime,

)