package banco;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class ContaPoupanca extends Conta{

	public ContaPoupanca(String numeroDaConta, double saldo) {
		super(numeroDaConta, saldo);
	}

}
