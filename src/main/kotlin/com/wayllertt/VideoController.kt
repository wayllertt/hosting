//сервис для запросов

package com.wayllertt

import org.springframework.web.bind.annotation.*

//@RestController
//@RequestMapping("/api/videos")
//class VideoController(private val videoRepository: VideoRepository) {
//
//    @GetMapping //обрабатывает гет запросы
//    fun getVideos(): List<Video> {
//        return videoRepository.findAll() //findAll() - функция возвращает все видео из БД
//    }
//
//    @PostMapping
//    fun addVideo(@RequestBody video: Video): Video {
//        return videoRepository.save(video) //save(video) - функция добавляет новое видео
//    }
//
//
//}