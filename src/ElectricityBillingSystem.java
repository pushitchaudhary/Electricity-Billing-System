import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElectricityBillingSystem {
    private JTextArea textDisplay;
    private JTextField textCustomerID;
    private JTextField textCustomerName;
    private JTextField txtUnit;
    private JButton okButton;
    private JButton CLEARButton;
    private JPanel main;

    public void print(){
        double unitPrice=0;
        String customerName = textCustomerName.getText();
        String customerId = textCustomerID.getText();
        int unit = Integer.parseInt(txtUnit.getText());

        if(unit>=1 && unit <100){
            unitPrice = unit*1.5;
        }else if (unit>=100 && unit<200){
             unitPrice = unit*2.5;
        }else if (unit>=300 && unit <400){
            unitPrice = unit* 3.5;
        }else if(unit>=400 && unit<500){
            unitPrice = unit*4.5;
        }else if(unit>=500){
            unitPrice = unit*5.5;
        }

        textDisplay.setText(textDisplay.getText()+"\n");
        textDisplay.setText(textDisplay.getText() + "Welcome To Electricity Billing System 😎" + "\n");
        textDisplay.setText(textDisplay.getText() + "\n");
        textDisplay.setText(textDisplay.getText()+ "Customer Id: " + customerId + "\n");
        textDisplay.setText(textDisplay.getText() + "\n");
        textDisplay.setText(textDisplay.getText()+"Customer Name: "+ customerName +"\n");
        textDisplay.setText(textDisplay.getText()+"\n");
        textDisplay.setText(textDisplay.getText()+"Unit Price: " +String.valueOf(unitPrice));
    }

    public void clear(){
        textDisplay.setText("");
        textCustomerID.setText("");
        textCustomerName.setText("");
        txtUnit.setText("");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ElectricityBillingSystem");
        frame.setContentPane(new ElectricityBillingSystem().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public ElectricityBillingSystem() {
    okButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            print();
        }
    });
        CLEARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clear();
            }
        });
    }
}
