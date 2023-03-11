package de.jonasermert.quasiris.search.api.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class SearchController {

    @GetMapping("/{results-container}")
    public String search(@RequestParam(name="q") String query, Model model) {
        String apiUrl = "https://qsc-dev.quasiris.de/api/v1/search/ab/products?q=" + query;
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(apiUrl, String.class);
        model.addAttribute("result", result);
        return result;
    }

}
