import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class FuelConsumption {
    public JTextField txtDistanceTraveler, txtFuelConsumption, txtFuelCost;
    public JButton calculateButton, clearButton;
    public JPanel Main;
    public JLabel totalFuel;


    public static void main(String[] args) {
        JFrame frame = new JFrame("FuelConsumption");
        frame.setContentPane(new FuelConsumption().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public FuelConsumption() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalFuel();
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearData();

            }
        });

    }
    public void clearData(){
        txtDistanceTraveler.setText("");
        txtFuelConsumption.setText("");
        txtFuelCost.setText("");
        totalFuel.setText("");


    }

    public void totalFuel() {
        double num1 = Double.parseDouble(txtDistanceTraveler.getText());
        double num2 = Double.parseDouble(txtFuelConsumption.getText());
        double num3 = Double.parseDouble(txtFuelCost.getText());
        double value = (num1/100)*num2*num3;
        totalFuel.setText(df.format(value) + " lei");

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
    private static final DecimalFormat df = new DecimalFormat("0.00");
}
