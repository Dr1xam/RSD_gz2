package com.ua.Brickmart.service.mapper;

import com.ua.Brickmart.domain.Brick;
import com.ua.Brickmart.web.dto.BrickCardDto;
import com.ua.Brickmart.web.dto.BrickDetailDto;
import com.ua.Brickmart.web.dto.BrickRequest;
import org.springframework.stereotype.Component;

@Component
public class BrickMapper {

    public BrickCardDto toCard(Brick b) {
        return new BrickCardDto(b.getId(), b.getName(), b.getManufacturer(),
                b.getPrice(), b.getPhotoUrl());
    }

    public BrickDetailDto toDetail(Brick b) {
        return new BrickDetailDto(b.getId(), b.getName(), b.getManufacturer(), b.getPrice(),
                b.getWeight(), b.getPhotoUrl(), b.getDescription(), b.getBrickType());
    }

    public Brick toDomain(BrickRequest r) {
        Brick b = new Brick();
        b.setName(r.name());
        b.setManufacturer(r.manufacturer());
        b.setPrice(r.price());
        b.setWeight(r.weight());
        b.setBrickType(r.brickType());
        b.setPhotoUrl(r.photoUrl());
        b.setDescription(r.description());
        return b;
    }
}
