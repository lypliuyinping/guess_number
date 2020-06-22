package com.twschool.practice.api;

import com.twschool.practice.domain.AnswerGenerator;
import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.service.GameService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GameController {
    @PostMapping("/games/guess-numbers")
    public Map<String,String> guess(@RequestBody Map<String,String> requestBody) throws Exception{
       GameService gameService=new GameService(new GuessNumberGame(new AnswerGenerator()));
        String number=requestBody.get("number");
        Map<String,String> responseBody = new HashMap<>();
        GuessNumberGame guessNumberGame=new GuessNumberGame(new AnswerGenerator());
        responseBody.put("input",responseBody.get("number"));
        responseBody.put("result",requestBody.get("number"));
        return responseBody;
    }
}
