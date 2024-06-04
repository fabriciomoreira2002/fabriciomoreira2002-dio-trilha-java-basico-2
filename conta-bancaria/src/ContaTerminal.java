import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

    System.out.print("digite o número da sua conta ");
        int numero = scanner.nextInt();

    System.out.print("Por favor, Digite o número da sua agência ");
        String agencia = scanner.next();
        
    System.out.print("Por favor, digite o seu nome ");
        String nomeCliente = scanner.next();

    System.out.print("Por favor, digite o seu saldo ");
        double saldo = scanner.nextDouble();

    System.out.printf("Olá "+ nomeCliente);

    System.out.print(" Obrigado por criar sua conta em nosso Banco");
    
    System.out.print(" Sua agência é "+agencia);

    System.out.print(" Conta "+numero);

    System.out.print(" Seu saldo é " +saldo);

    System.out.print(" já está disponivel para saque");
    }
}
