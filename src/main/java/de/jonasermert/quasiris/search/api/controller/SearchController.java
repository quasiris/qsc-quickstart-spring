package de.jonasermert.quasiris.search.api.controller;

import com.quasiris.qsf.dto.response.SearchResponse;
import com.quasiris.qsf.dto.response.SearchResult;
import de.jonasermert.quasiris.search.api.service.SearchService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller("SearchController")
public class SearchController {

    // "https://qsc-dev.quasiris.de/api/v1/search/ab/products?q=";


    @Autowired
    private SearchService searchService;

    @GetMapping("/search")
    public String search(@RequestParam(name = "q") String query, @NotNull Model model) {
        SearchResponse searchResults = searchService.getSearchResults(query);
        model.addAttribute("searchResults", searchResults);
        return "index";
    }


    /*

    // Anzahl der gefundenen Suchergebnisse ausgeben
    @GetMapping("/")
    public String search(@RequestParam(name = "query") String query, Model model) {
        List<SearchResult> results = searchService.search(query);
        int count = results.size(); // zählt die Anzahl der Suchergebnisse
        model.addAttribute("results", results);
        model.addAttribute("query", query);
        model.addAttribute("count", count); // fügt die Anzahl der Suchergebnisse dem Model hinzu
        return "search";
    }
*/

}

