/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanLoja;

/**
 *
 * @author Cliente
 */
public class ClienteVO {

    public int codigo_de_cadastro;
    public int telefone;
    public String nome;
    public Endereco end = new Endereco(); //associação de objeto/classe

    public ClienteVO(int codigo_de_cadastro, int telefone, String nome, Endereco end) {
        this.codigo_de_cadastro = codigo_de_cadastro;
        this.telefone = telefone;
        this.nome = nome;
        this.end = end;
    }

    public ClienteVO() {
        
    }

    public int getcodigo_de_cadastro() {
        return codigo_de_cadastro;
    }

    public void setcodigo_de_cadastro(int codigo_de_cadastro) {
        this.codigo_de_cadastro = codigo_de_cadastro;
    }

    public int gettelefone() {
        return telefone;
    }

    public void settelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public Endereco getend() {
        return end;
    }

    public void setend(Endereco end) {
        this.end = end;
    }

}
