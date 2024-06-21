package com.example.project_for_clinic;

import com.example.project_for_clinic.service.LongPollingService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@RequiredArgsConstructor
@SpringBootApplication
public class ProjectForClinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectForClinicApplication.class, args);
    }

    @Bean
    public TelegramBotsApi telegramBotsApi(LongPollingService longPollingService) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi=new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(longPollingService);
        return telegramBotsApi;
    }
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }



}
