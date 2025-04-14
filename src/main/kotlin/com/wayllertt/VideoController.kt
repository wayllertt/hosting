package com.wayllertt

import org.springframework.web.bind.annotation.GetMapping //получить
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController //для работы с рест апи

@RestController
@RequestMapping("/api")
class VideoController {
    @GetMapping("/video") //обрабатывает гет запросы
    fun video():String {
        return "Эта залупа работает!"
    }
}