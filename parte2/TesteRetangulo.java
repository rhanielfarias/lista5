import java.util.Scanner;

    public class TesteRetangulo {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
Retangulo lados = new Retangulo(0, 0);

System.out.println("Informe a base do retângulo");
lados.base  = input.nextDouble();
System.out.println("Informe a altura");
lados.altura = input.nextDouble();
System.out.println("O calculo da área do retângulo foi: " + lados.calculoArea());
System.out.println("O perímetro do retângulo é de: " +
lados.calculoPerimetro());

}
    }
