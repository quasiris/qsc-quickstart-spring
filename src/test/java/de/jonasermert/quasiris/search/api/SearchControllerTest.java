package de.jonasermert.quasiris.search.api;

import de.jonasermert.quasiris.search.api.controller.SearchController;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

@WebMvcTest(SearchController.class)
public class SearchControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void searchTest() throws Exception {
        String query = "wago";
        String apiUrl = "https://qsc-dev.quasiris.de/api/v1/search/ab/products?q=" + query;

        RestTemplate restTemplate = new RestTemplate();
        Mockito.when(restTemplate.getForObject(apiUrl, String.class));

    }












}
