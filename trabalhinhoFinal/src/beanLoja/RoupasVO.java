/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beanLoja;

/**
 *
 * @author meram
 */
public class RoupasVO {
    
    public int codigo_da_peca, qtd_peca, codigo_fabricante;
    public String cor, categoria;
    public double preco;
    
    //classe mãe
    public RoupasVO(int codigo_da_peca, int qtd_peca, int codigo_fabricante, String cor, String categoria, double preco) {
        this.codigo_da_peca = codigo_da_peca;
        this.qtd_peca = qtd_peca;
        this.codigo_fabricante = codigo_fabricante;
        this.cor = cor;
        this.categoria = categoria;
        this.preco = preco;
    }//classe principal

    public RoupasVO() {

    }
    //aqui é feito a herança de classes
    /**
     *
     */
    //classe filha
    static class Pedido extends RoupasVO {

        public String cliente;
        public int pecas;

        public Pedido() {
        }
    }//subclasse

    public int getCodigo_da_peca() {
        return codigo_da_peca;
    }

    public void setCodigo_da_peca(int codigo_da_peca) {
        this.codigo_da_peca = codigo_da_peca;
    }

    public int getQtd_peca() {
        return qtd_peca;
    }

    public void setQtd_peca(int qtd_peca) {
        this.qtd_peca = qtd_peca;
    }

    public int getCodigo_fabricante() {
        return codigo_fabricante;
    }

    public void setCodigo_fabricante(int codigo_fabricante) {
        this.codigo_fabricante = codigo_fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
