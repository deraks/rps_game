package rpsgroupe.rpsgame.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rpsgroupe.rpsgame.domain.*;
import rpsgroupe.rpsgame.repositories.UserPlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService {
    private UserPlayerRepository userPlayerRepository;

    @Autowired
    public void setProductRepository(UserPlayerRepository userPlayerRepository) {
        this.userPlayerRepository = userPlayerRepository;
    }
    public Moves getMove() {
        // Выведем запрос на ввод
        System.out.print("Камень, ножницы или бумага? ");
    
        // Прочитаем ввод пользователя
        String userInput ="sadfsadfasdf";// inputScanner.nextLine();
        userInput = userInput.toUpperCase();
        char firstLetter = userInput.charAt(0);
        if (firstLetter == 'К' || firstLetter == 'Н' || firstLetter == 'Б') {
            // Ввод корректный
            switch (firstLetter) {
            case 'К':
                return Moves.ROCK;
            case 'Н':
                return Moves.PAPER;
            case 'Б':
                return Moves.SCISSORS;
            }
        }
        
        // Ввод некорректный. Выведем запрос на ввод снова.
        return getMove();
    }
    @Override
    public UserPlayer saveUSerPlayer(UserPlayer userPlayer) {
        return userPlayerRepository.save(userPlayer);
    }
}
