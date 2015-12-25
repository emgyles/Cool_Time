import javax.swing.*;
import java.awt.*;

/**
 * Created by Emily on 12/23/15.
 */
public class Window {

    public static void main(String[] args)
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int)(screenSize.getWidth());
        int screenHeight = (int)(screenSize.getHeight());
        JFrame frame = new JFrame();
        frame.setSize(screenWidth, screenHeight);
        frame.setUndecorated(true);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.BLACK);
        Panel panel = new Panel(screenWidth, screenHeight);
        frame.add(panel);
        frame.setVisible(true);

        for(;;) {
            frame.setBackground(Color.BLACK);
            panel.repaint();
            try {
                Thread.sleep(45); //50
            } catch (Exception e) {

            }
        }

    }

}
