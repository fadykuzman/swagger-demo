package dev.codefuchs.swaggerdemo.plant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/plant")
public class PlantController {
    @GetMapping
    public ResponseEntity<Plant> getPlant() {
        var plant = new Plant(1L, "plant", "this is a plant");
        return ResponseEntity.of(Optional.of(plant));
    }
}
