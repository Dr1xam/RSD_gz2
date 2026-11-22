package com.ua.Brickmart.service;

import com.ua.Brickmart.web.dto.BrickCardDto;
import com.ua.Brickmart.web.dto.BrickDetailDto;
import com.ua.Brickmart.web.dto.BrickRequest;
import java.util.List;

public interface BrickService {
    List<BrickCardDto> findAll();
    BrickDetailDto findById(Long id);
    List<BrickCardDto> findAll(String brickType);
    BrickDetailDto create(BrickRequest request);
    BrickDetailDto update(Long id, BrickRequest request);
    void delete(Long id);
}
