package Proxy;

public class ImageUploader {
    private boolean isLoggedIn;
    private ImageProxy imageProxy;

    public ImageUploader(String fileName, boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
        this.imageProxy = new ImageProxy(fileName);
    }

    public void upload(String newFileName) {
        if (!isLoggedIn) {
            System.out.println("[ImageUploader] Access denied. Login required to upload: " + newFileName);
        } else {
            System.out.println("[ImageUploader] Upload successful: " + newFileName);
        }
    }

    public void preview() {
        imageProxy.display();
    }

    public void loadAndDisplay() {
        imageProxy.loadFullImage();
        imageProxy.display();
    }
}
