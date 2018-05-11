import menu.Menu;
import utils.user.User;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        JFrame f = new JFrame("Menu.java");
        User kokotko = new User();
        kokotko.setAuth(false);
        menu.setTypeOfMenu(kokotko);
        menu.initializeMenu(f);

    }
}
