package de.jonasermert.quasiris.search.api.controller;

import com.quasiris.qsf.dto.response.SearchResponse;
import de.jonasermert.quasiris.search.api.service.SearchService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;


@Controller("SearchController")
public class SearchController {

    // "https://qsc-dev.quasiris.de/api/v1/search/ab/products?q=";


    @Autowired
    private SearchService searchService;

    public String search(@RequestParam(name = "q") String query,
                         @RequestParam(name = "f.availability", required = false) String availability,
                         @RequestParam(name = "f.suppliername", required = false) String supplierName,
                         @RequestParam(name = "f.category", required = false) String category,
                         @NotNull Model model) {
        SearchResponse searchResults = searchService.getSearchResults(query, availability, supplierName, category);
        model.addAttribute("searchResults", searchResults);
        return "index";
    }
}

