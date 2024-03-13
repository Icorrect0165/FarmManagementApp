import javax.swing.*;
import java.util.List;

public class ViewLivestockInformationWorker extends SwingWorker<List<Livestock>, Void> {
    private JFrame frame;
    private Farm farm;

    public ViewLivestockInformationWorker(JFrame frame, Farm farm) {
        this.frame = frame;
        this.farm = farm;
    }

    @Override
    protected List<Livestock> doInBackground() throws Exception {
        // Perform potentially time-consuming task (e.g., fetching livestock information)
        return farm.getLivestock();
    }

    @Override
    protected void done() {
        try {
            List<Livestock> livestock = get();
            if (livestock.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No livestock found.");
            } else {
                StringBuilder livestockInfo = new StringBuilder("Livestock Information:\n");
                for (Livestock animal : livestock) {
                    livestockInfo.append(animal).append("\n");
                }
                JOptionPane.showMessageDialog(null, livestockInfo.toString());
            }
        } catch (Exception e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }
}

