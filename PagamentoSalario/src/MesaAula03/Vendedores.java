package MesaAula03;

public abstract class Vendedores {

        private String nome;
        private int pontos;


        public Vendedores(String nome, int pontos) {
            this.nome = nome;
            this.pontos = pontos;
        }


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getPontos() {
            return pontos;
        }

        public void setPontos(int pontos) {
            this.pontos = pontos;
        }

        public void mostrarCategoria() {
            pontos = calcularPontos();
            System.out.print(getNome());
            System.out.print(" possui tantos pontos: " + pontos + " sua categoria é vendedor ");
            System.out.print(recategorizar(pontos)+".");
            System.out.println();
        }



        public abstract int calcularPontos();


        public String recategorizar(int pontos) {

            if (pontos < 20) {
                return "novato";
            } else if ((pontos >= 20) && (pontos <= 30)) {
                return "aprendiz";
            } else if ((pontos <= 31) && (pontos <= 40)) {
                return "bom";
            } else {
                return "mestre";
            }

        }

    }
