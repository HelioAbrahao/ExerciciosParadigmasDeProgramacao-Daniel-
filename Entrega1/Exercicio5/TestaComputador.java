// Exercício 5 - Computador e Seus Componentes

class Processador {
    private String marca;
    private String modelo;
    private double frequencia;

    public Processador(String marca, String modelo, double frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Processador{marca='" + marca + "', modelo='" + modelo + "', frequencia=" + frequencia + "GHz}";
    }
}

class Computador {
    private int id;
    private String marca;
    private Processador processador;

    public Computador(int id, String marca, String marcaProcessador, String modeloProcessador, double frequencia) {
        this.id = id;
        this.marca = marca;
        this.processador = new Processador(marcaProcessador, modeloProcessador, frequencia);
    }

    @Override
    public String toString() {
        return "Computador{id=" + id + ", marca='" + marca + "', " + processador + "}";
    }
}

class TestaComputador {
    public static void main(String[] args) {
        Computador computador = new Computador(1, "Dell", "Intel", "i7-12700", 3.6);
        System.out.println(computador);

        computador = null;
        System.out.println("Computador deletado. Como o processador faz parte dele, ele também deixa de existir no sistema.");
    }
}
