package tambabank;

import java.util.Scanner;

public class Tambabank {
    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;
    private ContaInvestimento contaInvestimento;
    
    public Tambabank() {
        contaCorrente = new ContaCorrente();
        contaPoupanca = new ContaPoupanca();
        contaInvestimento = new ContaInvestimento();
    }
    
    public void iniciar() {
        System.out.println("Obrigado por utilizar o Tambabank. Selecione uma opção do menu:");
        exibirMenuPrincipal();
        
        int opcao = lerOpcao();
        
        while (opcao != 6) {
            switch (opcao) {
                case 1:
                    menuContaCorrente();
                    break;
                case 2:
                    menuContaPoupanca();
                    break;
                case 3:
                    menuContaInvestimento();
                    break;
                case 4:
                    menuTransferencia();
                    break;
                case 5:
                    encerrarContas();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            
            exibirMenuPrincipal();
            opcao = lerOpcao();
        }
        
        sair();
    }
    
    private void exibirMenuPrincipal() {
        System.out.println("\n(1) Conta Corrente");
        System.out.println("(2) Conta Poupança");
        System.out.println("(3) Conta Investimento");
        System.out.println("(4) Transferência");
        System.out.println("(5) Encerrar Conta");
        System.out.println("(6) Sair");
    }
    
    private void menuContaCorrente() {
        boolean voltar = false;
        while (!voltar) {
            System.out.println("\n(1) Ver Saldo");
            System.out.println("(2) Depositar Dinheiro");
            System.out.println("(3) Sacar Dinheiro");
            System.out.println("(4) Voltar");
            
            int opcao = lerOpcao();
            
            switch (opcao) {
                case 1:
                    System.out.println("Saldo da Conta Corrente: " + contaCorrente.getSaldo());
                    break;
                case 2:
                    System.out.print("Digite o valor a ser depositado: ");
                    double valorDeposito = lerDouble();
                    contaCorrente.depositar(valorDeposito);
                    System.out.println("Novo saldo da Conta Corrente: " + contaCorrente.getSaldo());
                    break;
                case 3:
                    System.out.print("Digite o valor a ser sacado: ");
                    double valorSaque = lerDouble();
                    contaCorrente.sacar(valorSaque);
                    System.out.println("Novo saldo da Conta Corrente: " + contaCorrente.getSaldo());
                    break;
                case 4:
                    voltar = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    
    private void menuContaPoupanca() {
        boolean voltar = false;
        while (!voltar) {
            System.out.println("\n(1) Ver Saldo");
            System.out.println("(2) Depositar Dinheiro");
            System.out.println("(3) Sacar Dinheiro");
            System.out.println("(4) Rendimento Poupança");
            System.out.println("(5) Voltar");
            
            int opcao = lerOpcao();
            
            switch (opcao) {
                case 1:
                    System.out.println("Saldo da Conta Poupança: " + contaPoupanca.getSaldo());
                    break;
                case 2:
                    System.out.print("Digite o valor a ser depositado: ");
                    double valorDeposito = lerDouble();
                    contaPoupanca.depositar(valorDeposito);
                    System.out.println("Novo saldo da Conta Poupança: " + contaPoupanca.getSaldo());
                    break;
                case 3:
                    System.out.print("Digite o valor a ser sacado: ");
                    double valorSaque = lerDouble();
                    contaPoupanca.sacar(valorSaque);
                    System.out.println("Novo saldo da Conta Poupança: " + contaPoupanca.getSaldo());
                    break;
                case 4:
                    contaPoupanca.rendimentoPoupanca();
                    System.out.println("Novo saldo da Conta Poupança após rendimento: " + contaPoupanca.getSaldo());
                    break;
                case 5:
                    voltar = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    
    private void menuContaInvestimento() {
        boolean voltar = false;
        while (!voltar) {
            System.out.println("\n(1) Ver Saldo");
            System.out.println("(2) Depositar Dinheiro");
            System.out.println("(3) Sacar Dinheiro");
            System.out.println("(4) Rendimento Investimento");
            System.out.println("(5) Voltar");
            
            int opcao = lerOpcao();
            
            switch (opcao) {
                case 1:
                    System.out.println("Saldo da Conta Investimento: " + contaInvestimento.getSaldo());
                    break;
                case 2:
                    System.out.print("Digite o valor a ser depositado: ");
                    double valorDeposito = lerDouble();
                    contaInvestimento.depositar(valorDeposito);
                    System.out.println("Novo saldo da Conta Investimento: " + contaInvestimento.getSaldo());
                    break;
                case 3:
                    System.out.print("Digite o valor a ser sacado: ");
                    double valorSaque = lerDouble();
                    contaInvestimento.sacar(valorSaque);
                    System.out.println("Novo saldo da Conta Investimento: " + contaInvestimento.getSaldo());
                    break;
                case 4:
                    contaInvestimento.rendimentoInvestimento();
                    System.out.println("Novo saldo da Conta Investimento após rendimento: " + contaInvestimento.getSaldo());
                    break;
                case 5:
                    voltar = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    
    private void menuTransferencia() {
        System.out.println("\n(1) Conta Corrente");
        System.out.println("(2) Conta Poupança");
        System.out.println("(3) Conta Investimento");
        System.out.println("(4) Voltar");
        
        int opcaoOrigem = lerOpcao();
        
        if (opcaoOrigem >= 1 && opcaoOrigem <= 3) {
            System.out.println("\n(1) Conta Corrente");
            System.out.println("(2) Conta Poupança");
            System.out.println("(3) Conta Investimento");
            
            int opcaoDestino = lerOpcao();
            
            if (opcaoDestino >= 1 && opcaoDestino <= 3 && opcaoDestino != opcaoOrigem) {
                double valorTransferencia = 0.0;
                
                switch (opcaoOrigem) {
                    case 1:
                        valorTransferencia = contaCorrente.getSaldo();
                        break;
                    case 2:
                        valorTransferencia = contaPoupanca.getSaldo();
                        break;
                    case 3:
                        valorTransferencia = contaInvestimento.getSaldo();
                        break;
                }
                
                switch (opcaoDestino) {
                    case 1:
                        contaCorrente.depositar(valorTransferencia);
                        System.out.println("Valor transferido para Conta Corrente: " + valorTransferencia);
                        break;
                    case 2:
                        contaPoupanca.depositar(valorTransferencia);
                        System.out.println("Valor transferido para Conta Poupança: " + valorTransferencia);
                        break;
                    case 3:
                        contaInvestimento.depositar(valorTransferencia);
                        System.out.println("Valor transferido para Conta Investimento: " + valorTransferencia);
                        break;
                }
                
                switch (opcaoOrigem) {
                    case 1:
                        contaCorrente.sacar(valorTransferencia);
                        break;
                    case 2:
                        contaPoupanca.sacar(valorTransferencia);
                        break;
                    case 3:
                        contaInvestimento.sacar(valorTransferencia);
                        break;
                }
                
                System.out.println("Novo saldo da Conta Origem: " + getSaldoConta(opcaoOrigem));
            } else if (opcaoDestino == opcaoOrigem) {
                System.out.println("Opção inválida. A conta de origem e destino devem ser diferentes.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }
    }
    
    private void encerrarContas() {
        double saldoTotal = contaCorrente.getSaldo() + contaPoupanca.getSaldo() + contaInvestimento.getSaldo();
        System.out.println("Suas contas foram encerradas e o valor total do saque foi: " + saldoTotal);
    }
    
    private void sair() {
        System.out.println("Obrigado por utilizar o Tambabank.");
    }
    
    private int lerOpcao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite a opção desejada: ");
        return scanner.nextInt();
    }
    
    private double lerDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
    
    private double getSaldoConta(int opcao) {
        switch (opcao) {
            case 1:
                return contaCorrente.getSaldo();
            case 2:
                return contaPoupanca.getSaldo();
            case 3:
                return contaInvestimento.getSaldo();
            default:
                return 0.0;
        }
    }
    
    public static void main(String[] args) {
        Tambabank tambabank = new Tambabank();
        tambabank.iniciar();
    }
}


