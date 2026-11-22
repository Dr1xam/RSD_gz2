package com.ua.Brickmart.service;

import com.ua.Brickmart.domain.Brick;
import com.ua.Brickmart.exception.BrickNotFoundException;
import com.ua.Brickmart.repository.BrickRepository;
import com.ua.Brickmart.service.mapper.BrickMapper;
import com.ua.Brickmart.web.dto.BrickCardDto;
import com.ua.Brickmart.web.dto.BrickDetailDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrickServiceImpl implements BrickService {

    private final BrickRepository repository;
    private final BrickMapper mapper;

    public BrickServiceImpl(BrickRepository repository, BrickMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<BrickCardDto> findAll() {
        return repository.findAll().stream().map(mapper::toCard).toList();
    }

    @Override
    public BrickDetailDto findById(Long id) {
        Brick brick = repository.findById(id)
                .orElseThrow(() -> new BrickNotFoundException(id));
        return mapper.toDetail(brick);
    }
}
