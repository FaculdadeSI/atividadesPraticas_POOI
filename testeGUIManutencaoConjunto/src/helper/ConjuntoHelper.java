package helper;

import ponto.Conjunto;
import java.util.ArrayList;

public class ConjuntoHelper {

    private ArrayList listaConjunto;

    private static ConjuntoHelper instance;

    private ConjuntoHelper() {
        listaConjunto = new ArrayList();
    }

    public static synchronized ConjuntoHelper getInstance() {
        if (instance == null) {
            instance = new ConjuntoHelper();
        }

        return instance;
    }

    public ArrayList getListaConjunto() {
        return listaConjunto;
    }

    public void addConjunto(Conjunto conjunto) {
        listaConjunto.add(conjunto);
    }

    public int excluir(int codigoConjunto) {
        Conjunto temp = null;
        int contRemovidos = 0;
        for (int i = 0; i < listaConjunto.size(); i++) {
            temp = (Conjunto) listaConjunto.get(i);
            if (codigoConjunto == temp.getCodigo()) {
                listaConjunto.remove(i);
                contRemovidos++;
            }
        }
        return contRemovidos;
    }

    public Conjunto pesquisar(int codigoConjunto) {
        Conjunto temp = null;
        for (int i = 0; i < listaConjunto.size(); i++) {
            temp = (Conjunto) listaConjunto.get(i);
            if (codigoConjunto == temp.getCodigo()) {
                return temp;
            }
        }
        return null;
    }

    public int alterar(Conjunto Conjunto) {
        Conjunto temp = null;
        int totalObjetos = 0;
        for (int i = 0; i < listaConjunto.size(); i++) {
            temp = (Conjunto) listaConjunto.get(i);
            if (Conjunto.getCodigo() == temp.getCodigo()) {
                temp.setDescricao(Conjunto.getDescricao());
                totalObjetos++;
            }
        }
        return totalObjetos;
    }
}
