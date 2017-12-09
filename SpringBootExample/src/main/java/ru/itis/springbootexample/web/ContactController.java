package ru.itis.springbootexample.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.springbootexample.model.Contact;
import ru.itis.springbootexample.service.ContactService;

import java.util.List;

@Controller
public class ContactController {
    @Autowired
    ContactService contactService;

    @RequestMapping(method = RequestMethod.GET, value = "/contacts")
    String getContacts(Model model) {
        List <Contact> contactList = contactService.getAllContacts();
        model.addAttribute(contactList);
        return "contacts";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/contacts/{id}")
    Contact getContact (@PathVariable Long id) {
        return contactService.getContact(id);
    }

    @RequestMapping(method = RequestMethod.GET, params = "name", value = "/contacts")
    List<Contact> getContactsByName (@RequestParam String name) {
        return contactService.getContactsByName(name);
    }
}
