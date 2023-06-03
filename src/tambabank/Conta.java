package tambabank;

public abstract class Conta {
    protected double saldo;
    
    public Conta() {
        this.saldo = 0.0;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public abstract void depositar(double valor);
    
    public abstract void sacar(double valor);
}
