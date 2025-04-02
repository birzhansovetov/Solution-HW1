package Proxy;

public class ImageProxy implements Image {
    private String fileName;
    private RealImage realImage;
    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Displaying thumbnail for: " + fileName);
    }

    @Override
    public void loadFullImage() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
