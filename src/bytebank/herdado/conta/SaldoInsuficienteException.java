package bytebank.herdado.conta;

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
