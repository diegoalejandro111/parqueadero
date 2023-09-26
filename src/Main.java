

 import javax.swing.JOptionPane;
 import java.awt.*;

 public class Main {

    public static void main(String[]args) {
        char letra;

        letra = JOptionPane.showInputDialog("digite una letra: ").charAt(0);

        if (Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null,"esta es una letra mayuscula");
        }
        else {
            JOptionPane.showMessageDialog(null,"es una letra minuscula");
        }
    }
}