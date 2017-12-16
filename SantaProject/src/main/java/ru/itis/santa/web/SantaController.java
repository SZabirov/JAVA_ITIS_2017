package ru.itis.santa.web;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class SantaController {
    
    @RequestMapping(method = RequestMethod.GET, value = "/")
    String getContacts(Model model) {
        return "santa";
    }

    @GetMapping("/login")
    public String login(@ModelAttribute("model") ModelMap model, Authentication authentication,
                        @RequestParam Optional<String> error) {
        if (authentication != null) {
            return "redirect:/profile";
        }
        model.addAttribute("error", error);
        return "login";
    }

}
