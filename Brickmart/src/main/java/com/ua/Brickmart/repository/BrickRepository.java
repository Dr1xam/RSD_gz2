package com.ua.Brickmart.repository;

import com.ua.Brickmart.domain.Brick;
import java.util.List;
import java.util.Optional;

public interface BrickRepository {
    List<Brick> findAll();
    Optional<Brick> findById(Long id);
    Brick save(Brick brick);
    List<Brick> findByBrickType(String brickType);
    boolean deleteById(Long id);
}
