package com.codecool.uml.overloading;

import java.util.List;

public class Supplier {

    static int nextID = 1;

    private int id;
    private String name;
    private String description;

    public Supplier() {
        this.id = nextID;
        nextID++;
    }

    public Supplier(String name, String description) {
        this();
        this.name = name;
        this.description = description;
    }

    public List<Product> getProducts() {
        return Product.getAllProductsBy(this);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "id:" + id +
            ", name:" + name +
            ", description:" + description;
    }
}
