package com.dorayaki.dorayakisupplier.dto;

public class IngredientsDate {
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return super.toString() +
                "date='" + date + '\'' +
                " || ";
    }
}
