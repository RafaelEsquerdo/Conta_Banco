import java.util.Scanner;
public class ContaTerminal
 {
    public static void main(String[] args) throws Exception {
      int numeroConta;
      String agenciaBanco;
      String nomeCliente;
      double saldo=237.48;
                    
        Scanner conta = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("Registro Bancário");
        System.out.println("======================================");

         System.out.println("Por Favor, digite p número da Agencia");
         numeroConta = conta.nextInt();

         System.out.println("Qual a sua agencia?");
         agenciaBanco=conta.next();

         System.out.println("Qual o seu nome?");
         nomeCliente=conta.next();
        System.out.println("=====================================");
         System.out.println("Olá, " + nomeCliente + " Seja bem-vindo e obrigado por escolher noss banco, sua agencia é: " + agenciaBanco+" conta"+numeroConta+" e o seu saldo atual é de: " + saldo+" ele já está disponível para saque.");
         System.out.println("=======================================");


    }
}
