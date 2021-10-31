package MesaAula02;

public class Principal {

    public static void main(String[] args) {
        Adulto adulto = new Adulto(25);
        Infantil infantil = new Infantil(20, "freegel");
        Vegetariano vegetariano = new Vegetariano(30, 5);

        System.out.println(adulto.montar());
        System.out.println("Preço final " + adulto.precoVenda());
        System.out.println(infantil.montar());
        System.out.println("Preço final " + infantil.precoVenda());
        System.out.println(vegetariano.montar());
        System.out.println("Preço final " + vegetariano.precoVenda());
    }
}
