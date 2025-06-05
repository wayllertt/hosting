package com.wayllertt.service

import com.wayllertt.dto.VideoDto
import com.wayllertt.entity.video
import com.wayllertt.repository.videoRepository
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class VideoService (
    private val repo: videoRepository,
    @Value("\${video.storage.path}") private val storagePath: String
) {
    fun listAll(): List<VideoDto> = repo.findAll().map(VideoService::toDto)

    companion object {
        private fun toDto(v: video): VideoDto =
            VideoDto(
                id = v.id!!,
                title = v.title,
                url = "/videos/${v.filename}", //В videoUrl мы указываем путь, по которому приложение (и ExoPlayer) сможет достать файл.
                thumbnailUrl = "/videos/thumbnails/${v.filename}.jpg",
                views = v.views,
                likes = v.likes,
                createdAt = v.createdAt,
                castMembers = v.castMembers,
                director = v.director,
                description = v.description,
            )
    }
}