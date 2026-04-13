public class TesteVeiculo {
    public static void main(String[] args) {
        Aviao aviao = new Aviao("Boeing", "747", 900.0f, 12000.0f);
        CarroEletrico carro = new CarroEletrico("Tesla", "Model 3", 120.0f, 450);

        aviao.mover();
        aviao.abastecer();

        carro.mover();
        carro.abastecer();

        System.out.println();

        Veiculo v;

        v = aviao;
        v.mover();

        v = carro;
        v.mover();
    }
}