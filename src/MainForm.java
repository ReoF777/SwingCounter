import javax.swing.*;

public class MainForm extends JFrame {
    private JPanel MainPanel;
    private JButton PlusButton;
    private JButton MinusButton;
    private JLabel Count;
    private int counter = 0;
    private final int MAX = 10;
    private final int MIN = -5;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new MainForm().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public MainForm() {
        Count.setText(String.valueOf(counter));
        Count.setFont(Count.getFont().deriveFont(24.0f));
        PlusButton.addActionListener(_ -> {
            if(counter <MAX){
               counter++;
               Count.setText(String.valueOf(counter));
            }
            else{
                JOptionPane.showMessageDialog(PlusButton, "Counter is at maximum value");
            }
        });

        MinusButton.addActionListener(_ -> {
            if(counter > MIN){
                counter--;
                Count.setText(String.valueOf(counter));
            }
            else{
                JOptionPane.showMessageDialog(MinusButton, "Counter is at minimum value");
            }
        });
    }
}
