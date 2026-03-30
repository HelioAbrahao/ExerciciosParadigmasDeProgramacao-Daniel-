public class Senior extends Desenvolvedor {

    public Senior(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void codar() {
        System.out.println(nome + " está codando e orientando a equipe.");
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.20;
    }

    @Override
    public String toString() {
        return "Senior{" +
                "nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                ", bonus=" + calcularBonus() +
                '}';
    }
}