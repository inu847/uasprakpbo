import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.cert.CertificateRevokedException;

import static javax.swing.JOptionPane.showMessageDialog;

public class UasPrakPbo {
    private JRadioButton barang1RadioButton;
    private JRadioButton barang2RadioButton;
    private JRadioButton barang3RadioButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField tfjb1;
    private JTextField tfjb2;
    private JTextField tfjb3;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JButton totalButton;
    private JTextField tfbayar;
    private JTextField textField17;
    private JButton uangAkhirButton;
    private JButton hapusSemuaButton;
    private JButton keluarButton;
    private JPanel UasPrakPbo;

    public UasPrakPbo() {
        totalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double jb1 = 0, jb2 = 0, jb3 = 0, bayar = 0;
                try {
                    jb1 = Double.parseDouble(tfjb1.getText());
                    jb2 = Double.parseDouble(tfjb2.getText());
                    jb3 = Double.parseDouble(tfjb3.getText());
                    bayar = Double.parseDouble(tfbayar.getText());
                }catch (Exception err){
                    showMessageDialog(null, "This is even shorter");
                }
            }
        });
        barang1RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("UasPrakPbo");
        frame.setContentPane(new UasPrakPbo().UasPrakPbo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
