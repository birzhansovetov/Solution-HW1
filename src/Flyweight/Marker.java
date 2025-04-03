package Flyweight;

public class Marker {
    private int x;
    private int y;
    private String label;
    private final MarkerStyle style;

    public Marker(int x, int y, String label, MarkerStyle style) {
        this.x = x;
        this.y = y;
        this.label = label;
        this.style = style;
    }

    public void render() {
        style.display(x, y, label);
    }
}

