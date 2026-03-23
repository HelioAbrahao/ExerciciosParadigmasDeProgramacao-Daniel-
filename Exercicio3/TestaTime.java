import java.util.ArrayList;

// Exercício 3 - Time de Basquete

class Atleta {
    private int id;
    private String nome;
    private String posicao;

    public Atleta(int id, String nome, String posicao) {
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "Atleta{id=" + id + ", nome='" + nome + "', posicao='" + posicao + "'}";
    }
}

class Time {
    private int id;
    private String nome;
    private String tecnico;
    private ArrayList<Atleta> atletas;

    public Time(int id, String nome, String tecnico) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
        this.atletas = new ArrayList<>();
    }

    public void contratarAtleta(Atleta a) {
        atletas.add(a);
    }

    public void listarAtletas() {
        System.out.println("Atletas do time " + nome + ":");
        for (Atleta atleta : atletas) {
            System.out.println(atleta);
        }
    }
}

class TestaTime {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta(1, "Lucas Dias", "Ala");
        Atleta atleta2 = new Atleta(2, "Georginho", "Armador");

        Time time = new Time(1, "Franca Basquete", "Helinho");
        time.contratarAtleta(atleta1);
        time.contratarAtleta(atleta2);

        time.listarAtletas();

        time = null;

        System.out.println("\nTime foi anulado.");
        System.out.println("Mas o atleta ainda existe:");
        System.out.println(atleta1);
    }
}
