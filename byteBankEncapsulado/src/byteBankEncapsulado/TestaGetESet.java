package byteBankEncapsulado;

public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337,24226);
		//conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente lauriane = new Cliente();
		conta.setTitular(lauriane);
		
		lauriane.setNome("Lauriane Soares Costa");
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());
		
		System.out.println(titularDaConta);
		System.out.println(lauriane);
		System.out.println(conta.getTitular());
	}
}
	