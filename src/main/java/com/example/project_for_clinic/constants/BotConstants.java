package com.example.project_for_clinic.constants;

public interface BotConstants {
    String BOT_TOKEN = "6901819621:AAFKXGoCDPMc-6G_jJo3gNJ4vLNr4CeQA6g";
    String BOT_USERNAME = "t.me/doctors_landing_page_bot";
    String URL = "https://api.telegram.org/bot";
    String FOR_MESSAGE = URL + BOT_TOKEN + "/sendMessage";
    String EDIT_MESSAGE = URL + BOT_TOKEN + "/editMessageText";
    String FORWARD = URL + BOT_TOKEN + "/forwardMessage";
    String FOR_DELETE_MESSAGE = URL + BOT_TOKEN + "/deleteMessage";
    String FOR_DOCUMENT = URL + BOT_TOKEN + "/sendDocument";
}
