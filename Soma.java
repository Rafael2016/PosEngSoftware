import javax.swing.JOptionPane;

public class Soma {

    public static void main(String[] args) {

        int VetSoma[], i, soma = 0;
        VetSoma = new int[6];

        for (i = 0; i <= 5; i++) {

            VetSoma[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

            soma = soma + VetSoma[i];

        }

        System.out.println("A soma é : " + soma);

    }

}
