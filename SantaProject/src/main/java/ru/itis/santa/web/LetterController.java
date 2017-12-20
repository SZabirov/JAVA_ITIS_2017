package ru.itis.santa.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.santa.dao.UserRepository;
import ru.itis.santa.model.Letter;
import ru.itis.santa.model.User;
import ru.itis.santa.service.LetterService;

import java.util.List;

@Controller
public class LetterController {

    @Autowired
    LetterService letterService;
    @Autowired
    UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/letter")
    String getForm(Model model) {
        return "letter";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/letter")
    String getLetter(@RequestParam String name, @RequestParam String email, @RequestParam int age, @RequestParam String letterText) {
        User user = userRepository.findByUsername(((org.springframework.security.core.userdetails.User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername());
        Letter letter = new Letter();
        letter.setAge(age);
        letter.setEmail(email);
        letter.setLetter(letterText);
        letter.setName(name);
        letter.setUser(user);
        letterService.addLetter(letter);
        return "redirect:/thanks";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/thanks")
    String thanks(Model model) {
        return "letterthanks";//redirect on thanks page
    }

    @RequestMapping(method = RequestMethod.GET, value = "/letter/{name}")
    String getLetter (@PathVariable String name , Model model) {
        List<Letter> letterList = letterService.getByName(name);
        model.addAttribute(letterList);//FIXME НАДО ДОБАВИТЬ РЕДИРЕКТ НА ПИСЬМО ПО ID
        return "mailtable";
    }

}