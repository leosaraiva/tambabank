package tambabank;

public class ContaPoupanca extends Conta {
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
    
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }
    
    public void rendimentoPoupanca() {
        saldo += saldo * 0.02;
    }
}
