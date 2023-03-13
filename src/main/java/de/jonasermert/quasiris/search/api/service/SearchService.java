package de.jonasermert.quasiris.search.api.service;

import com.quasiris.qsf.dto.response.SearchResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service("SearchService")
public class SearchService {

    public SearchResponse getSearchResults(String query) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://qsc-dev.quasiris.de/api/v1/search/ab/products?q=" + query;
        SearchResponse searchResults = restTemplate.getForObject(url, SearchResponse.class);
        return searchResults;
    }

}










