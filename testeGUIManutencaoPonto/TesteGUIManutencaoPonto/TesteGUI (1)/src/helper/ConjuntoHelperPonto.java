package helper;

import java.util.ArrayList;
import ponto.Ponto;

/**
 *
 * @author 0072379
 */
public class ConjuntoHelperPonto {

    private ArrayList listaPonto;

    private static ConjuntoHelperPonto instance;

    private ConjuntoHelperPonto() {
        listaPonto = new ArrayList();
    }

    public static synchronized ConjuntoHelperPonto getInstance() {
        if (instance == null) {
            instance = new ConjuntoHelperPonto();
        }

        return instance;
    }

    public ArrayList getListaConjunto() {
        return listaPonto;
    }

    public void addponto(Ponto ponto) {
        listaPonto.add(ponto);
    }

    public int excluir(String descricaoPonto) {
        Ponto temp = null;
        int qtdeR = 0;
        for (int i = 0; i < listaPonto.size(); i++) {
            temp = (Ponto) listaPonto.get(i);
            if (descricaoPonto.equals(temp.getDescricao())) {
                listaPonto.remove(i);
                qtdeR++;
            }
        }
        return qtdeR;
    }

    public Ponto pesquisar(String descricaoPonto) {
        Ponto temp = null;
        for (int i = 0; i < listaPonto.size(); i++) {
            temp = (Ponto) listaPonto.get(i);
            if (descricaoPonto.equals(temp.getDescricao())) {
                return temp;
            }
        }
        return null;
    }

    public int alterar(Ponto ponto) {
        Ponto temp = null;
        int totalObjetos = 0;
        for (int i = 0; i < listaPonto.size(); i++) {
            temp = (Ponto) listaPonto.get(i);
            if (temp.getDescricao().equals(ponto.getDescricao())) {
                temp.setX(ponto.getX());
                temp.setY(ponto.getY());
                totalObjetos++;
            }
        }
        return totalObjetos;
    }
}
