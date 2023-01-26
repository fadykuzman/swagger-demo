package dev.codefuchs.swaggerdemo.plant;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/plant")
public class PlantController implements PlantApi {
    @Autowired
    private PlantService service;

    @Override
    @GetMapping(value = "/all", produces = "application/json")
    public ResponseEntity<List<Plant>> getAll() {
        var plants = service.getAll();
        return ResponseEntity.ok(plants);
    }

    @Override
    @PostMapping
    public ResponseEntity<Void> addPlant(Plant plant) {
        var result = service.addPlant(plant);
        if (result == -1)
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
