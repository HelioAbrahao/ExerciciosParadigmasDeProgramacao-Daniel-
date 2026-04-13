public class Aviao extends Veiculo {
    private float altitudeMax;

    public Aviao(String marca, String modelo, float velocidade, float altitudeMax) {
        super(marca, modelo, velocidade);
        this.altitudeMax = altitudeMax;
    }

    @Override
    public void mover() {
        System.out.println("Avião voando a " + velocidade + " km/h e " + altitudeMax + " metros");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo com querosene de aviação");
    }
}