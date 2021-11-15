package com.dorayaki.dorayakisupplier.model;

public class Dorayaki {
    private Long id;
    private String name;
    private Long qty;
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

    public Long getQuantity() {
        return this.qty;
    }

    public void setQuantity(Long qty) {
        this.qty = qty;
    }

    public Boolean getDeniedStatus(){
        return this.is_denied;
    }
}
