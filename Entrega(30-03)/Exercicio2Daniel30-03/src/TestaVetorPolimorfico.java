public class TestaVetorPolimorfico {
    public static void main(String[] args) {
        Desenvolvedor[] devs = new Desenvolvedor[4];

        devs[0] = new Junior("Lucas", 3000.0);
        devs[1] = new Pleno("Marina", 5000.0);
        devs[2] = new Senior("Carlos", 8000.0);
        devs[3] = new Desenvolvedor("Ana", 4000.0);

        for (Desenvolvedor dev : devs) {
            dev.codar();
            System.out.println("Bônus: R$ " + dev.calcularBonus());
            System.out.println(dev.toString());
            System.out.println();
        }
    }
}