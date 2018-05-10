package menu;

import user.Iuser;

import javax.swing.*;

public class Menu implements Imenu{
    private JPanel menuPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

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
        if(user.getAuth() == false) {
            button5.setVisible(false);
            button4.setVisible(false);
        }
    }
}
