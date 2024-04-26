package src;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //TODO:"Conhecer e importar a classe Scanner"

        // Exibir as mensagens para o nosso usúario

        // Obter pela scanner os valores digitados no terminal

        // Exibir a mensagem conta criada

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.next();
        System.out.println("Por favor, digite o número da Conta !");
        int conta = sc.nextInt();
        System.out.println("Por favor, digite o nome do Titular !");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Por favor, digite o saldo da Conta !");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque !" , nome , agencia , conta , saldo);

        sc.close();
    }
}
