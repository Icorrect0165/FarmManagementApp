import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuPanel extends JPanel {
    public MainMenuPanel(JFrame frame, Farm farm) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JButton cropManagementButton = new JButton("Crop Management");
        cropManagementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.add(new CropManagementPanel(frame, farm));
                frame.revalidate();
                frame.repaint();
            }
        });

        JButton livestockDiseaseButton = new JButton("Livestock Disease Management");
        livestockDiseaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.add(new LivestockDiseaseManagementPanel(frame, farm));
                frame.revalidate();
                frame.repaint();
            }
        });

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exiting Farm Management Application. Goodbye!");
                System.exit(0);
            }
        });

        add(cropManagementButton);
        add(livestockDiseaseButton);
        add(exitButton);
    }
}
