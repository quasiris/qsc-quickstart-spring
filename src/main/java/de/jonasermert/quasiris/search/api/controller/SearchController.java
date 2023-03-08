package de.jonasermert.quasiris.search.api.controller;

import de.jonasermert.quasiris.search.api.entity.Product;
import de.jonasermert.quasiris.search.api.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;

@Controller
public class SearchController {

    @Autowired
    private SearchService productSearchService;

    /*
    public ProductSearchController(ProductSearchService productSearchService) {
        this.productSearchService = productSearchService;
    }
    */

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/index")
    public String searchProducts(@RequestParam String query, Model model) {
        try {
            List<Product> products = productSearchService.searchProducts(query);
            model.addAttribute("products", products);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "searchResults";
    }



}
