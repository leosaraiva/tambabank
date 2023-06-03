package tambabank;

public class ContaInvestimento extends Conta {
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
    
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }
    
    public void rendimentoInvestimento() {
        saldo += saldo * 0.10;
    }
}