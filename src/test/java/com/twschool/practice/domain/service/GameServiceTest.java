package com.twschool.practice.domain.service;

import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.service.GameService;
import org.junit.Test;
import org.mockito.Mockito;

public class GameServiceTest {
    public GameServiceTest(GuessNumberGame guessNumberGame) {
    }

    @Test
    public  void should_return_result_when_guess_number(){
        GuessNumberGame guessNumberGame= Mockito.mock(GuessNumberGame.class);
        GameService gameService =new GameService(guessNumberGame);
        gameService.guess("1 2 3 4");
        Mockito.verify(guessNumberGame, Mockito.times(1)).guess(Mockito.eq("1 2 3 4"));
    }
}
