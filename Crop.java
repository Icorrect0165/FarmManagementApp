public class Crop {
    private String name;
    private String disease;

    public Crop(String name, String disease) {
        this.name = name;
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "Crop: " + name + ", Disease: " + disease;
    }
}
