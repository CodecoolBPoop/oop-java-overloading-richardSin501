package com.codecool.uml.overloading;

import java.util.List;

public class ProductCategory {

    static int nextID = 1;

    private int id;
    private String name = null;
    private String department = null;
    private String description = null;

    public ProductCategory() {
        this.id = nextID;
        nextID++;
    }

    public ProductCategory(String name, String department, String description) {
        this();
        this.name = name;
        this.department = department;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return
            "id:" + id + ",name:" + name + ",department:" + department + ",description:"
                + description;
    }
}
