import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //Conhecer e importar a classe Scanner
        //Obter pela classe Scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta: ");
        int numConta = sc.nextInt();
        numConta = Integer.valueOf(numConta);
        sc.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String numAgencia = sc.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o valor que será depositado: ");
        Double saldo = sc.nextDouble();

        sc.close();

        System.out.println("================================================================================================================================================");
        System.out.println("Olá "+ nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é " + numAgencia +", conta " + numConta +" e seu saldo de "+saldo+" já está disponível para saque.");
        System.out.println("================================================================================================================================================");
    }
}
