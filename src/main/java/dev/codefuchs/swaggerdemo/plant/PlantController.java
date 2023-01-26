package dev.codefuchs.swaggerdemo.plant;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Tag(name = "Plant", description = "the Plant Api")
@RestController
@RequestMapping("/plant")
public class PlantController {
    @Autowired
    private PlantService service;

    @Operation(summary = "Fetch all plants", description = "fetches all plant entities and their data from data source")
    @GetMapping("/all")
    public ResponseEntity<List<Plant>> getAll() {
        var plants = service.getAll();
        return ResponseEntity.ok(plants);
    }
}
