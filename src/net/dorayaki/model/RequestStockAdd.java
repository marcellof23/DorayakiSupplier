package net.dorayaki.model;

public class RequestStockAdd {
    private Long id;
    private String dorayakiName;
    private Long qty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
                "id=" + id +
                ", dorayakiName='" + dorayakiName + '\'' +
                ", qty=" + qty +
                '}';
    }
}
