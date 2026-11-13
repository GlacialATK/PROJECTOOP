
import javax.swing.*;
import java.awt.*;

public class Settings {

    public Settings(JFrame parent) {

        // transparent dark overlay sa background ng Main JFrame
        JPanel dimBackground = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.setColor(new Color(0, 0, 0, 150));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        dimBackground.setOpaque(false);

        // Apply the dark overlay to the Main JFrame
        parent.setGlassPane(dimBackground);
        dimBackground.setVisible(true);

        // Create Settings Dialog
        JDialog settingsDialog = new JDialog(parent, "Settings", true);
        settingsDialog.setSize(550, 350);
        settingsDialog.setResizable(false);
        settingsDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        settingsDialog.setLayout(null);
        settingsDialog.setLocationRelativeTo(parent);

        // Settings background
        settingsDialog.getContentPane().setBackground(
            new Color(65, 45, 40)
        );

        // Settings title
        JLabel title = new JLabel("SETTINGS", SwingConstants.CENTER);
        title.setBounds(100, 30, 350, 50);
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setForeground(Color.WHITE);
        settingsDialog.add(title);

        // Close button - To be replaced with an icon
        JButton closeButton = new JButton("X");
        closeButton.setBounds(480, 10, 50, 40);
        closeButton.setFocusPainted(false);

        closeButton.addActionListener(e -> {
            settingsDialog.dispose();
        });

        settingsDialog.add(closeButton);

        // Display Settings
        settingsDialog.setVisible(true);

        // Remove the dark overlay after Settings closes
        dimBackground.setVisible(false);
    }
}
