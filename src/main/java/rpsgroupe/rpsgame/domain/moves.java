package rpsgroupe.rpsgame.domain;

public enum Moves {
    ROCK ("ROCK"),
    PAPER ("PAPER"),
    SCISSORS ("SCISSORS");

    private final String name;
    
    Moves(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
