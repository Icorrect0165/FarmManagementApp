import javax.swing.*;
import java.util.List;

public class ViewCropInformationWorker extends SwingWorker<List<Crop>, Void> {
    private Farm farm;

    public ViewCropInformationWorker(Farm farm) {
        this.farm = farm;
    }

    @Override
    protected List<Crop> doInBackground() throws Exception {
        // Perform potentially time-consuming task (e.g., fetching crop information)
        return farm.getCrops();
    }

    @Override
    protected void done() {
        try {
            List<Crop> crops = get();
            if (crops.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No crops found.");
            } else {
                StringBuilder cropInfo = new StringBuilder("Crop Information:\n");
                for (Crop crop : crops) {
                    cropInfo.append(crop).append("\n");
                }
                JOptionPane.showMessageDialog(null, cropInfo.toString());
            }
        } catch (Exception e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }
}
