package miku.polska.slownik.bot.commands

import miku.polska.slownik.service.AcceptService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.telegram.telegrambots.extensions.bots.commandbot.commands.BotCommand
import org.telegram.telegrambots.meta.api.objects.Chat
import org.telegram.telegrambots.meta.api.objects.User
import org.telegram.telegrambots.meta.bots.AbsSender

@Component
class AddWordToPersonalDictionaryCommand extends BotCommand {

    @Autowired
    private AcceptService acceptService

    AddWordToPersonalDictionaryCommand() {
        super("add", "Dodać słowo w slownik.")
    }

    @Override
    void execute(AbsSender absSender, User user, Chat chat, String[] strings) {

    }
}
