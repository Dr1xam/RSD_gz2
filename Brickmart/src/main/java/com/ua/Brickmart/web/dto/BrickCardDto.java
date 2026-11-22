package com.ua.Brickmart.web.dto;

import java.math.BigDecimal;

public record BrickCardDto(Long id, String name, String manufacturer,
                           BigDecimal price, String photoUrl) {
}
