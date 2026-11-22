package com.ua.Brickmart.web.dto;

import java.math.BigDecimal;

public record BrickDetailDto(Long id, String name, String manufacturer, BigDecimal price,
                             Integer weight, String photoUrl, String description, String brickType) {
}
