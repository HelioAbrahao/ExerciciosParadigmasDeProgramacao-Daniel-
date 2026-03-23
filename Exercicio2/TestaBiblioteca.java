import java.time.LocalDate;

// Exercício 2 - Sistema de Biblioteca

class Leitor {
    private int id;
    private String nome;

    public Leitor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Leitor{id=" + id + ", nome='" + nome + "'}";
    }
}

class Livro {
    private int id;
    private String titulo;
    private String autor;

    public Livro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{id=" + id + ", titulo='" + titulo + "', autor='" + autor + "'}";
    }
}

class Emprestimo {
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;
    private Leitor leitor;
    private Livro livro;

    public Emprestimo(LocalDate dataEmprestimo, LocalDate dataDevolucaoPrevista, Leitor leitor, Livro livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.leitor = leitor;
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataDevolucaoPrevista(LocalDate dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "Emprestimo{leitor='" + leitor.getNome() +
                "', livro='" + livro.getTitulo() +
                "', dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucaoPrevista=" + dataDevolucaoPrevista + "}";
    }
}

class TestaBiblioteca {
    public static void main(String[] args) {
        Leitor leitor = new Leitor(1, "João");
        Livro livro = new Livro(1, "Dom Casmurro", "Machado de Assis");

        Emprestimo emprestimo = new Emprestimo(
                LocalDate.now(),
                LocalDate.now().plusDays(7),
                leitor,
                livro
        );

        System.out.println(emprestimo);
    }
}
