package rpsgroupe.rpsgame.services;

import java.util.Random;

import org.springframework.stereotype.Service;

import rpsgroupe.rpsgame.domain.Moves;

@Service
public class ComputerServiceImpl implements ComputerService {
    public Moves getMove() {
        Moves[] moves = Moves.values();
        Random random = new Random();
        int index = random.nextInt(moves.length);
        return moves[index];
    }
    
}
