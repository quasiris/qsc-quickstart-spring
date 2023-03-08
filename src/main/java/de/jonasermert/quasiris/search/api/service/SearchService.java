package de.jonasermert.quasiris.search.api.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.jonasermert.quasiris.search.api.entity.Product;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {

    private static final String BASE_URL = "https://qsc-dev.quasiris.de/api/v1/search/ab/products?q=";

    public List<Product> searchProducts(String query) throws IOException {
        String url = BASE_URL + query;
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        httpGet.addHeader("accept", "application/json");
        HttpResponse httpResponse = httpClient.execute(httpGet);
        HttpEntity httpEntity = httpResponse.getEntity();
        String json = EntityUtils.toString(httpEntity);
        ObjectMapper objectMapper = new ObjectMapper();
        ProductsResponse productsResponse = objectMapper.readValue(json, ProductsResponse.class);
        return productsResponse.getProducts();
    }

    private static class ProductsResponse {
        private List<Product> products;

        public List<Product> getProducts() {
            return products != null ? products : new ArrayList<>();
        }

        public void setProducts(List<Product> products) {
            this.products = products;
        }
    }
}
