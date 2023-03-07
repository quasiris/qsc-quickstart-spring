package de.jonasermert.quasiris.search.api.controller;

import com.quasiris.qsf.dto.response.SearchResult;
import de.jonasermert.quasiris.search.api.entity.SearchQuery;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/search")
public class SearchController<search> {

    private List<SearchQuery> searchList = new ArrayList<>();

    @GetMapping
    public List<SearchQuery> getAllPersons() {
        return searchList;
    }
    @RequestMapping("/search")
    public String getSearch(@RequestParam(required=false) String query) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("https://qsc-dev.quasiris.de/api/v1/search/ab/products?q=" + query, String.class);

        return response.getBody();
    }

    @PostMapping
    public ResponseEntity<Void> addSearch(@RequestBody search search) {
        searchList.add((SearchQuery) search);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    /*
    @GetMapping("/search")
    public String search(@RequestParam("searchTerm") String searchTerm) {
        List<searchResult> results = searchService.search(searchTerm);

        return "searchResults";
    }

    @RequestMapping(method= RequestMethod.POST)
    public String submitForm(@RequestParam String query) {

     return "results";
    }
*/



}
