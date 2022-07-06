import java.util.Scanner;
public class TesteBola {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
    Jabulani bola = new Jabulani(4.3, "branca", "borracha");
System.out.println("A cor da bola é:" + bola.mostraCor());
System.out.println("Troque a cor da bola");
input.nextLine();
String escolheCor = input.nextLine();
    bola.trocaCor(escolheCor);
System.out.println("A nova cor da bola é: " + bola.mostraCor());

}
}
