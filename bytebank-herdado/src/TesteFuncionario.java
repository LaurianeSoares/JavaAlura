
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente funcionario = new Gerente();
		
		funcionario.setNome("Lauriane Soares");
		funcionario.setCpf("111111111-22");
		funcionario.setSalario(5000);
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getCpf());
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.getBonificacao());
		

	}

}
