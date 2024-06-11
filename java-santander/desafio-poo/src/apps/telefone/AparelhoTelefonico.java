package apps.telefone;

public class AparelhoTelefonico implements IAparelhoTelefonico{

    @Override
    public void ligar(String numero) {
        System.out.println("LIGAR PARA O NUMERO " + numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDER O TELEFONE");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIAR CORREIO VOZ");
    }
}
