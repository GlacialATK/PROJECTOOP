import javax.swing.*;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;




public class NewCampaign {
public static void main(String[] args) {
    
       JFrame Newcamp = new JFrame();
       Newcamp.setResizable(false);
       Newcamp.setSize(1100, 700);
       Newcamp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Newcamp.setLayout(null);


        ImageIcon backgroundImage = new ImageIcon("src/images/Mainpage_bg.jpeg");
        Image resizedImage = backgroundImage.getImage().getScaledInstance(1100, 700, Image.SCALE_SMOOTH);
        ImageIcon resizedBackground = new ImageIcon(resizedImage);
        JLabel backgroundLabel = new JLabel(resizedBackground);
        backgroundLabel.setBounds(0, 0, 1100, 700);
        Newcamp.add(backgroundLabel);

        
    
    Newcamp.setVisible(true);
    
}












}


    

