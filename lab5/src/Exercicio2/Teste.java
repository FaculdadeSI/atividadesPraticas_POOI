/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio2;

/**
 *
 * @author 0072379
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Início da Thread principal!");
        Impressora p1 = new Impressora(1, "Impressora A");
        Impressora p2 = new Impressora(1, "Impressora B");
        Impressora p3 = new Impressora(1, "Impressora C");
        Impressora p4 = new Impressora(1, "Impressora D");

        /*Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(p4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();*/

        p1.run();
        p2.run();
        p3.run();
        p4.run();

        /*Professor, resolvi colocar .run, pois o jeito que você havia explicado com o .start, como comentado acima, 
          fazia com que a saída das impressoras fossem aleatórias e não em ordem como no exercício 1.*/

        System.out.println("Fim da Thread principal!");
    }
}
