package Testar;

//@author 0072379
import Principal.Conjunto;
import Principal.Ponto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TestarPonto {

    public static void main(String[] args) {

        Conjunto c1 = new Conjunto(1, "c1");
        System.out.println(c1);
        Ponto p1 = new Ponto("p1", 5, 10);
        if (c1.adicionarPonto(p1) >= 0) {
            System.out.println("Sucesso!");
        } else {
            System.out.println("Erro!");
        }
        System.out.println(c1);
        /*
        System.out.println("Início do programa principal.");

        String text = null;
        Ponto p1 = null;
        double x = 0, y = 0;
        String descricao = null;

        ArrayList listaPontos = new ArrayList();

        do {

            descricao = JOptionPane.showInputDialog("Digite o valor da descrição: ");

            text = JOptionPane.showInputDialog("Digite o valor de X: ");
            x = Double.parseDouble(text);

            if (x < 0) {

                break;

            }

            text = JOptionPane.showInputDialog("Digite o valor de Y: ");
            y = Double.parseDouble(text);

            p1 = new Ponto(descricao, x, y);

            if (y < 0) {

                break;

            }

            if (p1 != null) {

                listaPontos.add(p1);

                System.out.println("p1.size() = " + listaPontos.size());

            }

            JOptionPane.showMessageDialog(null, "Ponto P " + p1);

        } while ((x >= 0) && (y >= 0));

        Ponto temp = null;

        for (int i = 0; i < listaPontos.size(); i++) {

            temp = (Ponto) listaPontos.get(i);

            JOptionPane.showMessageDialog(null, "Objeto " + (i + 1) + " = " + temp);

        }

        JOptionPane.showMessageDialog(null, "Fim!");
         */
    }

}
