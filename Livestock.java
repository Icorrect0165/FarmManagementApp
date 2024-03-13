public class Livestock {
    private String name;
    private String disease;

    public Livestock(String name, String disease) {
        this.name = name;
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "Livestock: " + name + ", Disease: " + disease;
    }
}
