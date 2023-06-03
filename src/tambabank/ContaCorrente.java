package tambabank;

public class ContaCorrente extends Conta {
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
    
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }
}
