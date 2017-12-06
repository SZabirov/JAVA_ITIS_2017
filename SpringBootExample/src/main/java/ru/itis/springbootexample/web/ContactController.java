package ru.itis.springbootexample.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.itis.springbootexample.model.Contact;
import ru.itis.springbootexample.service.ContactService;

import java.util.List;

@RestController
public class ContactController {
    @Autowired
    ContactService contactService;

    @RequestMapping(method = RequestMethod.GET, value = "/contacts")
    List<Contact> getContacts() {
        return contactService.getAllContacts();
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
