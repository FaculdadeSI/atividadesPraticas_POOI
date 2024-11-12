/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio1;

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
        System.out.println("Início da thread principal!");
        Impressora p1 = new Impressora(1, "Impressora A");
        Impressora p2 = new Impressora(1, "Impressora B");
        Impressora p3 = new Impressora(1, "Impressora C");
        Impressora p4 = new Impressora(1, "Impressora D");

        p1.start();
        p2.start();
        p3.start();
        p4.start();

        System.out.println("Fim da thread principal!");
    }
}
