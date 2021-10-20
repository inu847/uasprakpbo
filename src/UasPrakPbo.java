import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.security.cert.CertificateRevokedException;

import static javax.swing.JOptionPane.showMessageDialog;

public class UasPrakPbo {
    private JRadioButton barang1RadioButton;
    private JRadioButton barang2RadioButton;
    private JRadioButton barang3RadioButton;
    private JTextField tfhb1;
    private JTextField tfhb2;
    private JTextField tfhb3;
    private JTextField tfjb1;
    private JTextField tfjb2;
    private JTextField tfjb3;
    private JTextField tfhbd1;
    private JTextField tfhbd2;
    private JTextField tfhbd3;
    private JTextField tfth1;
    private JTextField tfth2;
    private JTextField tfth3;
    private JTextField tfTotalPembayaran;
    private JTextField tf5Persen;
    private JTextField tfpsd;
    private JButton totalButton;
    private JTextField tfbayar;
    private JTextField tfua;
    private JButton uangAkhirButton;
    private JButton hapusSemuaButton;
    private JButton keluarButton;
    private JPanel UasPrakPbo;

    public UasPrakPbo() {
        totalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double jb1 = 0, jb2 = 0, jb3 = 0, vhb1, vhb2, vhb3, diskon1persen = 0.01, hargaDiskon1Persen, hargaTotal;
                vhb1 = Double.parseDouble(tfhb1.getText());
                vhb2 = Double.parseDouble(tfhb2.getText());
                vhb3 = Double.parseDouble(tfhb3.getText());
                try {
                    jb1 = Double.parseDouble(tfjb1.getText());
                    jb2 = Double.parseDouble(tfjb2.getText());
                    jb3 = Double.parseDouble(tfjb3.getText());
//                    bayar = Double.parseDouble(tfbayar.getText());
                }catch (Exception err){
                    showMessageDialog(null, "This is even shorter");
                }

//                del a

            }
        });
        barang1RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(barang1RadioButton.isSelected()){
                    tfhb1.setText("25000");
                }else{
                    tfhb1.setText("0");
                }
            }
        });
        barang2RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(barang2RadioButton.isSelected()){
                    tfhb2.setText("50000");
                }else{
                    tfhb2.setText("0");
                }
            }
        });
        barang3RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(barang3RadioButton.isSelected()){
                    tfhb3.setText("75000");
                }else{
                    tfhb3.setText("0");
                }
            }
        });
        UasPrakPbo.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                tfhb1.setText("0");
                tfhb2.setText("0");
                tfhb3.setText("0");
            }
        });
        uangAkhirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double bayar, hargapsd, uangAkhir;
                hargapsd = Double.parseDouble(tfpsd.getText());
                bayar = Double.parseDouble(tfbayar.getText());

                uangAkhir = bayar - hargapsd;
                if (uangAkhir >= 0) {
                    showMessageDialog(null, "Uang Kembalian : "+uangAkhir);
                }else{
                    showMessageDialog(null, "Uang Kurang : "+uangAkhir);
                }
                tfua.setText(String.valueOf(uangAkhir));
            }
        });
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
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
