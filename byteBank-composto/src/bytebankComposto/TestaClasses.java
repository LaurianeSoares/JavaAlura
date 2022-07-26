package bytebankComposto;

public class TestaClasses {

	public static void main(String[] args) {
		
		Cliente lauriane = new Cliente();
		lauriane.nome = "Lauriane Soares Costa";
		lauriane.cpf = "111.111.111-11";
		lauriane.profissao = "programadora";
		Conta contadaLauriane = new Conta();
		contadaLauriane.deposita(100);
		
		//Associa cliente Lauriane à contadaLauriane
		contadaLauriane.titular = lauriane;
		System.out.println(contadaLauriane.titular.nome);
		System.out.println(contadaLauriane.titular);
		System.out.println(lauriane);
		
	}
	
}
