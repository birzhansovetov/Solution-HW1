package Proxy;

public class Main {
    public static void main(String[] args) {
        ImageProxy image = new ImageProxy("villa.jpg");
        ImageProxy image2 = new ImageProxy("villa2.jpg");

        image.display();
        image2.display();

        image.loadFullImage();
        image2.loadFullImage();

        ImageUploader protectedImage = new ImageUploader("villa3.jpg",false);
        protectedImage.upload("newVilla.jpg");
        ImageUploader agentImage = new ImageUploader("villa4.jpg",true);
        agentImage.upload("newVilla.jpg");
    }
}
