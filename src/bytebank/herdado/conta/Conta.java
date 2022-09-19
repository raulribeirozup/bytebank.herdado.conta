package bytebank.herdado.conta;

public abstract class Conta {
	protected double saldo;
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

	public abstract void deposita(double valor);
    
    public void saca(double valor) {
    	if (saldo <= valor) {
    		throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
    	}
    	this.saldo -= valor;
    }
    
    public static int getTotal() {
    	return Conta.total;
    }
    
    public void transfere(double valor, Conta destino) {
    	this.saca(valor);
		destino.deposita(valor);
    }
}