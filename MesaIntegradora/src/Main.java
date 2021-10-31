public class Main {
    public static void main(String[] args) {

        ProducaoRoupas roupa = new ProducaoRoupas();
        Roupa calca = roupa.getRoupa("Calça","XS", true, false);
        Roupa blusa = roupa.getRoupa("Blusa", "S", false, true);
        Roupa camiseta = roupa.getRoupa("Camiseta", "M", true, true);

    }
}

