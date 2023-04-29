package de.jonasermert.quasiris.search.api.service;

import com.quasiris.qsf.dto.response.SearchResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;


@Service("SearchService")
public class SearchService {

    public SearchResponse getSearchResults(@RequestParam("q") String query,
                                           @RequestParam(value = "f.availability", required = false) String availability,
                                           @RequestParam(value = "f.suppliername", required = false) String supplierName,
                                           @RequestParam(value = "f.category", required = false) String category){
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://qsc-dev.quasiris.de/api/v1/search/ab/products?q=" + query;
        if (availability != null) {
            url += "&f.availability=" + availability;
        }
        if (supplierName != null) {
            url += "&f.suppliername=" + supplierName;
        }
        if (category != null) {
            url += "&f.category=" + category;
        }
        SearchResponse searchResults = restTemplate.getForObject(url, SearchResponse.class);
        return searchResults;
    }


}










