import java.util.Scanner;

        public class TesteCaixa {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        Caixa conta = new Caixa();
System.out.println("Por favor, quantos lan�amentos deseja fazer?");
    int lancamento = input.nextInt();
        for (int i = 0; i < lancamento; i++) {
System.out.println("Digite uma das op��es da caixa eletronica");
System.out.println("1 - Consultar saldo atual da conta;");
System.out.println("2 - Depositar dinheiro;");
System.out.println("3 - Retirar ou pagar.");
    int opcao = input.nextInt();


    switch(opcao) {
    case 1:
System.out.println("O saldo atual da sua conta e de: " + conta.saldo);
    break;
    case 2:
System.out.println("Informe o valor a depositar na caixa eletr�nica");
    conta.credito = input.nextDouble();
    double valorCredito = conta.usaCredito();
System.out.println("O valor do seu cr�dito atual � de: " + valorCredito);
    break;
    case 3:
System.out.println("Informe o valor a retirar ou da compra a pagar. No m�ximo at� r$1000");
    conta.debito = input.nextDouble();
    double valorDebito = conta.usaDebito();
System.out.println("O valor que ficou na sua conta foi de: " + valorDebito);
    break;
    default:
System.out.println("Desculpe. op��o inv�lida");
    }
        }
    }
        }
