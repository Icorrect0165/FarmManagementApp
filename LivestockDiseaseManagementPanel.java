import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LivestockDiseaseManagementPanel extends JPanel {
    public LivestockDiseaseManagementPanel(JFrame frame, Farm farm) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JButton viewLivestockInfoButton = new JButton("View Livestock Information");
        viewLivestockInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ViewLivestockInformationWorker(frame, farm).execute();
            }
        });

        JButton addLivestockButton = new JButton("Add Livestock");
        addLivestockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String livestockName = JOptionPane.showInputDialog("Enter livestock name:");
                String livestockDisease = JOptionPane.showInputDialog("Enter livestock disease:");
                farm.addLivestock(livestockName, livestockDisease);
                JOptionPane.showMessageDialog(null, "Livestock added successfully!");
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

        add(viewLivestockInfoButton);
        add(addLivestockButton);
        add(backButton);
    }
}

