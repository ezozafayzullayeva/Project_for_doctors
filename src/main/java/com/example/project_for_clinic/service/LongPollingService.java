package com.example.project_for_clinic.service;

import com.example.project_for_clinic.constants.BotConstants;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
@Service
@RequiredArgsConstructor
public class LongPollingService extends TelegramLongPollingBot {
    private final WebhookService webhookService;
    @Override
    public String getBotUsername() {
       return BotConstants.BOT_USERNAME;
    }

    @Override
    public String getBotToken() {
        return BotConstants.BOT_TOKEN;
    }

    @Override
    public void onUpdateReceived(Update update) {
 webhookService.getUpdate(update);
    }
}
