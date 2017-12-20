package ru.itis.santa.service;


import ru.itis.santa.model.Letter;

import java.util.List;

public interface LetterService {
    Letter addLetter(Letter letter);
    List<Letter> getByName(String name);
}
