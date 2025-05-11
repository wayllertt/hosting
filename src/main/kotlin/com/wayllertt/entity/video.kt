package com.wayllertt.entity;

import org.intellij.lang.annotations.Identifier;
import java.time.LocalDateTime ; // Для работы с датой/временем
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.samples.petclinic.model.Entity;
import org.springframework.samples.petclinic.model.Table;
import org.springframework.samples.petclinic.model.Id;
import org.springframework.samples.petclinic.model.GeneratedValue;
import org.springframework.samples.petclinic.model.Column;

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

    @Column()
    val rating: ,
)