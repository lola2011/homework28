package exam2;

import java.awt.*;

public class Bag {
    private Color colors;
    private double volume;

    public Bag(){

    }
    public Bag(Color colors, double volume) {
        this.colors = colors;
        this.volume = volume;
    }

    public Color getColors() {
        return colors;
    }

    public void setColors(Color colors) {
        this.colors = colors;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
