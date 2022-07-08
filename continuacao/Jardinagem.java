        public class Jardinagem {
    String nomeJardim;
    double qtdMetros;
    double qtdPlantas;
    double qtdMetrosGrama;
    double kilosAdubo;
    double valorAdubo;
    double valorMetroGrama;
    double valorConteGrama;
    double calculo;

        public Jardinagem () {
    this.nomeJardim=nomeJardim;
    this.qtdMetros=qtdMetros;
    this.qtdPlantas=qtdPlantas;
    this.qtdMetrosGrama=qtdMetrosGrama;
    this.kilosAdubo=kilosAdubo;
    this.valorAdubo=valorAdubo= 3;
    this.valorMetroGrama=valorMetroGrama;
    this.valorConteGrama=valorConteGrama;
this.calculo=calculo;
}

    public void usarAdubo () {
qtdMetros = qtdMetros*50;
System.out.println("Você vai precisar aproximadamente de adubo: ");
System.out.println(qtdMetros + "G");
}

    public double precoAdubo () {
calculo = this.qtdMetros*this.valorAdubo;
return calculo;
}

    public double precoCorteGrama () {
return calculo*valorAdubo;
}
    }
