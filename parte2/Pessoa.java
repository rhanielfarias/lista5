   public class Pessoa {
    String nome;
    int idade;
    int peso;
    double altura;
    public Pessoa(String nome, int idade, int peso, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso=0;
    this.altura=altura;
}
    public void crescer () {
    if(this.idade < 21) {
    this.altura=this.altura+0.05;
}
}

    public int envelhecer (int idade) {
    this.idade=this.idade+1;
crescer();
return this.idade;
}

    public void engordar() {
    this.peso=peso+5;
}

    public void emagrecer () {
if(this.peso-peso >=0) {
    this.peso=peso-5;
}
}

}
