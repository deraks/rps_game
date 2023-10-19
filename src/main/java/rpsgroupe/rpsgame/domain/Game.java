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
    private Moves move;
    private Moves playerMove;
    private Moves computerMove; 
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
    public Moves getMove() {
        return move;
    }
    public void setMove(Moves move) {
        this.move = move;
    }
    public Moves getPlayerMove() {
        return playerMove;
    }
    public void setPlayerMove(Moves playerMove) {
        this.playerMove = playerMove;
    }
    public Moves getComputerMove() {
        return computerMove;
    }
    public void setComputerMove(Moves computerMove) {
        this.computerMove = computerMove;
    }
    public String getWinner() {
        return winner;
    }
    public void setWinner(String winner) {
        this.winner = winner;
    }
   
}
