package quidProQuo;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static JFrame frame;
    public static RoomView room;
    public static int dem = 30;
    public static int rep = 80;
    public static int nat = 50;
    public static int year = 1;
    public static ArrayList<Decision> majors;
    public static void main(final String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                StartView start = new StartView();
                frame = new JFrame("Quid Pro Quo");
                frame.setContentPane(start);
                frame.pack();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);


            }
        });
    }
}
