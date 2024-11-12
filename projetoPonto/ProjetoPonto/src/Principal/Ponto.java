package Principal;

//@author 0072379
public class Ponto {

    private String descricao;
    private int x;
    private int y;

    public Ponto(String descricao, int x, int y) {

        this.descricao = descricao;
        this.x = x;
        this.y = y;
        descricao = "px";

        System.out.println("Atributos X e Y foram inicializados. " + this.x + " " + this.y);

    }

    public Ponto(String descricao, double x, double y) {

        this.descricao = descricao;
        this.x = (int) x;
        this.y = (int) y;
        descricao = "px";

        System.out.println("Atributos X e Y foram inicializados. " + this.x + " " + this.y);

    }

    public Ponto(String descricao, int x) {

        this.x = x;
        this.descricao = descricao;
        descricao = "px";

        System.out.println("Atributo X foi inicializado. " + this.x);

    }

    public Ponto() {

        descricao = "px";

        System.out.println("Construtor vazio.");

    }

    @Override

    public String toString() {

        return "{" + "descricao = " + descricao + ", x = " + x + ", y = " + y + "}";

    }

    public void incrementarCoordenadas(int deltaX, int deltaY) {

        x = x + deltaX;
        y = y + deltaY;

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

    public void imprimirCoordenadas() {

        System.out.println("" + descricao + "(x, y) = " + "(" + x + ", " + y + ")");

    }

    public void zerarCoordenadas() {

        x = 0;
        y = 0;

    }

}
