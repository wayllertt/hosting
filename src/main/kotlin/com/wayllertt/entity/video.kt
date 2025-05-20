package com.wayllertt.entity;

import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Id
import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import java.time.LocalDateTime ; // Для работы с датой/временем

@Entity
@Table(name = "videos")
data class video(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false, length = 100)
    val title: String,

    val filename: String,

    @Column(nullable = false, unique = true)
    val url: String,

    @Column(nullable = false, length = 1000)
    val description: String,

    @Column(name = "cast_members", nullable = true, length = 500)
    val castMembers: String,

    @Column()
    val director: String,

    @Column(nullable = false)
    var views: Long = 0,

    @Column(nullable = false)
    var likes: Long = 0,

    @Column(name = "created_at", nullable = false)
    val createdAt: LocalDateTime = LocalDateTime.now()
)