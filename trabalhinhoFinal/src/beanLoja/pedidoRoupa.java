package beanLoja;

import beanLoja.RoupasVO.Pedido;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author meram
 */
public class pedidoRoupa {
    //teste de pedido que possui herança
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Pedido pedidoNovo = new Pedido();

        int codP, qtd, codF, peca;
        String cor, categoria, cliente;
        Double preco;

        System.out.print("Digite o código da peça: ");
        codP = scan.nextInt();

        System.out.print("Digite a cor da peça: ");
        cor = scan.next();

        System.out.print("Digite o preço da peça: ");
        preco = scan.nextDouble();

        System.out.print("Digite a quantidade de peças disponíveis no estoque: ");
        qtd = scan.nextInt();

        System.out.print("Digite a categoria da peça: ");
        categoria = scan.next();

        System.out.print("Digite o código do fabricante: ");
        codF = scan.nextInt();

        System.out.print("Digite o nome do cliente: ");
        cliente = scan.next();

        System.out.print("Digite quantas peças o cliente deseja: ");
        peca = scan.nextInt();

        pedidoNovo.codigo_da_peca = codP;
        pedidoNovo.cor = cor;
        pedidoNovo.preco = preco;
        pedidoNovo.qtd_peca = qtd;
        pedidoNovo.categoria = categoria;
        pedidoNovo.codigo_fabricante = codF;
        pedidoNovo.cliente = cliente;
        pedidoNovo.pecas = peca;

        System.out.print("//_______________________________________// " + "\n");
        int totalEstoque = qtd - peca;
        if (totalEstoque > 0 && peca <= qtd) {
            System.out.println("O pedido pode ser feito!" + "\n"
                    + "Total de itens no estoque depois da retirada: " + totalEstoque);

            System.out.print("//_______________________________________// " + "\n");

            System.out.println("Código da peça: " + pedidoNovo.codigo_da_peca + "\n"
                    + "Cor: " + pedidoNovo.cor + "\n"
                    + "Quantidade disponível: " + pedidoNovo.qtd_peca + "\n"
                    + "Preço da peça: " + pedidoNovo.preco + "\n"
                    + "Categoria: " + pedidoNovo.categoria + "\n"
                    + "Código do Fabricante: " + pedidoNovo.codigo_fabricante + "\n"
                    + "Cliente: " + pedidoNovo.cliente + "\n"
                    + "Quantidade de peças do pedido: " + pedidoNovo.pecas);
        } else {
            System.out.println("Pedido não pode ser feito, estoque insuficiente!" + "\n"
                    + "Total do estoque: " + totalEstoque);
        }
    }
}
