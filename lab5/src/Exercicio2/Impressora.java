/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;

/**
 *
 * @author 0072379
 */
public class Impressora implements Runnable {

    public String nome;
    public int codigo;

    public Impressora() {
        this.codigo = -1;
        this.nome = "Default";
    }

    public Impressora(int codigo, String nome) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public void run() {

        System.out.println("Início  da Thread " + nome + "!");

        // TODO Auto-generated method stub
        for (int i = 0; i < 20; i++) {
            int a = (int) (Math.random() * 20);
            System.out.println("Thread " + nome + ", dormindo por " + a + " segundos.");
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {

            }
        }
        System.out.println("Fim Thread " + nome + "!");
    }
}
