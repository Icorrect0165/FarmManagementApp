import java.util.ArrayList;

public class Farm {
    private ArrayList<Crop> crops = new ArrayList<>();
    private ArrayList<Livestock> livestock = new ArrayList<>();

    public synchronized void viewCropInformation() {
        if (crops.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No crops found.");
        } else {
            StringBuilder cropInfo = new StringBuilder("Crop Information:\n");
            for (Crop crop : crops) {
                cropInfo.append(crop).append("\n");
            }
            JOptionPane.showMessageDialog(null, cropInfo.toString());
        }

    }

    public synchronized void addCrop(String name, String disease) {
        Crop crop = new Crop(name, disease);
        crops.add(crop);
    }

    public synchronized void viewLivestockInformation() {
        if (livestock.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No livestock found.");
        } else {
            StringBuilder livestockInfo = new StringBuilder("Livestock Information:\n");
            for (Livestock animal : livestock) {
                livestockInfo.append(animal).append("\n");
            }
            JOptionPane.showMessageDialog(null, livestockInfo.toString());
        }
    }

    public synchronized void addLivestock(String name, String disease) {
        Livestock animal = new Livestock(name, disease);
        livestock.add(animal);
    }
}
