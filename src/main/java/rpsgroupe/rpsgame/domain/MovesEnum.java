package rpsgroupe.rpsgame.domain;

public enum MovesEnum {
    ROCK ("ROCK"),
    PAPER ("PAPER"),
    SCISSORS ("SCISSORS");

    private final String name;
    
    MovesEnum(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
