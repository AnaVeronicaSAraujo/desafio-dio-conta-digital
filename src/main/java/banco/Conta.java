package banco;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Conta {

	private String numeroDaConta;
	private double saldo;

	public Conta(String numeroDaConta, double saldo) {
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
	}

	public void depositar(double valorDoDeposito) {
		if (valorDoDeposito > 0) {
			saldo += valorDoDeposito;
		}
	}

	public void sacar(double valorDoSaque) {
		if (valorDoSaque > 0 && saldo >= valorDoSaque) {
			saldo -= valorDoSaque;
		}
	}

	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
}


