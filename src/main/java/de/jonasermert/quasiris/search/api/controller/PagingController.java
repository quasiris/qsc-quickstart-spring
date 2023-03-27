package de.jonasermert.quasiris.search.api.controller;
/*
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PagingController {

    private static final String API_URL = "https://qsc-dev.quasiris.de/api/v1/search/ab/products?q=wago";
    private static final int PAGE_SIZE = 10;

    @GetMapping("/products")
    public String getPaging(@RequestParam(defaultValue = "1") int page, Model model) {

        int startIndex = (page - 1) * PAGE_SIZE;

        String apiUrl = API_URL + "&start=" + startIndex + "&rows=" + PAGE_SIZE;

        Pager pager = searchResult.getPager();
        int totalResults = pager.getTotal();
        int totalPages = pager.getPages();

        model.addAttribute("totalPages", totalPages);
        model.addAttribute("currentPage", page);

        return "facet";
    }


}
*/