package org.npc.npcresponse.model;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AiAssistant {

    private final OllamaChatModel model;

    public String generateResponse(String args) {

    }

}
