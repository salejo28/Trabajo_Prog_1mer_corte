import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Index
 */
public class Index extends JFrame implements ActionListener {

    JButton avion, barco, tanque, reiniciar, acelerar, despegar, arriba, disparar, detener, aterrizar, abajo,
            detDisparo;

    JTextField velocidad;
    JLabel label1;

    KeyListener l = new KeyListener() {
        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

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

        /* Buttons */
        /* Vehicles */
        tanque = new JButton("Tanque");
        tanque.setBounds(10, 20, 100, 30);
        add(tanque);

        avion = new JButton("Avion");
        avion.setBounds(120, 20, 100, 30);
        add(avion);

        barco = new JButton("Barco");
        barco.setBounds(230, 20, 100, 30);
        add(barco);

        tanque.addActionListener(this);
        avion.addActionListener(this);
        barco.addActionListener(this);

        /* Actions */
        reiniciar = new JButton("Reiniciar");
        reiniciar.setBounds(340, 20, 100, 30);
        add(reiniciar);

        acelerar = new JButton("Acelerar");
        acelerar.setBounds(450, 20, 100, 30);
        add(acelerar);

        despegar = new JButton("Despegar");
        despegar.setBounds(560, 20, 100, 30);
        add(despegar);

        arriba = new JButton("Arriba");
        arriba.setBounds(670, 20, 100, 30);
        add(arriba);

        disparar = new JButton("Dispara");
        disparar.setBounds(340, 60, 100, 30);
        add(disparar);

        detener = new JButton("Detener");
        detener.setBounds(450, 60, 100, 30);
        add(detener);

        aterrizar = new JButton("Aterrizar");
        aterrizar.setBounds(560, 60, 100, 30);
        add(aterrizar);

        abajo = new JButton("Abajo");
        abajo.setBounds(670, 60, 100, 30);
        add(abajo);

        detDisparo = new JButton("Det Disparo");
        detDisparo.setBounds(340, 130, 150, 30);
        add(detDisparo);

        reiniciar.addActionListener(this);
        acelerar.addActionListener(this);
        despegar.addActionListener(this);
        arriba.addActionListener(this);
        disparar.addActionListener(this);
        detener.addActionListener(this);
        aterrizar.addActionListener(this);
        abajo.addActionListener(this);
        detDisparo.addActionListener(this);

        /* Label */
        label1 = new JLabel("Velocidad");
        label1.setBounds(560, 110, 100, 10);
        add(label1);

        /* JTextField */
        velocidad = new JTextField();
        velocidad.setBounds(560, 130, 150, 30);
        add(velocidad);

        velocidad.addKeyListener(l);

    }

    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        Index index = new Index();

        index.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        index.setBounds(0, 0, 800, 400);
        index.setVisible(true);
        index.setResizable(false);
        index.setLocationRelativeTo(null);
    }
}