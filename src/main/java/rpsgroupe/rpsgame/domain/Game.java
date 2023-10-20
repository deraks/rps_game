package rpsgroupe.rpsgame.domain;

import jakarta.persistence.*;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    private MovesEnum move;
    private MovesEnum playerMove;
    private MovesEnum computerMove; 
    private String winner;
    private Integer draws;
    private Integer playerWins;
    private Integer computerWins;
    public Game() {}

    public Integer getDraws() {
        return draws;
    }
    public void setDraws(Integer draws) {
        this.draws = draws;
    }
    public Integer getPlayerWins() {
        return playerWins;
    }
    public void setPlayerWins(Integer playerWins) {
        this.playerWins = playerWins;
    }
    public Integer getComputerWins() {
        return computerWins;
    }
    public void setComputerWins(Integer computerWins) {
        this.computerWins = computerWins;
    }
    public MovesEnum getMove() {
        return move;
    }
    public void setMove(MovesEnum move) {
        this.move = move;
    }
    public MovesEnum getPlayerMove() {
        return playerMove;
    }
    public void setPlayerMove(MovesEnum playerMove) {
        this.playerMove = playerMove;
    }
    public MovesEnum getComputerMove() {
        return computerMove;
    }
    public void setComputerMove(MovesEnum computerMove) {
        this.computerMove = computerMove;
    }
    public String getWinner() {
        return winner;
    }
    public void setWinner(String winner) {
        this.winner = winner;
    }
   
}
