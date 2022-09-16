package bytebank.herdado.conta;

public class Conta {
	private double saldo;
    private int agencia;
    private int numero;
	Cliente cliente;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		if(agencia >= 0) this.agencia = agencia;
		if(numero >= 0) this.numero = numero;
		this.saldo = 100;
	}
    
    public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
    	this.saldo += valor;
    }
    
    public boolean saca(double valor) {
    	if (saldo >= valor) {
    		this.saldo -= valor;
    		return true;
    	}
    	return false;
    }
    
    public static int getTotal() {
    	return Conta.total;
    }
    
    public boolean transfere(double valor, Conta destino) {
    	if (this.saca(valor)) {
//    		System.out.println("Transferindo R$" + valor + 
//    				" da conta de " + this.getCliente().getNome() + 
//    				" para a conta de " + destino.getCliente().getNome());
    		destino.deposita(valor);
    		return true;
    	}
    	return false;
    }
}