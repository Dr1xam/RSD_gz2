package com.ua.Brickmart.service;

import com.ua.Brickmart.web.dto.BrickCardDto;
import com.ua.Brickmart.web.dto.BrickDetailDto;
import java.util.List;

public interface BrickService {
    List<BrickCardDto> findAll();
    BrickDetailDto findById(Long id);
}
