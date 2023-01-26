package dev.codefuchs.swaggerdemo;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/plant")
public class PlantController {

    @Operation
    @GetMapping
    public ResponseEntity<Plant> getPlant() {
        var plant = new Plant(1L, "plant", "this is a plant");
        return ResponseEntity.of(Optional.of(plant));
    }
}
