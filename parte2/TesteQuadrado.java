import java.util.Scanner;
public class TesteQuadrado {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
Quadrado lado = new Quadrado(2);
System.out.println("O atual lado do quadrado �: ");
System.out.println(lado.ladoDoQuadrado());
System.out.println("Informe o novo valor do quadrado");
int novoValor = input.nextInt();
lado.mudarTamanhoQuadrado(novoValor);
int calculaArea = lado.ladoDoQuadrado();
System.out.println("O novo valor do quadrado �: " + calculaArea);
System.out.println("E a �rea do quadrado � de: " + (calculaArea*4));

}
}
