import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class FarmManagementApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Farm Management Application");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            Farm farm = new Farm();

            MainMenuPanel mainMenuPanel = new MainMenuPanel(frame, farm);
            frame.add(mainMenuPanel);

            frame.setVisible(true);
        });
    }
}