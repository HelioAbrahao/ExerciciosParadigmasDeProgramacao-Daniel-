import java.util.ArrayList;

// Exercício 4 - Projeto de Software

class Programador {
    private int id;
    private String nome;
    private String linguagemPrincipal;

    public Programador(int id, String nome, String linguagemPrincipal) {
        this.id = id;
        this.nome = nome;
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public String toString() {
        return "Programador{id=" + id + ", nome='" + nome + "', linguagemPrincipal='" + linguagemPrincipal + "'}";
    }
}

class Projeto {
    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> programadores;

    public Projeto(int id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.programadores = new ArrayList<>();
    }

    public void adicionarProgramador(Programador p) {
        programadores.add(p);
    }

    public void listarProgramadores() {
        System.out.println("Programadores do projeto " + nomeProjeto + ":");
        for (Programador p : programadores) {
            System.out.println(p);
        }
    }
}

class TestaProjeto {
    public static void main(String[] args) {
        Programador p1 = new Programador(1, "Ana", "Java");
        Programador p2 = new Programador(2, "Bruno", "Python");

        Projeto projeto = new Projeto(1, "Sistema Acadêmico");
        projeto.adicionarProgramador(p1);
        projeto.adicionarProgramador(p2);

        projeto.listarProgramadores();
    }
}
