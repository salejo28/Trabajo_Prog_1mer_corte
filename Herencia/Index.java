import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * 
 * Index
 */
public class Index extends JFrame implements ActionListener {

    JButton suma, resta, mult, divi, mcd, mcm, menorN, pow;
    JTextField numberInput1, numberInput2;
    JLabel label1, label2;
    double n1, n2;

    KeyListener listener = new KeyListener() {
        public void keyPressed(KeyEvent event) {

        }

        @Override
        public void keyReleased(KeyEvent event) {

        }

        @Override
        public void keyTyped(KeyEvent e) {
            char valid = e.getKeyChar();

            if (Character.isLetter(valid)) {
                getToolkit().beep();
                e.consume();

                JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros");
            }

        }
    };

    public Index() {
        setLayout(null);

        /* Labels and JTextsFields */
        label1 = new JLabel("Ingrese un numero");
        label1.setBounds(10, 30, 200, 15);
        add(label1);

        label2 = new JLabel("Ingrese un numero");
        label2.setBounds(220, 30, 200, 15);
        add(label2);

        numberInput1 = new JTextField();
        numberInput1.setBounds(10, 45, 200, 30);
        add(numberInput1);

        numberInput2 = new JTextField();
        numberInput2.setBounds(220, 45, 200, 30);
        add(numberInput2);

        numberInput1.addKeyListener(listener);
        numberInput2.addKeyListener(listener);

        /* Buttons */
        suma = new JButton("Suma");
        suma.setBounds(10, 85, 100, 30);
        add(suma);

        resta = new JButton("Resta");
        resta.setBounds(120, 85, 100, 30);
        add(resta);

        mult = new JButton("Multiplicacion");
        mult.setBounds(10, 130, 100, 30);
        add(mult);

        divi = new JButton("Division");
        divi.setBounds(120, 130, 100, 30);
        add(divi);

        mcd = new JButton("MCD");
        mcd.setBounds(230, 85, 100, 30);
        add(mcd);

        mcm = new JButton("mcm");
        mcm.setBounds(230, 130, 100, 30);
        add(mcm);

        menorN = new JButton("N° Menor");
        menorN.setBounds(340, 85, 100, 30);
        add(menorN);

        pow = new JButton("Potencia");
        pow.setBounds(340, 130, 100, 30);
        add(pow);


        suma.addActionListener(this);
        resta.addActionListener(this);
        mult.addActionListener(this);
        divi.addActionListener(this);
        mcd.addActionListener(this);
        mcm.addActionListener(this);
        menorN.addActionListener(this);
        pow.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        n1 = Double.parseDouble(numberInput1.getText());
        n2 = Double.parseDouble(numberInput2.getText());

        if (e.getSource() == suma) {
            Suma sum = new Suma(n1, n2);
            JOptionPane.showMessageDialog(rootPane, sum.showResult());
        }

        if (e.getSource() == resta) {
            Resta rest = new Resta(n1, n2);
            JOptionPane.showMessageDialog(rootPane, rest.showResult());
        }

        if (e.getSource() == mult) {
            Mult multi = new Mult(n1, n2);
            JOptionPane.showMessageDialog(rootPane, multi.showResult());
        }

        if (e.getSource() == divi) {
            Divi div = new Divi(n1, n2);
            JOptionPane.showMessageDialog(rootPane, div.showResult());
        }

        if (e.getSource() == mcd) {
            MCD m = new MCD(n1,n2);
            JOptionPane.showMessageDialog(rootPane, m.showMessageResult());
        }

        if (e.getSource() == mcm) {
            MCM mc = new MCM(n1, n2);
            JOptionPane.showMessageDialog(rootPane, mc.showMessageResult());
        }

        if (e.getSource() == menorN) {
            nMenor nmenor = new nMenor(n1, n2);
            JOptionPane.showMessageDialog(rootPane, nmenor.showMessageResult());
        }

        if (e.getSource() == pow) {
            Potencia pot = new Potencia(n1, n2);
            JOptionPane.showMessageDialog(rootPane, pot.showResult());
        }

    }

    public static void main(String[] args) {
        Index index = new Index();

        index.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        index.setBounds(0, 0, 600, 300);
        index.setVisible(true);
        index.setResizable(false);
        index.setLocationRelativeTo(null);
    }
}
