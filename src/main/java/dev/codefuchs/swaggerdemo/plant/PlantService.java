package dev.codefuchs.swaggerdemo.plant;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlantService {
    private List<Plant> plants = new ArrayList<>(){
        {
            add(new Plant(1L, "plant1", "this is plant1"));
            add(new Plant(2L, "plant2", "this is plant2"));
            add(new Plant(3L, "plant3", "this is plant3"));
        }

    };
    public List<Plant> getAll() {
        return plants;
    }

    public int addPlant(Plant plant) {

        if (plants.contains(plant)) {
            System.out.println("found a duplicate");
            return -1;
        }
        plants.add(plant);
        return 0;
    }
}
