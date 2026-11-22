package com.ua.Brickmart.service;

import com.ua.Brickmart.domain.Brick;
import com.ua.Brickmart.exception.BrickNotFoundException;
import com.ua.Brickmart.repository.BrickRepository;
import com.ua.Brickmart.service.mapper.BrickMapper;
import com.ua.Brickmart.web.dto.BrickCardDto;
import com.ua.Brickmart.web.dto.BrickDetailDto;
import com.ua.Brickmart.web.dto.BrickRequest;
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
    public BrickDetailDto findById(Long id) {
        Brick brick = repository.findById(id)
                .orElseThrow(() -> new BrickNotFoundException(id));
        return mapper.toDetail(brick);
    }

    @Override
    public List<BrickCardDto> findAll(String brickType) {
        List<Brick> bricks = (brickType == null || brickType.isBlank())
                ? repository.findAll()
                : repository.findByBrickType(brickType);
        return bricks.stream().map(mapper::toCard).toList();
    }

    @Override
    public BrickDetailDto create(BrickRequest request) {
        Brick brick = mapper.toDomain(request);
        brick.setId(null);
        return mapper.toDetail(repository.save(brick));
    }

    @Override
    public BrickDetailDto update(Long id, BrickRequest request) {
        repository.findById(id).orElseThrow(() -> new BrickNotFoundException(id));
        Brick brick = mapper.toDomain(request);
        brick.setId(id);
        return mapper.toDetail(repository.save(brick));
    }

    @Override
    public void delete(Long id) {
        if (!repository.deleteById(id)) {
            throw new BrickNotFoundException(id);
        }
    }
}
