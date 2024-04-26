package edu.iu.habahram.coffeeorder.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "coffee")
public final class Receipt {
    @Id
    private int id;
    private String description;
    private float cost;

    public Receipt() {
    }

    public Receipt(int id, String description, float cost) {
        this.id = id;
        this.description = description;
        this.cost = cost;
    }
}
