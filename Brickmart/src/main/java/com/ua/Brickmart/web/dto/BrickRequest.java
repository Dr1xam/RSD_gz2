package com.ua.Brickmart.web.dto;

public record BrickRequest(
        String name, String manufacturer, java.math.BigDecimal price,
        Integer weight, String brickType, String photoUrl, String description
) {}
