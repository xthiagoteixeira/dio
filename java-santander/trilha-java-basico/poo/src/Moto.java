public class Moto extends Veiculo{

    @Override
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("MOTO LIGADA");
    }

    private void confereCombustivel(){
        System.out.println("conferindo combustivel");

    }
    private void confereCambio(){
        System.out.println("conferindo cambio");

    }

}
