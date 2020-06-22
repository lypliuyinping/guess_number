package com.twschool.practice.domain.repository;

import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.repository.GameRepository;
import org.junit.Assert;
import org.junit.Test;

public class GameRepositoryTest {

    @Test
    public void should_create_game() throws Exception{
        GameRepository gameRepository = new GameRepository();
        GuessNumberGame guessNumberGame = gameRepository.create();

        Assert.assertNotNull(guessNumberGame);
    }
    @Test
    public void should_fine_game() throws Exception{
        GameRepository gameRepository = new GameRepository();
        GuessNumberGame expectGuessNumberGame = gameRepository.create();
        GuessNumberGame guessNumberGame = gameRepository.find();

        Assert.assertNotNull(guessNumberGame);
        Assert.assertEquals(expectGuessNumberGame,guessNumberGame);
    }
}
