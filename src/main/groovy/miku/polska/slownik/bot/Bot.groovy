package miku.polska.slownik.bot

import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.telegram.telegrambots.extensions.bots.commandbot.TelegramLongPollingCommandBot
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Update
import org.telegram.telegrambots.meta.exceptions.TelegramApiException

import java.time.LocalDateTime

@Component
@Slf4j
class Bot extends TelegramLongPollingCommandBot {

    @Value('${app.bot.name}')
    private String name

    @Value('${app.bot.token}')
    private String token

    @Override
    String getBotUsername() {
        return name
    }

    @Override
    void processNonCommandUpdate(Update update) {
        def message = update.getMessage()
        def id = message.getChatId()
        answer(id)
    }

    void answer(Long id) {
        def answer = new SendMessage()
        answer.setChatId(id as String)
        answer.setText("No such command. / Nie ma tej komendy.")
        try {
            execute(answer)
        } catch (TelegramApiException ignored) {
            log.debug(String.format("EXCEPTION: couldn't answer to $id @ ${LocalDateTime.now()}"))
        }
    }

    @Override
    String getBotToken() {
        return token
    }
}
