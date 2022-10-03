package cz.czechitas.java2webapps.lekce3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class ZakaznikController {

  @GetMapping("/")
  public ModelAndView home() {
    Person person = new Person("Eliška", "Krásnohorská", LocalDate.of(1974, 12, 20));

    ModelAndView modelAndView = new ModelAndView("index");
    modelAndView.addObject("person", person);
    return modelAndView;
  }
}
