package bytebank;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo da primeira: "+primeiraConta.saldo);
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da Segunda: "+segundaConta.saldo);
		segundaConta.saldo +=50;
		
		System.out.println("Saldo da primeira: "+primeiraConta.saldo);
		System.out.println("Saldo da Segunda: "+segundaConta.saldo);
		if(primeiraConta == segundaConta) {
			System.out.println("S�o a mesma conta!!");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}

}
