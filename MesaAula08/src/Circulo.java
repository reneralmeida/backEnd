public class Circulo extends Figura{

    private double pi;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
        this.pi = 3.14;
    }

    @Override
    public double calcular() {
        return 2.0 * getPi() * getRaio();
    }

    public double getPi() {
        return pi;
    }

    public double getRaio() {
        return raio;
    }
}
