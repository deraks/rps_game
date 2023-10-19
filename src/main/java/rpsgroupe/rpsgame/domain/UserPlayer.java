package rpsgroupe.rpsgame.domain;

import jakarta.persistence.*;

@Entity
public class UserPlayer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer score;
    private Integer draws;
    private Integer games;
    public Integer getScore() {
        return score;
    }
    public void setScore(Integer score) {
        this.score = score;
    }
    public Integer getDraws() {
        return draws;
    }
    public void setDraws(Integer draws) {
        this.draws = draws;
    }
    public Integer getGames() {
        return games;
    }
    public void setGames(Integer games) {
        this.games = games;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

}
