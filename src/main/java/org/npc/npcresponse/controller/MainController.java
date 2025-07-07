package org.npc.npcresponse.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.npc.npcresponse.model.AiAssistant;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MainController {

    private final AiAssistant aiAssistant;

    /**
    *It is a test connecting the game (Trust a deadly game) with a server
     * **/
    @GetMapping("/test")
    public String test() {
        return "successfully";
    }

    @PostMapping("/response")
    public String response(@RequestBody String args) {
        log.info("Been get a request: " + args);
        return aiAssistant.generateResponse(args);
    }

}
