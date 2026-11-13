import javax.swing.*;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    public static void main(String[] args) {
        
        JFrame mainFrame = new JFrame();
        mainFrame.setResizable(false);
        mainFrame.setSize(1100, 700);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(null);


        // Background Image
        ImageIcon backgroundImage = new ImageIcon("src/images/Mainpage_bg.jpeg");
        Image resizedImage = backgroundImage.getImage().getScaledInstance(1100, 700, Image.SCALE_SMOOTH);
        ImageIcon resizedBackground = new ImageIcon(resizedImage);
        JLabel backgroundLabel = new JLabel(resizedBackground);
        backgroundLabel.setBounds(0, 0, 1100, 700);
        mainFrame.add(backgroundLabel);

        // title
        ImageIcon interfaceImage = new ImageIcon("src/images/ALIVE_title.png");
        Image resizedInterfaceImage = interfaceImage.getImage().getScaledInstance(360, 180, Image.SCALE_SMOOTH);
        ImageIcon resizedInterface = new ImageIcon(resizedInterfaceImage);
        JLabel interfaceLabel = new JLabel(resizedInterface);
        interfaceLabel.setBounds(1, 1, 360, 180);
        backgroundLabel.add(interfaceLabel);

        // background title
        ImageIcon backgroundTitleImage = new ImageIcon("src/images/ALIVE_bg.png");
        Image resizedBackgroundTitleImage = backgroundTitleImage.getImage().getScaledInstance(360, 500, Image.SCALE_SMOOTH);
        ImageIcon resizedBackgroundTitle = new ImageIcon(resizedBackgroundTitleImage);
        JLabel backgroundTitleLabel = new JLabel(resizedBackgroundTitle);
        backgroundTitleLabel.setBounds(0, 175, 370, 500);
        backgroundLabel.add(backgroundTitleLabel);

        // new game button
        ImageIcon newGameImage = new ImageIcon("src/images/NewGame.png");
        Image resizedNewGameImage = newGameImage.getImage().getScaledInstance(250, 180, Image.SCALE_SMOOTH);
        ImageIcon resizedNewGame = new ImageIcon(resizedNewGameImage);
        JLabel newGameLabel = new JLabel(resizedNewGame);
        newGameLabel.setBounds(60,50, 250, 180);
        backgroundTitleLabel.add(newGameLabel);

        // load game button
        ImageIcon loadGameImage = new ImageIcon("src/images/LoadGame.png");
        Image resizedLoadGameImage = loadGameImage.getImage().getScaledInstance(210, 140, Image.SCALE_SMOOTH);
        ImageIcon resizedLoadGame = new ImageIcon(resizedLoadGameImage);
        JLabel loadGameLabel = new JLabel(resizedLoadGame);
        loadGameLabel.setBounds(80, 150, 210, 140);
        backgroundTitleLabel.add(loadGameLabel);

        // settings button
        ImageIcon SettingsIcon = new ImageIcon("src/images/Settings.png");
        Image settingsScaled = SettingsIcon.getImage().getScaledInstance(210, 140, Image.SCALE_SMOOTH);
        ImageIcon settingsIcon = new ImageIcon(settingsScaled);
        JLabel settingsButton = new JLabel(settingsIcon);
        settingsButton.setBounds(80, 230, 210, 140);

        // hitbox kuno
        settingsButton.setCursor(
            new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)
        );

        // yung animation na aangat - may bug pa to with the hitbox kasi 
        // yung hitbox ng cursor ay hindi umaangat kasama ng button
        settingsButton.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                settingsButton.setLocation(
                    settingsButton.getX(),
                    settingsButton.getY() - 10
                );
            }

            @Override
            public void mouseExited(MouseEvent e) {
                settingsButton.setLocation(
                    settingsButton.getX(),
                    settingsButton.getY() + 10
                );
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                new Settings(mainFrame);
            }
        });
        backgroundTitleLabel.add(settingsButton);

        newGameLabel.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                newGameLabel.setLocation(
                    newGameLabel.getX(),
                    newGameLabel.getY() - 10
                );
            }

            @Override
            public void mouseExited(MouseEvent e) {
                newGameLabel.setLocation(
                    newGameLabel.getX(),
                    newGameLabel.getY() + 10
                );
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                NewCampaign.CharacterSelection();
            }
        });

        // quit button
        ImageIcon quitImage = new ImageIcon("src/images/Quit.png");
        Image resizedQuitImage = quitImage.getImage().getScaledInstance(210, 140, Image.SCALE_SMOOTH);
        ImageIcon resizedQuit = new ImageIcon(resizedQuitImage);
        JLabel quitLabel = new JLabel(resizedQuit);
        quitLabel.setBounds(80, 310, 210, 140);
        backgroundTitleLabel.add(quitLabel);


        mainFrame.setVisible(true);
    }
}