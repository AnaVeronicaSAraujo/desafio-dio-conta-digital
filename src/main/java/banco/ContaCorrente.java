package banco;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class ContaCorrente extends Conta {
	
    public ContaCorrente(String numeroDaConta, double saldo) {
        super(numeroDaConta, saldo);
    }
}
