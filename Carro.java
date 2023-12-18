public class Carro {
    private final String marca;
    private final String modelo;
    private final int ano;
    private final String cor;
    private int velocidadeAtual;
    private boolean ligado;

    /**
     * Construtor da classe carro
     *
     * @param marca  A marca do carro.
     * @param modelo O modelo do carro.
     * @param ano    O ano de fabricacao do carro.
     * @param cor    A cor do carro.
     */
    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidadeAtual = 0;
        this.ligado = false;
    }

    /**
     * Metodo que aumenta a velocidade do carro.
     *
     * @param velocidade A quantidade pela qual a velocidade deve ser aumentada.
     */
    public void acelerar(int velocidade) {
        if (ligado) {
            this.velocidadeAtual += velocidade;
            System.out.println("O carro acelerou para " + velocidadeAtual + " km/h.");
        } else {
            System.out.println("O carro está desligado. Ligue o carro para acelerar.");
        }
    }

    /**
     * Metodo que diminui a velocidade do carro.
     *
     * @param velocidade A quantidade pela qual a velocidade deve ser diminuida.
     */
    public void frear(int velocidade) {
        if (ligado) {
            if (velocidadeAtual == 0) {
                System.out.println("O carro já está parado.");
            } else if (velocidadeAtual - velocidade <= 0) {
                this.velocidadeAtual = 0;
                System.out.println("O carro parou");
            } else {
                this.velocidadeAtual -= velocidade;
                System.out.println("O carro freou para " + this.velocidadeAtual + " km/h.");
            }
        } else {
            System.out.println("O carro está desligado. Não é possível frear.");
        }
    }

    /**
     * Metodo que liga o carro
     */
    public void ligarCarro() {
        if (!this.ligado) {
            this.ligado = true;
            System.out.println("O carro foi ligado");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    /**
     * Metodo que desliga o carro
     */
    public void desligarCarro() {
        if (this.ligado && this.velocidadeAtual == 0) {
            this.ligado = false;
            System.out.println("O carro foi desligado.");
        } else if (this.ligado && this.velocidadeAtual > 0) {
            System.out.println("O carro ainda esta andando a " + this.velocidadeAtual + " km/h, voce nao pode desliga-lo");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    /**
     * Metodo utilizado para obter informacoes do carro
     */
    public void info() {
        System.out.println(this.marca + " " + this.modelo + " " + this.ano + " " + ", Cor: " + this.cor);
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corrola", 2022, "Prata");

        meuCarro.info();
        meuCarro.acelerar(80);
        meuCarro.frear(20);
        meuCarro.ligarCarro();
        meuCarro.acelerar(80);
        meuCarro.frear(20);
        meuCarro.acelerar(20);
        meuCarro.frear(80);
        meuCarro.frear(10);
        meuCarro.ligarCarro();
        meuCarro.acelerar(20);
        meuCarro.desligarCarro();
        meuCarro.frear(20);
        meuCarro.desligarCarro();
        meuCarro.desligarCarro();
    }
}
