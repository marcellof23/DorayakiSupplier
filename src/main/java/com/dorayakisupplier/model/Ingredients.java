package com.dorayakisupplier.model;

public class Ingredients {
    private String name;
    private Long qty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQuantity() {
        return this.qty;
    }

    public void setQuantity(Long qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", qty=" + qty +
                '}';
    }
}
