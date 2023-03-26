package de.jonasermert.quasiris.search.api.controller;

/*
import com.quasiris.qsf.dto.response.SearchResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;


@Controller
public class FacetController {

    private final RestTemplate restTemplate;

    public FacetController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/facets")
    public String getFacets(Model model) {
        String url = "https://qsc-dev.quasiris.de/api/v1/search/ab/products?q=wago";
        SearchResponse response = restTemplate.getForObject(url, SearchResponse.class);
        model.addAttribute("facets", response.getFacets());
        return "facets";
    }

}

*/