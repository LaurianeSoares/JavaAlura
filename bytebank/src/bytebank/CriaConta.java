package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta ();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		primeiraConta.saldo +=100;
		System.out.println(primeiraConta.saldo);
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println(primeiraConta.saldo);
		System.out.println(segundaConta.saldo);
		
		System.out.println("Agencia da Primeira conta: "+primeiraConta.agencia);
		System.out.println("Agencia da Segunda conta: "+segundaConta.agencia);
		segundaConta.agencia = 150;
		System.out.println("Agora mudou: Agencia da Segunda conta: "+segundaConta.agencia);
		if(primeiraConta == segundaConta) {
			System.out.println("S�o a mesma conta!!");
		}else {
			System.out.println("N�o s�o a mesma conta!!");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
