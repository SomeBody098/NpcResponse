package org.npc.npcresponse.controller;

import lombok.RequiredArgsConstructor;
import org.npc.npcresponse.model.AiAssistant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final AiAssistant aiAssistant;

    /*
    It is a test connecting the game (Trust a deadly game) with a server
     */
    @GetMapping("/test")
    public String test() {
        return "successfully";
    }

    @PostMapping("/response/{args}")
    public String response(@PathVariable String args) {
        return aiAssistant.generateResponse(args);
    }

}
