package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDaLauriane = new Conta();
		contaDaLauriane.saldo = 100;
		contaDaLauriane.deposita(50);
		System.out.println(contaDaLauriane.saldo);
		boolean conseguiuRetirar = contaDaLauriane.saca(70);
		System.out.println(contaDaLauriane.saldo);
		System.out.println(conseguiuRetirar);
		Conta contaDeTerceiros = new Conta();
		System.out.println(contaDeTerceiros.saldo);
		boolean conseguiuTransferir = contaDaLauriane.transfere(70, contaDeTerceiros);
		if(conseguiuTransferir) {
			System.out.println("Transferencia realizada com sucesso!!");
		}else {
			System.out.println("Faltou dinheiro aí hein!!");
		};
		System.out.println(contaDaLauriane.saldo);
		System.out.println(contaDeTerceiros.saldo);
		//System.out.println(conseguiuTransferir);
		
		contaDaLauriane.titular = "Lauriane Soares Costa";
		System.out.println(contaDaLauriane.titular);
		
	}

}
