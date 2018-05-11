package menu;

import utils.user.Iuser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements Imenu{
    private JPanel menuPanel;
    private JButton skladoveZasobyButton;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    public Menu() {
        skladoveZasobyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    @Override
    public void initializeMenu(JFrame frame) {
        frame.setVisible(false);
        frame.setContentPane(menuPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void setTypeOfMenu(Iuser user) {

    }
}
