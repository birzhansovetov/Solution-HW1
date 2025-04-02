package Proxy;

public class RealImage implements Image {
    private String fileName;
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFullImage();
    }
    @Override
    public void loadFullImage() {
        System.out.println("[RealImage] Loading high-res image: " + fileName);
    }
    @Override
    public void display() {
        System.out.println("[RealImage] Displaying image: " + fileName);
    }
}
