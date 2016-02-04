package boletin5.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author igonzalezcastro
 */
public class Coche {

    private int velocidade;

    public Coche() {
        velocidade = 0;
        JOptionPane.showMessageDialog(null, "O coche arranca");

    }

    public int getVelocidade() {
        return velocidade;
    }

    public void acelerar(int valor) {
        velocidade = velocidade + valor;
        JOptionPane.showMessageDialog(null,"acelera e aumenta a : "+ velocidade + " km/h");
    }

    public void frenar(int menos) {
        velocidade = velocidade - menos;
        JOptionPane.showMessageDialog(null,"frena e diminue a : "+ velocidade + " km/h");
    }

    public void visualizar() {
        JOptionPane.showMessageDialog(null, "A velocidade final é de :" + velocidade + "km/h");
    }

}
