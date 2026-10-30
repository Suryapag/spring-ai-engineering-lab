package com.springai.lab.controler;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import com.springai.lab.service.Basic_ai_chat_service;

@RestController
public class Basic_ai_chat_controller {
	
	@Autowired
	Basic_ai_chat_service basic_ai_chat_service;
	
    @PostMapping("/ai")
    public String check(
    		@RequestParam String prompt
    ){
       return basic_ai_chat_service.chat(prompt);
    }
}
