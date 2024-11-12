/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author 0072379
 */
public class Impressora {

    public int codigo;
    public String nome;

    public Impressora() {
        this.codigo = -1;
        this.nome = "Default";
    }

    public Impressora(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void start() {
        System.out.println("Início da thread " + nome + "!");

        for (int i = 0; i < 20; i++) {
            int a = (int) (Math.random() * 20);
            System.out.println("Thread " + nome + ", dormindo por " + a + " segundos.");
            try {
                Thread.sleep(600);
            } catch (Exception e) {

            }
        }
        System.out.println("Fim da thread " + nome + "!");
    }
}
