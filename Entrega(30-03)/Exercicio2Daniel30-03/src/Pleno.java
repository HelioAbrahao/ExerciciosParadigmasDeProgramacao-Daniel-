public class Pleno extends Desenvolvedor {

    public Pleno(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void codar() {
        System.out.println(nome + " está codando com autonomia.");
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.15;
    }

    @Override
    public String toString() {
        return "Pleno{" +
                "nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                ", bonus=" + calcularBonus() +
                '}';
    }
}