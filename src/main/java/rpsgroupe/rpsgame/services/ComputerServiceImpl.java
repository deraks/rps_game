package rpsgroupe.rpsgame.services;

import java.util.Random;

import org.springframework.stereotype.Service;

import rpsgroupe.rpsgame.domain.MovesEnum;

@Service
public class ComputerServiceImpl implements ComputerService {
    public MovesEnum getMove() {
        MovesEnum[] moves = MovesEnum.values();
        Random random = new Random();
        int index = random.nextInt(moves.length);
        return moves[index];
    }
    
}
