package bytebank;


public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	//Cliente titular = new Cliente();
	private Cliente titular;
	
	private static int total = 0;

	
	public Conta(int agencia,int numero) {
		Conta.total++;
		//System.out.println("O total de contas � " + total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + agencia);
	}
	
	public abstract void deposita(double valor); //{
		//this.saldo += valor;
		
	//}
		
	public boolean saca(double valor){
		if(this.saldo>=valor) {
			this.saldo -= valor;
			return true;
		}else {
		return false;
		
		}
	}
	
	public boolean transfere(double valor, Conta x) {
		if(this.saldo>=valor) {
			this.saldo-=valor + 0.2;
			//x.saldo += valor;
			x.deposita(valor);
			return true;
		}else {
		return false;
		}

	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero<=0) {
			System.out.println("N�o pode valor menor ou igual a 0");
			return;
		}
		this.numero = numero;
		
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia<=0) {
			System.out.println("N�o pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return  Conta.total;
		
	}
}