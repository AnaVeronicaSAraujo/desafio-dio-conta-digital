package banco;

public class Banco {

	public static void main(String[] args) {

	        ContaCorrente contaCorrente = new ContaCorrente("1234", 2000.0);
	        ContaPoupanca contaPoupanca = new ContaPoupanca("5678", 300.0);

	        System.out.println("Saldo inicial da Conta Corrente: " + contaCorrente.getSaldo());
	        System.out.println("Saldo inicial da Conta Poupança: " + contaPoupanca.getSaldo());

	        contaCorrente.depositar(400.0);
	        contaPoupanca.sacar(150.0);

	        System.out.println("Saldo da Conta Corrente após depósito: " + contaCorrente.getSaldo());
	        System.out.println("Saldo da Conta Poupança após saque: " + contaPoupanca.getSaldo());

	        contaCorrente.transferir(250.0, contaPoupanca);

	        System.out.println("Saldo da Conta Corrente após transferência: " + contaCorrente.getSaldo());
	        System.out.println("Saldo da Conta Poupança após receber transferência: " + contaPoupanca.getSaldo());
	    }
		
		
	}

