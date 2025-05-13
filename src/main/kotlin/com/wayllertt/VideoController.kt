//сервис для запросов

package com.wayllertt

import com.wayllertt.entity.video
import com.wayllertt.repository.videoRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/videos")
class VideoController(private val repo: videoRepository) {

    @GetMapping
    fun getAll(): List<video> = repo.findAll()

    @PostMapping
    fun add(@RequestBody video: video): video = repo.save(video)
}