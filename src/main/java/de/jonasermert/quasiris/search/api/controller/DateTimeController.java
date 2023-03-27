package de.jonasermert.quasiris.search.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller("DateTimeController")
public class DateTimeController {

    @GetMapping("/")
    public String myDateTime(Model model) {
        LocalDateTime currentTime = LocalDateTime.now();
        model.addAttribute("currentTime", currentTime);
        return "index";
    }
}
