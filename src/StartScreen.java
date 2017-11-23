import java.awt.event.*;
import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import java.awt.*;


public class StartScreen {

    public static void main(String args[]) {

        JFrame frame = new JFrame("Connect Four");
        JPanel panel = new JPanel();
        panel.setBackground(Color.green);
        panel.setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Menu");
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        frame.setSize(350, 250);
        frame.setVisible(true);
        frame.setResizable(false);
        //yes/no actionbuttons
        JButton yes = new JButton();
        JButton no = new JButton("CLOSE");

        yes.setBackground(Color.white);
        no.setBackground(Color.white);

        yes.setText("YES");
        no.setText("NO");

        panel.add(yes);
        panel.add(no);
        //Size and Style
        yes.setFont(new Font("Arial", Font.BOLD, 20));
        no.setFont(new Font("Arial", Font.BOLD, 20));

//open command
        yes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                MyBoard gb = new MyBoard();

                //gb.setVisible(true);


                Player player1 = new Player("Ollie",18);
                Player player2 = new Player("Tyler",17);

            }
        });
        //Close command
        no.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Leaving so soon are we Batman I guess the Joker really is better than you \n\n                         Come Back when you really want to fight!");
                System.exit(0);
            }
        });

        //start image
        JLabel front = new JLabel();
        front.setIcon(new ImageIcon("Front Screen3.jpg"));
        panel.add(front);

        frame.add(panel);
        frame.setSize(945, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
