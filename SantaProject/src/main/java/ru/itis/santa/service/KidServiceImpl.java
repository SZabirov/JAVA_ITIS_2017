package ru.itis.santa.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.santa.dao.KidsRepository;
import ru.itis.santa.dao.LetterRepository;
import ru.itis.santa.dao.UserRepository;
import ru.itis.santa.model.Kid;
import ru.itis.santa.model.Letter;
import ru.itis.santa.model.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class KidServiceImpl implements KidService {
    @Autowired
    KidsRepository kidsRepository;

    @Autowired
    LetterRepository letterRepository;

    @Autowired
    UserRepository userRepository;


    @Override
    public List<Kid> getAllKids() {
        List<User> users = (List<User>)userRepository.findAll();

        List<Kid> kidList = new ArrayList<>();
        for (User user : users) {
            Kid kid = new Kid();
            kid.setId(user.getId());
            kid.setName(user.getUsername());
            kid.setRating(10);//FIXME
            List<Letter> letters = letterRepository.findAllByUser(user);
            if (letters != null && letters.isEmpty()) {
                kid.setEmailExists(true);
                kid.setLetterId(letters.get(letters.size() - 1).getId());
            }
            kidList.add(kid);
        }
        return kidList;
    }
}
