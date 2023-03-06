package Tugas1_123210151.Abstrack;

public abstract class Abstrack {
    String color;

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }

    public abstract float getLuas();
}
