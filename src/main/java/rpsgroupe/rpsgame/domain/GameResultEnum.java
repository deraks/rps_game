package rpsgroupe.rpsgame.domain;

public enum GameResultEnum {
    DRAW ("DRAW"),
    PLAYERWIN ("PLAYERWIN"),
    COMPUTERWIN ("COMPUTERWIN");

    private final String name;
    
    GameResultEnum(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
