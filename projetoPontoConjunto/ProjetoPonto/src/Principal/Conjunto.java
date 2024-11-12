package Principal;

import java.util.ArrayList;

public class Conjunto {

    private int codigo;
    private String descricao;
    private ArrayList listaPontos;

    public Conjunto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        listaPontos = new ArrayList();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList getListaPontos() {
        return listaPontos;
    }

    public void setListaPontos(ArrayList listaPontos) {
        this.listaPontos = listaPontos;
    }

    @Override
    public String toString() {
        return "Conjunto{" + "codigo=" + codigo + ", descricao=" + descricao + ", listaPontos=" + listaPontos + '}';
    }

    public int adicionarPonto(Ponto ponto) {
        listaPontos.add(ponto);
        return 1;
    }

    public void excluirPonto(Ponto ponto) {

    }

    public void listarPontos() {
        Ponto p = null;
        if (listaPontos != null) {
            for (int i = 0; i < listaPontos.size(); i++) {
                p = (Ponto) listaPontos.get(i);
                System.out.println(p);
            }
        }
    }

}
