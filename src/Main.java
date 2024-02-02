import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500, 500);


        MyPanel panel = new MyPanel();
        //panel.setBackground(Color.RED);


        frame.add(panel);
        frame.pack();
        frame.setVisible(true);


    }
}