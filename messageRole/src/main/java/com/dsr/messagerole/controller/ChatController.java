package com.dsr.messagerole.controller;

import com.dsr.messagerole.advisors.TokenUsageAuditAdvisor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.ai.openai.api.OpenAiApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ChatController {

    Logger logger = LoggerFactory.getLogger(ChatController.class);

    private final ChatClient chatClient;

    public ChatController(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @GetMapping("/openai/chat")
    public String openAiChat(@RequestParam("message") String message) {
        String response = chatClient
                .prompt()
//                .advisors(new TokenUsageAuditAdvisor())
                .system("""
                        You are an internal IT helpdesk assistant. Your role is to assist
                        employees with IT-related issues such as resetting passwords,
                        unlocking accounts, and answering questions related to IT policies.
                        If a user requests helps with anything outside of these responsibilities,
                        respond politely and inform them that you are only able to assist with IT
                        support tasks within your defined scope.
                        """)
                .user(message)
                .call().content();
        logger.info("Chat Response: {}",response);
        return response;
    }
}
