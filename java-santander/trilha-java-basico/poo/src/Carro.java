public class Carro extends Veiculo{

    public void ligar(){
        // Encapsulamento
        confereCambio();
        confereCombustivel();
        System.out.println("Carro Ligado");

    }
    private void confereCombustivel(){
        System.out.println("conferindo combustivel");

    }
    private void confereCambio(){
        System.out.println("conferindo cambio");

    }
}
