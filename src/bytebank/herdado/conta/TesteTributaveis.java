package bytebank.herdado.conta;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1, 123);
		cc.deposita(100);
		
		SeguroDeVida s = new SeguroDeVida();
		
		CalculadorDeImposto c = new CalculadorDeImposto();
		
		c.registra(cc);
		c.registra(s);
		
		System.out.println(c.getTotalImposto());
	}

}
