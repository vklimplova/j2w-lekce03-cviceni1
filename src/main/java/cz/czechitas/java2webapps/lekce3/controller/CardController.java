package cz.czechitas.java2webapps.lekce3.controller;

import cz.czechitas.java2webapps.lekce3.entity.Address;
import cz.czechitas.java2webapps.lekce3.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller

public class CardController {

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView result = new ModelAndView("card");

        Person person = new Person();
        person.setGivenName("Eliška");
        person.setSurname("Krásnohorská");
        person.setPhotoURL("https://thispersondoesnotexist.com/");
        person.setBirthDate(LocalDate.of(1847,11,18));

        Address address = new Address();
        address.setStreetName("Česká 1");
        address.setCity("Brno");
        address.setZipCode("621 00");


        result.addObject("person", person);
        result.addObject("address", address);
        return result;
    }
}
