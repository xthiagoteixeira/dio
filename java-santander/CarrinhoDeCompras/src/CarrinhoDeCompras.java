import java.util.ArrayList;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        itemList = new ArrayList<>();
    }

    // Programação Declarativa
//    public void calcularValorTotal(){
//        double total = 0d;
//        if (itemList.isEmpty()) {
//            throw new RuntimeException("A lista está vazia!");
//        } else {
//            for (Item item : itemList) {
//                double valorItem = item.getPreco() * item.getQuant();
//                total += valorItem;
//            }
//            System.out.println("Valor total: " + total);
//        }
//
//    }

    // Declaração Imperativa
    public double calcularValorTotal() {
        if (itemList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
        }
        return itemList.stream()
                .mapToDouble(item -> item.getPreco() * item.getQuant())
                .sum();
    }


}
