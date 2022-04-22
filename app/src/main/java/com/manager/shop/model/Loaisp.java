package com.manager.shop.model;

public class Loaisp {
    int id;
    String  product_name;
    String images;

    public Loaisp(String product_name, String images) {
        this.product_name = product_name;
        this.images = images;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
}
