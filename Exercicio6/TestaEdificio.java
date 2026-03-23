import java.util.ArrayList;

// Exercício 6 - Edifício e Apartamentos

class Apartamento {
    private int numero;
    private int andar;

    public Apartamento(int numero, int andar) {
        this.numero = numero;
        this.andar = andar;
    }

    public int getNumero() {
        return numero;
    }

    public int getAndar() {
        return andar;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    @Override
    public String toString() {
        return "Apartamento{numero=" + numero + ", andar=" + andar + "}";
    }
}

class Edificio {
    private String nome;
    private String endereco;
    private ArrayList<Apartamento> apartamentos;

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    public void construirApartamento(int num, int andar) {
        Apartamento apartamento = new Apartamento(num, andar);
        apartamentos.add(apartamento);
    }

    public void listarApartamentos() {
        System.out.println("Apartamentos do edifício " + nome + ":");
        for (Apartamento a : apartamentos) {
            System.out.println(a);
        }
    }
}

class TestaEdificio {
    public static void main(String[] args) {
        Edificio edificio = new Edificio("Residencial Sol", "Rua Central, 100");
        edificio.construirApartamento(101, 1);
        edificio.construirApartamento(202, 2);
        edificio.construirApartamento(303, 3);

        edificio.listarApartamentos();
    }
}
