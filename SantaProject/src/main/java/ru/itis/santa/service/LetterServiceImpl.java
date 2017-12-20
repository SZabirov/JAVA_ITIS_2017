package ru.itis.santa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.santa.dao.LetterRepository;
import ru.itis.santa.model.Letter;

import java.util.List;

@Service
public class LetterServiceImpl implements LetterService {
    @Autowired
    LetterRepository letterRepository;

    @Override
    public Letter addLetter(Letter letter) {
       return letterRepository.save(letter);
    }

    @Override
    public List<Letter> getByName(String name) {
        List<Letter> letterList = letterRepository.findByName(name);
        return letterList;
    }
}
