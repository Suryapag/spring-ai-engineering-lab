package com.springai.lab.service;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.stereotype.*;

@Service
public class Basic_ai_chat_service {

	private final ChatModel chatModel;

    public Basic_ai_chat_service(ChatModel chatModel) {
        this.chatModel = chatModel;
    }
	
	public String chat(String prompt) {
        try {
            return chatModel.call(prompt);
        }catch (Exception e){
            return e.getMessage();
        }
	}
}
