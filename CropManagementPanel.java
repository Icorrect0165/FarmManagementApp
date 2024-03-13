import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CropManagementPanel extends JPanel {
    public CropManagementPanel(JFrame frame, Farm farm) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JButton viewCropInfoButton = new JButton("View Crop Information");
        viewCropInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ViewCropInformationWorker(frame, farm).execute();
            }
        });

        JButton addCropButton = new JButton("Add Crop");
        addCropButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cropName = JOptionPane.showInputDialog("Enter crop name:");
                String cropDisease = JOptionPane.showInputDialog("Enter crop disease:");
                farm.addCrop(cropName, cropDisease);
                JOptionPane.showMessageDialog(null, "Crop added successfully!");
            }
        });

        JButton backButton = new JButton("Back to Main Menu");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.add(new MainMenuPanel(frame, farm));
                frame.revalidate();
                frame.repaint();
            }
        });

        add(viewCropInfoButton);
        add(addCropButton);
        add(backButton);
    }
}
