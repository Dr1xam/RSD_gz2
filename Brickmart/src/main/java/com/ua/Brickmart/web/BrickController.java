package com.ua.Brickmart.web;

import com.ua.Brickmart.service.BrickService;
import com.ua.Brickmart.web.dto.BrickCardDto;
import com.ua.Brickmart.web.dto.BrickDetailDto;
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
    public List<BrickCardDto> list() {
        return brickService.findAll();
    }

    @GetMapping("/{id}")
    public BrickDetailDto getOne(@PathVariable Long id) {
        return brickService.findById(id);
    }
}
