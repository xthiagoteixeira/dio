package org.dio.contabancaria;

// Conhecer e importar a classe Scanner
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário
        // Obter pela Scanner os valores digitados no terminal
        System.out.println("\n Informe o Nro da Conta:     ");
        int nroConta = ler.nextInt();

        System.out.println("\n Informe o Nro da Agência:   ");
        String nroAgencia = ler.next();

        System.out.println("\n Informe o Nome do Cliente:  ");
        String nomeCliente = ler.next();

        System.out.println("\n Informe o Saldo:            ");
        double saldo = ler.nextDouble();
        
        // Exibir a mensagem conta criada
        System.out.printf("\n Conta: %d", nroConta);
        System.out.printf("\n Agência: %s", nroAgencia);
        System.out.printf("\n Nome do Cliente: %s", nomeCliente);
        System.out.printf("\n Saldo: %.2f", saldo);
        
    }
}
