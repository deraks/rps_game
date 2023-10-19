package rpsgroupe.rpsgame.domain;

public enum GameResult {
    DRAW ("DRAW"),
    PLAYERWIN ("PLAYERWIN"),
    COMPUTERWIN ("COMPUTERWIN");

    private final String name;
    
    GameResult(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
