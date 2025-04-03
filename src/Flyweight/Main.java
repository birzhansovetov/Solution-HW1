package Flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Marker> markers = new ArrayList<>();
        Random random = new Random();

        MarkerStyle gasStyle = MarkerStyleFactory.getMarkerStyle("gas", "red", "bold");
        MarkerStyle restaurantStyle = MarkerStyleFactory.getMarkerStyle("restaurant", "blue", "italic");
        MarkerStyle hospitalStyle = MarkerStyleFactory.getMarkerStyle("hospital", "green", "normal");

        MarkerStyle[] styles = {gasStyle, restaurantStyle, hospitalStyle};

        for (int i = 0; i < 20; i++) {
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            String label = "Place " + i;

            MarkerStyle style = styles[random.nextInt(styles.length)];

            Marker marker = new Marker(x, y, label, style);
            markers.add(marker);
        }

        for (Marker marker : markers) {
            marker.render();
        }

        System.out.println("\nTotal markers created: " + markers.size());
        System.out.println("Unique marker styles created: " + MarkerStyleFactory.getStyleCount());
        System.out.println("Memory saved: " + (markers.size() - MarkerStyleFactory.getStyleCount()) + " style objects avoided");
    }
}
