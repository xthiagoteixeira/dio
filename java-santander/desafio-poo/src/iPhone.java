import apps.navegador.NavegadorNaInternet;
import apps.reprodutor.ReprodutorMusical;
import apps.telefone.AparelhoTelefonico;
import apps.telefone.IAparelhoTelefonico;
import apps.navegador.INavegadorNaInternet;
import apps.reprodutor.IReprodutorMusical;

import java.util.Scanner;

public abstract class iPhone implements IAparelhoTelefonico, INavegadorNaInternet, IReprodutorMusical {

    static Scanner sc = new Scanner(System.in);
    static INavegadorNaInternet navegador = new NavegadorNaInternet();
    static IAparelhoTelefonico telefone = new AparelhoTelefonico();
    static IReprodutorMusical reprodutor = new ReprodutorMusical();


    // MENU DA APLICAÇÃO ...
    public static void main(String[] args) {
        int menu = 1;

        while (menu != 0) {
            System.out.println("BEM VINDO AO CELULAR IPHONE");

            System.out.println("1 - NAVEGADOR");
            System.out.println("2 - TELEFONE");
            System.out.println("3 - REPRODUTOR MUSICAL");
            System.out.println("0 - ENCERRAR O PROGRAMA");

            menu = sc.nextInt();

            switch (menu) {
                case 0:
                    System.out.println("OBRIGADO POR UTILIZAR O IPHONE");
                    break;

                case 1:
                    System.out.println("ENDEREÇO : ");
                    String endereco = sc.next();

                    navegador.exibirPagina(endereco);
                    navegador.adicionarNovaAba();
                    navegador.atualizarPagina();
                    break;
                case 2:
                    System.out.println("NUMERO : ");
                    String numero = sc.next();

                    telefone.ligar(numero);
                    telefone.atender();
                    telefone.iniciarCorreioVoz();
                    break;
                case 3:
                    System.out.println("MUSICA : ");
                    String musica = sc.next();

                    reprodutor.selecionarMusica(musica);
                    reprodutor.tocar();
                    reprodutor.pausar();
                    break;

                default:
                    System.out.println("OPÇÃO INVALIDA, TENTE NOVAMENTE.");
            }


        }
        sc.close();


    }

}
