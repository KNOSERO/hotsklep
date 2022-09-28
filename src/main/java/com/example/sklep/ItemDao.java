package com.example.sklep;

public class ItemDao {
    private String name;
    private String price;
    private Long count;

    public ItemDao(String name, String price, Long count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public ItemDao() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
