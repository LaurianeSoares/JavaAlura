package bytebank;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		System.out.println("Saldo da conta " + cc.getNumero() + " = " +cc.getSaldo());
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		
		cp.deposita(200.0);
		System.out.println("Saldo da conta " + cc.getNumero() + " = " +cc.getSaldo());
		
		cc.transfere(10.0, cp);
		cc.saca(10);
		System.out.println("Saldo da conta " + cc.getNumero() + " = " +cc.getSaldo());
		System.out.println("Saldo da conta " + cp.getNumero() + " = " +cp.getSaldo());
		
	}

}
