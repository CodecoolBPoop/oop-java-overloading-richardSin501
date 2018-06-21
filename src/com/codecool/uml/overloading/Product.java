package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Product {

    static int nextID = 1;
    private static List<Product> productList = new ArrayList<>();

    private int id;
    private String name;
    private float defaultPrice;
    private Currency defaultCurrency;
    private ProductCategory productCategory;
    private Supplier supplier;

    public Product() {
        this.id = nextID;
        nextID++;
    }

    public Product(String name, float defaultPrice, Currency defaultCurrency) {
        this();
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = defaultCurrency;
    }

    static List<Product> getAllProductsBy(ProductCategory productCategory) {
        List<Product> filteredProductList = new ArrayList<>();
        for (Product product : productList) {
            if (product.getProductCategory().getId() == productCategory.getId()) {
                filteredProductList.add(product);
            }
        }
        return filteredProductList;
    }

    static List<Product> getAllProductsBy(Supplier supplier) {
        List<Product> filteredProductList = new ArrayList<>();
        for (Product product : productList) {
            if (product.getSupplier().getId() == supplier.getId()) {
                filteredProductList.add(product);
            }
        }
        return filteredProductList;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
