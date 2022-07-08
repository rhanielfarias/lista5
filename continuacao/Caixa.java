    public class Caixa {
double saldo=1000;
double credito;
double debito;

    public Caixa() {
this.saldo= saldo;
this.credito = credito;
this.debito = debito;
    }

    public double usaCredito () {
credito = saldo+credito;
return credito;
}

    public double usaDebito () {
debito=saldo-debito;
return debito;
}
}
