import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        short numeroConta;
        String agencia;
        String nomeCliente;
        float saldo;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta.");
        numeroConta = leitor.nextShort();
        leitor.nextLine();

        System.out.println("Por favor, digite o número da agência.");
        agencia = leitor.nextLine();

        System.out.println("Por favor, digite seu nome.");
        nomeCliente = leitor.nextLine();

        System.out.println("Por favor, digite o seu saldo.");
        saldo = leitor.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
    }
}
