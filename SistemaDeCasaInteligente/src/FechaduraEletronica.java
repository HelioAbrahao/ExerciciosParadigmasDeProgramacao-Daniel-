public class FechaduraEletronica implements Autenticavel, DispositivoLigavel {

    private String senhaCorreta;
    private boolean destrancada;

    public FechaduraEletronica(String senha) {
        this.senhaCorreta = senha;
        this.destrancada = false;
    }

    @Override
    public void validarAcesso(String senha) {
        if (this.senhaCorreta.equals(senha)) {
            System.out.println("Acesso permitido!");
            ligar(); // destranca
        } else {
            System.out.println("Senha incorreta!");
        }
    }

    @Override
    public void ligar() {
        this.destrancada = true;
        System.out.println("Fechadura destrancada.");
    }

    @Override
    public void desligar() {
        this.destrancada = false;
        System.out.println("Fechadura trancada.");
    }
}