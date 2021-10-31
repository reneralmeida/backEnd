package MesaAula03;

public class Main {

    public static void main(String[] args) {

        Vendedores vendedor = new Funcionarios("Josué", 6, 11, 10, 1);
        vendedor.mostrarCategoria();

        vendedor = new Afiliados("Chico", 7, 2);
        vendedor.mostrarCategoria();

        Estagiarios estagiario = new Estagiarios("Xicungunha", 7, 3);
        estagiario.mostrarCategoriaEstagiario();
    }
}