package com.dorayakisupplier.model;

public class RequestDorayakiStock {
    private Long dorayakirequest_id;
    private String dorayakiName;
    private Long qty;

    public Long getId() {
        return dorayakirequest_id;
    }

    public void setId(Long id) {
        this.dorayakirequest_id = id;
    }

    public String getDorayakiName() {
        return dorayakiName;
    }

    public void setDorayakiName(String dorayakiName) {
        this.dorayakiName = dorayakiName;
    }

    public Long getQuantity() {
        return this.qty;
    }

    public void setQuantity(Long qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "RequestAddStock{" +
                "dorayakirequest_id=" + dorayakirequest_id +
                ", dorayakiName='" + dorayakiName + '\'' +
                ", qty=" + qty +
                '}';
    }
}
