import java.util.Random;

public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura {

    private boolean ligado;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Termostato ligado.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Termostato desligado.");
    }

    @Override
    public double lerTemperatura() {
        if (!ligado) {
            System.out.println("Termostato desligado. Não é possível ler a temperatura.");
            return 0.0;
        }

        Random random = new Random();
        double temperatura = 20 + (10 * random.nextDouble()); 

        System.out.println("Temperatura atual: " + temperatura);
        return temperatura;
    }
}