import java.util.Scanner;

          public class TesteJardinagem {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
Jardinagem adubo = new Jardinagem();
System.out.println("Informe o n�mero de metros");
adubo.qtdMetros = input.nextDouble();
adubo.usarAdubo();
double preco = adubo.precoAdubo();
System.out.println("Com o adubo custando r$3, voc� vai pagar aproximadamente" + preco);
double retornoValor = adubo.precoCorteGrama();
    }
}
