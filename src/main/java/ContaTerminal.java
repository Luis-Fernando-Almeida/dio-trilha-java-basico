import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Por favor digite sua agência: ");
        String agência = sc.next();

        System.out.print("Por favor digite o número da sua conta: ");
        int número = sc.nextInt();

        System.out.print("Por favor digite seu nome completo: ");
        String nomeCliente = sc.next();

        System.out.print("Por favor digite o saldo da sua conta: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agência + ", conta: " + número + " e seu saldo é de: R$" +saldo + "que já está disponível para saque." );

    }
}
