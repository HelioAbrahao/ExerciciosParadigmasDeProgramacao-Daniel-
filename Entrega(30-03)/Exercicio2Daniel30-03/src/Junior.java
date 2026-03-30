public class Junior extends Desenvolvedor {

    public Junior(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void codar() {
        System.out.println(nome + " está codando com supervisão.");
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.10;
    }

    @Override
    public String toString() {
        return "Junior{" +
                "nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                ", bonus=" + calcularBonus() +
                '}';
    }
}