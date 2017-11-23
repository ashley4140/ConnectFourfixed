import java.awt.*;
import javax.swing.*;

public class GameBoard extends JFrame{

    //public static void main(String args[]) {
    public GameBoard(){
        //JFrame frame = new JFrame("Connect Four");
        JPanel panel = new JPanel();
        panel.setBackground(Color.green);
        panel.setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Menu");
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
        //setSize(350, 250);
        //frame.setVisible(true);
        setSize(760, 700);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //column buttons
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();
        JButton button5 = new JButton();
        JButton button6 = new JButton();
        JButton button7 = new JButton();


        button1.setBackground(Color.white);
        button2.setBackground(Color.white);
        button3.setBackground(Color.white);
        button4.setBackground(Color.white);
        button5.setBackground(Color.white);
        button6.setBackground(Color.white);
        button7.setBackground(Color.white);

        button1.setText("Column 1");
        button2.setText("Column 2");
        button3.setText("Column 3");
        button4.setText("Column 4");
        button5.setText("Column 5");
        button6.setText("Column 6");
        button7.setText("Column 7");


        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);

        button1.setFont(new Font("Arial", Font.BOLD, 15));
        button2.setFont(new Font("Arial", Font.BOLD, 15));
        button3.setFont(new Font("Arial", Font.BOLD, 15));
        button4.setFont(new Font("Arial", Font.BOLD, 15));
        button5.setFont(new Font("Arial", Font.BOLD, 15));
        button6.setFont(new Font("Arial", Font.BOLD, 15));
        button7.setFont(new Font("Arial", Font.BOLD, 15));

        //column images
        JLabel line1 = new JLabel();
        line1.setIcon(new ImageIcon("boardline.jpg"));
        panel.add(line1);

        JLabel line2 = new JLabel();
        line2.setIcon(new ImageIcon("boardline.jpg"));
        panel.add(line2);


        JLabel line3 = new JLabel();
        line3.setIcon(new ImageIcon("boardline.jpg"));
        panel.add(line3);

        JLabel line4 = new JLabel();
        line4.setIcon(new ImageIcon("boardline.jpg"));
        panel.add(line4);

        JLabel line5 = new JLabel();
        line5.setIcon(new ImageIcon("boardline.jpg"));
        panel.add(line5);

        JLabel line6 = new JLabel();
        line6.setIcon(new ImageIcon("boardline.jpg"));
        panel.add(line6);

        JLabel line7 = new JLabel();
        line7.setIcon(new ImageIcon("boardline.jpg"));
        panel.add(line7);

        Container cpane = getContentPane();
        cpane.add(panel);

        //setVisible(true);





    }



}
