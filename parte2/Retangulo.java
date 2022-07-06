   public class Retangulo {
    double base;
    double altura;

    public Retangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
}

    public void lados () {
    this.base= base;
    this.altura = altura;
}

    public double calculoArea() {
    return this.base*this.altura;

}
    public double calculoPerimetro() {
return base*2+altura*2;
}

}
