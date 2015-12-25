import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Emily on 12/23/15.
 */
public class Panel extends JPanel
{
    SimpleDateFormat sdf;
    Calendar cal;
    int sW;
    int sH;
    public Panel(int sW,int sH)
    {
        this.sW = sW;
        this.sH = sH;
        setUpKeys();
    }
    @Override
    public void paint(Graphics g)
    {

        Graphics2D g2d = (Graphics2D) g;
        g2d.setBackground(new Color(15, 15, 15));

        /*for(int i = 0; i < 4; i++)
        {
            g2d.fillRoundRect(x, (sH / 4), (sW / 6), (sH / 4 - (sH / 75)), (sH / 20), (sH / 20));
            g2d.fillRoundRect(x, (sH / 2 + (sH / 75)), (sW / 6), (sH / 4 - (sH / 75)), (sH / 20), (sH / 20));
            x+= (sW/6)+(sH/40);
        }*/
       int x = (sW/2/8);
        for(int y =1; y < 6; y++)
        {
            g2d.setColor(Color.WHITE);
            g2d.setFont(new Font("Avenir", Font.PLAIN, 400));
            g2d.drawString(getTime().substring(y-1, y), (x - (sH / 60)), (sH * 4 / 6));
            x+= (sW/6)+(sH/40);
        }
        setBackground(Color.BLACK);
        setVisible(true);

    }
    public String getTime()
    {

        cal = Calendar.getInstance();
        sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(cal.getTime());
    }
    public void setUpKeys()
    {
        Action escape = new AbstractAction()
        {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        };
        getInputMap(WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "left1");
        getActionMap().put("left1", escape);
    }
}
