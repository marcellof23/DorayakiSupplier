package com.dorayakisupplier.model;

public class DorayakiVariant {
    private Long id;
    private String name;
    private Long stock;
    private Boolean is_denied;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStock() {
        return this.stock;
    }

    public void setStock(Long qty) {
        this.stock = qty;
    }

    public Boolean getDeniedStatus(){
        return this.is_denied;
    }
}
