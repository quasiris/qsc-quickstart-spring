package de.jonasermert.quasiris.search.api.entity;

import org.springframework.context.annotation.Bean;

public class Product {

    /*
     "supplierId": "170002",
        "name": "WAGO 2003-7692 Abschlussplatte und Zwischenplatte orange",
        "sku": "2101675"
     */

    private String name;
    private String sku;
    private Long supplierId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }
}
