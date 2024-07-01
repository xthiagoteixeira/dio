import java.util.Scanner;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends Cofre {

    public CofreFisico() {
        super("Cofre Fisico", "Chave");

    }

}

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o tipo de cofre
        String tipoCofre = scanner.nextLine();

        // Instancia o cofre apropriado
        Cofre cofre;
        Integer senha=0;
        if (tipoCofre.equalsIgnoreCase("digital")) {
            senha = scanner.nextInt();
            cofre = new CofreDigital(senha);
            int confirmacaoSenha = scanner.nextInt();

            // Imprime as informações do cofre
            ((Cofre)cofre).imprimirInformacoes();

            // Para CofreDigital, valida a senha
            if (cofre instanceof CofreDigital) {

                if (((CofreDigital)cofre).validarSenha(confirmacaoSenha)) {
                    System.out.println("Cofre aberto!");
                } else {
                    System.out.println("Senha incorreta!");
                }
            }

        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            cofre = new CofreFisico();

            // Imprime as informações do cofre
            ((Cofre)cofre).imprimirInformacoes();


        } else {
            System.out.println("Método de abertura inválido.");
            return; // Encerra o programa se o método de abertura não for válido
        }



    }
}