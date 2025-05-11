package com.wayllertt.entity;

import javax.persistence.*
import java.time.LocalDateTime ; // Для работы с датой/временем

@Entity
@Table(name = "videos")
data class video(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false, length = 100)
    val title: String,

    @Column(nullable = false, unique = true)
    val url: String,

    @Column(nullable = false, length = 500)
    val description: String,

    @Column(nullable = true, length = 500)
    val cast: String,

    @Column()
    val director: String,
//
//    @Column()
//    val rating: ,

    @Column(name = "created_at", nullable = false)
    val createdAt: LocalDateTime = LocalDateTime.now()
)