package bytebank.herdado.conta;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(1, 123);
		conta.deposita(200);
		try {
			conta.saca(310);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(conta.getSaldo());
	}

}
