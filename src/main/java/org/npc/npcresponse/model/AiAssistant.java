package org.npc.npcresponse.model;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AiAssistant {

    private final OllamaChatModel model;

    public String generateResponse(String args) {
        log.info("Generating response for AI assistant");
        String responce = model.call(new Prompt(args)).getResult().getOutput().getText();
        log.info("AI assistant response: " + responce);
        return responce;
    }

}
