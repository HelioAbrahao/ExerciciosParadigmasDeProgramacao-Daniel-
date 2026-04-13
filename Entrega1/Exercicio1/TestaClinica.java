import java.time.LocalDateTime;

// Exercício 1 - Sistema de Clínica Médica

class Medico {
    private int id;
    private String nome;
    private String especialidade;

    public Medico(int id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Medico{id=" + id + ", nome='" + nome + "', especialidade='" + especialidade + "'}";
    }
}

class Paciente {
    private int id;
    private String nome;
    private String cpf;

    public Paciente(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Paciente{id=" + id + ", nome='" + nome + "', cpf='" + cpf + "'}";
    }
}

class Consulta {
    private LocalDateTime data;
    private double valorDaConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta(LocalDateTime data, double valorDaConsulta, Medico medico, Paciente paciente) {
        this.data = data;
        this.valorDaConsulta = valorDaConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public double getValorDaConsulta() {
        return valorDaConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void setValorDaConsulta(double valorDaConsulta) {
        this.valorDaConsulta = valorDaConsulta;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Consulta{data=" + data +
                ", valorDaConsulta=" + valorDaConsulta +
                ", medico=" + medico.getNome() +
                ", paciente=" + paciente.getNome() + "}";
    }
}

class TestaClinica {
    public static void main(String[] args) {
        Medico medico = new Medico(1, "Dr. Carlos", "Cardiologia");
        Paciente paciente = new Paciente(1, "Maria Silva", "123.456.789-00");

        Consulta consulta = new Consulta(
                LocalDateTime.of(2026, 5, 20, 14, 30),
                250.0,
                medico,
                paciente
        );

        System.out.println(medico);
        System.out.println(paciente);
        System.out.println(consulta);
    }
}
