package JavaCertifikation.ToyMarket.Service;

import java.util.Map;

public class Toy {
    int id;
    String name;
    int quantity;
    int chance;


    public Toy(int id, String name, int quantity, int chance) {
        this.name = name;
        this.quantity = quantity;
        this.chance = chance;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    @Override
    public String toString() {
        return '\n' + "ID: " + id + ", Name: " + name + ", Quantity: " + quantity + ", Chance: " + chance;
    }
}
