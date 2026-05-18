public class Teste {
    public static void main(String[] args) {

        FechaduraEletronica fechadura = new FechaduraEletronica("2402");

        fechadura.validarAcesso("1111"); // errado
        fechadura.validarAcesso("2402"); // correto
        fechadura.desligar(); // tranca novamente

        System.out.println("-------------------");

        // Teste Termostato
        TermostatoSmart termostato = new TermostatoSmart();

        termostato.lerTemperatura(); 
        termostato.ligar();
        termostato.lerTemperatura(); 
        termostato.desligar();
    }
}