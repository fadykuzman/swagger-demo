package dev.codefuchs.swaggerdemo.plant;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Objects;

@Data
@AllArgsConstructor
public class Plant {

    private Long id;
    private String name;
    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return id.equals(plant.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
