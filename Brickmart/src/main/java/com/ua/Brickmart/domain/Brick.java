package com.ua.Brickmart.domain;

import java.math.BigDecimal;

public class Brick {
    private Long id;
    private String name;
    private String manufacturer;
    private BigDecimal price;
    private Integer weight;
    private String photoUrl;       // фото (для картки)
    private String description;    // опис (для сторінки цеглини)
    private String brickType;

    public Brick() {
    }

    public Brick(Long id, String name, String manufacturer, BigDecimal price,
                 Integer weight, String photoUrl, String description, String brickType) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.weight = weight;
        this.photoUrl = photoUrl;
        this.description = description;
        this.brickType = brickType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrickType() {
        return brickType;
    }

    public void setBrickType(String brickType) {
        this.brickType = brickType;
    }
}
