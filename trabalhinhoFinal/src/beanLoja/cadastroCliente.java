/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beanLoja;

import java.util.Scanner;

/**
 *
 * @author meram
 */
public class cadastroCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //aqui é onde mostra a associação feita
        Scanner scan = new Scanner(System.in);
        ClienteVO p = new ClienteVO();

        int codC, tel, num;
        String cep, bairro, nome, cidade, pais;

        System.out.print("Digite o código de cadastro do cliente: ");
        codC = scan.nextInt();

        System.out.print("Digite o nome do cliente: ");
        nome = scan.next();

        System.out.print("Digite a telefone do cliente: ");
        tel = scan.nextInt();

        System.out.println("Agora, digite os dados do endereço do cliente: ");

        System.out.print("Bairro: ");
        bairro = scan.next();

        System.out.print("CEP: ");
        cep = scan.next();

        System.out.print("Cidade: ");
        cidade = scan.next();

        System.out.print("Número: ");
        num = scan.nextInt();

        System.out.print("País: ");
        pais = scan.next();

        p.codigo_de_cadastro = codC;
        p.nome = nome;
        p.telefone = tel;
        p.end = new Endereco();
        p.end.bairro = bairro;
        p.end.cep = cep;
        p.end.cidade = cidade;
        p.end.numero = num;
        p.end.pais = pais;

        System.out.print("//____________Cliente cadastrado com sucesso____________// " + "\n");

        System.out.println("Código do cliente: " + p.codigo_de_cadastro + "\n"
                + "Nome: " + p.nome + "\n"
                + "Telefone: " + p.telefone + "\n");
        
        System.out.print("//____________Endereço do cliente cadastrado____________// " + "\n");
        
        System.out.println("Bairro: " + p.end.bairro + "\n"
                + "CEP: " +p.end.cep  + "\n"
                + "Cidade: " + p.end.cidade + "\n"
                + "Número: " + p.end.numero + "\n"
                + "País: " + p.end.pais);          
    }
}
