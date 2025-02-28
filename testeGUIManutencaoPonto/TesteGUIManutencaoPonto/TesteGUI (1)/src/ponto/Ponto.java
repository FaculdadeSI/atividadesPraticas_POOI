/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponto;

/**
 *
 * @author geraldo
 */
public class Ponto {

    private String descricao;
    private int x;
    private int y;

    public Ponto() {
        descricao = "pX";
        System.out.println("Construtor vazio");
        int x2 = 4;
        int z2 = x + 4;
        System.out.println("z=" + z2);

    }

    public Ponto(int x) {
        this.x = x;
        descricao = "pX";
        System.out.println("Atributo x foi inicializado com o valor x=" + this.x);
        imprimirCoordenadas();
    }

    public Ponto(double x, double y) {
        this.x = (int) x;
        this.y = (int) y;
        descricao = "pX";
        System.out.println("Atributos foram inicializados");
        this.imprimirCoordenadas();
    }

    public Ponto(String descricao, int x, int y) {
        this.descricao = descricao;
        this.x = x;
        this.y = y;
        descricao = "pX";
        System.out.println("Atributos foram inicializados");
        this.imprimirCoordenadas();
    }

    public Ponto(String descricao, int coordX, int coordY, int cgd) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void incrementarCoordenadas(int deltaX, int deltaY) {
        x = x + deltaX;
        y = y + deltaY;
    }

    public void zerarCoordenadas() {
        x = 0;
        y = 0;
    }

    public void imprimirCoordenadas() {
        System.out.println(" " + descricao + "=(x, y)=" + "(" + x + "," + y + ")");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Ponto{" + "descricao=" + descricao + ", x=" + x + ", y=" + y + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.x;
        hash = 97 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ponto other = (Ponto) obj;
        if (this.x != other.x) {
            return false;
        }
        return this.y == other.y;
    }

    public String getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
