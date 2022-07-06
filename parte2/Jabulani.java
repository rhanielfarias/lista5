    public class Jabulani {

    double cicur;
    String cor;
String material;
    public Jabulani(double cicur, String cor, String material) {
    this.cicur = cicur;
    this.cor = cor;
    this.material = material;
    }

    public String mostraCor () {
return this.cor;
}

    public void trocaCor (String cor) {
this.cor = cor;
}
}
