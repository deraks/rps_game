package rpsgrope.rpsgame;

import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertTrue;
// import static org.mockito.ArgumentMatchers.assertArg;
// import static org.mockito.ArgumentMatchers.contains;

// import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;

import rpsgroupe.rpsgame.domain.*;
// import rpsgroupe.rpsgame.services.ComputerService;
// import rpsgroupe.rpsgame.services.GameService;
// import static org.hamcrest.MatcherAssert.assertThat;
// import static org.hamcrest.number.OrderingComparison.lessThan;
// import static org.hamcrest.Matchers.hasProperty;


// @SpringBootTest
public class ComputerTest {
    private Game game;
    // private ComputerService computerService;
    
    // @Autowired
    // public ComputerTest(ComputerService computerService) {
    //     this.computerService = computerService;
    // }
    @BeforeEach 
    public void init() {
       game = new Game();
    }
    // @Test
    // public void testGetComputerMoveService(){
    //     MovesEnum movesEnum = computerService.getMove();
    //     // assertTrue(true, Arrays.stream(MovesEnum.values()).anyMatch(movesEnum.name()::equals));
    //     assertTrue(Arrays.asList(MovesEnum.values()).contains(movesEnum));

    // }   
    @Test
    public void testGetComputerMove(){
        game.setComputerMove(MovesEnum.PAPER);
        assertEquals(MovesEnum.PAPER, game.getComputerMove());
    }   
    @Test
    public void testGetPlayerMove(){
        game.setPlayerMove(MovesEnum.PAPER);
        assertEquals(MovesEnum.PAPER, game.getPlayerMove());
    }   
    @Test
    public void testGetDrawWins(){
        game.setDraws(1);
        assertEquals(1, game.getDraws());
    }    
    @Test
    public void testGetPlayerWins(){
        game.setPlayerWins(1);
        assertEquals(1, game.getPlayerWins());
    }   
    @Test
    public void testGetComputerWins(){
        game.setComputerWins(1);
        assertEquals(1, game.getComputerWins());
    }
    @Test
    public void testGetWinner(){
        game.setWinner(GameResultEnum.COMPUTERWIN.toString());
        assertEquals(GameResultEnum.COMPUTERWIN.toString(), game.getWinner());
    }
}
