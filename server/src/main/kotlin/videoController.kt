import org.springframework.web.bind.annotation.GetMapping //получить
import org.springframework.web.bind.annotation.RequestMapping //отправить
import org.springframework.web.bind.annotation.RestController //для работы с рест апи

@RestController //говорит спринг, что это контроллер апи
@RequestMapping("/api/videos") //отправляет список видео клиенту

class VideoController {

    @GetMapping //обрабатывает гет запросы
    fun getVideos(): // функция для получения списка видео
            String {
        return "Список видео"
    }
}