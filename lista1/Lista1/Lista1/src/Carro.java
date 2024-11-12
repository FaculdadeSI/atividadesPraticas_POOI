//Questão 20 
public class Carro {

    private double qntdCombustivel;
    private double km;
    private double consumo;

    public Carro() {
        qntdCombustivel = 0;
        km = 0;
        consumo = 0;
    }

    public double getQntdCombustivel() {
        return qntdCombustivel;
    }

    public void setQntdCombustivel(double qntdCombustivel) {
        this.qntdCombustivel = qntdCombustivel;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void abastecer(double quantidade) {
        this.qntdCombustivel = this.qntdCombustivel + quantidade;
    }

    @Override
    public String toString() {
        return "Carro{" + "qntdCombustivel=" + qntdCombustivel + ", km=" + km + ", consumo=" + consumo + '}';
    }

    public Carro(double consumo) {
        this();
        this.consumo = consumo;
    }

    public Carro(double qntdCombustivel, double km, double consumo) {
        this(consumo);
        this.qntdCombustivel = qntdCombustivel;
        this.km = km;
        this.consumo = consumo;
    }

    public void andar(double distancia) throws Exception {
        double gastoCombustivel = 0;
        gastoCombustivel = distancia / consumo;
        if (qntdCombustivel >= gastoCombustivel) {
            km += distancia;
            qntdCombustivel -= gastoCombustivel;
        } else {
            throw new Exception("Combustível insuficiente!");
        }

    }

    public void impremeQntdCombustivel() {
        System.out.println("Consumo: " + this.consumo);
        System.out.println("Quantidade de combustível: " + this.qntdCombustivel);
        System.out.println("Km: " + this.km);
    }

}
