import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloForm {
    private JPanel panel1;
    private JLabel testLabel;
    private JButton testButton;

    public JPanel getPanel1() {
        return panel1;
    }

    public HelloForm() {
        testButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTestLabel("NAZDAR KOKOTE");
            }
        });
    }


    public void setTestLabel(String text) {

        testLabel.setText(text);

    }


}
