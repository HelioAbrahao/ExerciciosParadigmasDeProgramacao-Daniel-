import java.time.LocalDateTime;
import java.util.ArrayList;

// Exercício 8 - Sistema de Cine-Teatro

class Filme {
    private int id;
    private String titulo;
    private String genero;
    private int duracao;

    public Filme(int id, String titulo, String genero, int duracao) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Filme{id=" + id +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", duracao=" + duracao + " min}";
    }
}

class Ingresso {
    private int id;
    private String assento;
    private String tipo;
    private float preco;

    public Ingresso(int id, String assento, String tipo, float preco) {
        this.id = id;
        this.assento = assento;
        this.tipo = tipo;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Ingresso{id=" + id +
                ", assento='" + assento + '\'' +
                ", tipo='" + tipo + '\'' +
                ", preco=" + preco + "}";
    }
}

class Sessao {
    private int id;
    private LocalDateTime horario;
    private int sala;
    private Filme filme;
    private ArrayList<Ingresso> ingressos;

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.ingressos = new ArrayList<>();
    }

    public void vincularFilme(Filme f) {
        this.filme = f;
    }

    public void venderIngresso(int id, String assento, String tipo, float preco) {
        Ingresso ingresso = new Ingresso(id, assento, tipo, preco);
        ingressos.add(ingresso);
    }

    @Override
    public String toString() {
        String texto = "Sessao{id=" + id +
                ", horario=" + horario +
                ", sala=" + sala +
                ", filme=" + (filme != null ? filme.getTitulo() : "Nenhum") +
                "}\nIngressos vendidos:\n";

        for (Ingresso ingresso : ingressos) {
            texto += ingresso + "\n";
        }

        return texto;
    }
}

class TestaCinema {
    public static void main(String[] args) {
        Filme filme1 = new Filme(1, "Batman", "Ação", 176);
        Filme filme2 = new Filme(2, "Duna", "Ficção Científica", 155);

        Sessao sessao = new Sessao(
                1,
                LocalDateTime.of(2026, 7, 20, 20, 0),
                1
        );

        sessao.vincularFilme(filme1);

        sessao.venderIngresso(1, "A1", "Inteira", 40.0f);
        sessao.venderIngresso(2, "A2", "Meia", 20.0f);
        sessao.venderIngresso(3, "A3", "Inteira", 40.0f);

        System.out.println(sessao);
    }
}
