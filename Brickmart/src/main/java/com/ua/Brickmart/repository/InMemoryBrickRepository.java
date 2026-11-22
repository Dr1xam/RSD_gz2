package com.ua.Brickmart.repository;

import com.ua.Brickmart.domain.Brick;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class InMemoryBrickRepository implements BrickRepository {

    private final Map<Long, Brick> storage = new ConcurrentHashMap<>();
    private final AtomicLong sequence = new AtomicLong(0);

    @Override
    public List<Brick> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public Optional<Brick> findById(Long id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public Brick save(Brick brick) {
        if (brick.getId() == null) {
            brick.setId(sequence.incrementAndGet());
        }
        storage.put(brick.getId(), brick);
        return brick;
    }

    @Override
    public List<Brick> findByBrickType(String brickType) {
        return storage.values().stream()
                .filter(b -> brickType.equalsIgnoreCase(b.getBrickType()))
                .toList();
    }

    @Override
    public boolean deleteById(Long id) {
        return storage.remove(id) != null;
    }
}
