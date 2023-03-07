package de.jonasermert.quasiris.search.api.service;

import de.jonasermert.quasiris.search.api.entity.SearchFilter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.Map;


public class SearchQueryBuilderService {

    private String searchQuery;
    private String urlParameter;

    // Suchstring und übergebene Paramter nach dem ? zusammenführen
    private String buildSearchQuery(String searchQuery, String urlParameter ) {
        // String finishedQuery = searchQuery + urlParameter;
        String finishedQuery = searchQuery.concat(urlParameter);
        // System.out.println(finishedQuery);
        return finishedQuery;
    }

    // Verbindung zwischen Suche und Filter herstellen
    public void addFilterToSearch(String id, String value) {
        SearchFilter searchFilter = new SearchFilter();
        searchFilter.setId(id);
        searchFilter.addValue(value);
    }

    @GetMapping("/search/{urlparameter}")
    public String SearchService(@PathVariable("urlParameter") String urlParameter) {
        Map<String, String> results = new HashMap<>();
        results.put("urlParameter", urlParameter);
        results.put("searchQuery", searchQuery);
        return urlParameter + searchQuery;
    }

    public static boolean isNumber(Object value) {
        if(value == null) {
            return false;
        }
        return true;
    }

    public static boolean isString(String value) {
        if(value == null) {
            return false;
        }
        return true;

    }


}
