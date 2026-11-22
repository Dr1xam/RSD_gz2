package com.ua.Brickmart.web;

import com.ua.Brickmart.service.BrickService;
import com.ua.Brickmart.web.dto.BrickCardDto;
import com.ua.Brickmart.web.dto.BrickDetailDto;
import com.ua.Brickmart.web.dto.BrickRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bricks")
public class BrickController {

    private final BrickService brickService;

    public BrickController(BrickService brickService) {
        this.brickService = brickService;
    }

    @GetMapping
    public List<BrickCardDto> list(@RequestParam(required = false) String brickType) {
        return brickService.findAll(brickType);
    }

    @GetMapping("/{id}")
    public BrickDetailDto getOne(@PathVariable Long id) {
        return brickService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BrickDetailDto create(@RequestBody BrickRequest request) {
        return brickService.create(request);
    }

    @PutMapping("/{id}")
    public BrickDetailDto update(@PathVariable Long id, @RequestBody BrickRequest request) {
        return brickService.update(id, request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        brickService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
