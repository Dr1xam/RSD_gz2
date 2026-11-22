package com.ua.Brickmart.config;

import com.ua.Brickmart.domain.Brick;
import com.ua.Brickmart.repository.BrickRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BrickSeeder implements ApplicationRunner {

    private final BrickRepository repository;

    public BrickSeeder(BrickRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) {
        repository.save(new Brick(null, "Цегла рядова повнотіла М150", "Керамейя",
                new BigDecimal("9.50"), 3500, "/photos/ryadova-m150.jpg",
                "Класична червона цегла для несучих стін і фундаментів.", "Керамічна"));
        repository.save(new Brick(null, "Цегла облицювальна пустотіла", "Євротон",
                new BigDecimal("14.80"), 2600, "/photos/oblytsyuvalna.jpg",
                "Рівна гладка поверхня для фасадного опорядження.", "Керамічна"));
        repository.save(new Brick(null, "Цегла силікатна М200", "Сілікат-Буд",
                new BigDecimal("8.20"), 3700, "/photos/sylikatna-m200.jpg",
                "Біла цегла з вапна та піску, висока міцність.", "Силікатна"));
        repository.save(new Brick(null, "Клінкерна цегла Графіт", "Клінкер Плюс",
                new BigDecimal("32.00"), 2900, "/photos/klinker-grafit.jpg",
                "Морозостійка цегла з низьким водопоглинанням для фасадів і доріжок.", "Клінкерна"));
        repository.save(new Brick(null, "Цегла шамотна ША-8", "Вогнетрив",
                new BigDecimal("27.50"), 3400, "/photos/shamotna-sha8.jpg",
                "Вогнетривка цегла для печей, камінів і барбекю.", "Шамотна"));
    }
}
