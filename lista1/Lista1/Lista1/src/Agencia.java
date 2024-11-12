//Questão 14
public class Agencia {

    private int cod;

    public void addConta(Conta a) throws Exception {
        if (temEspaco()) {
            pilha.add(a);
        } else {
            throw new Exception("Agência cheia!");
        }
    }

    public void excluirConta(Conta a) throws Exception {
        if (existeConta(a)) {
            exclui(a);
        } else {
            throw new Exception("Conta não existe!");
        }
    }
}
