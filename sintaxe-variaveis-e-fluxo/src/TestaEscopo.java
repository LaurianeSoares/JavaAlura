
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado;
		
		if(quantidadePessoas >=2) {
			 acompanhado = true;
			
		}else {
			 acompanhado = false;
		}
		
		//boolean acompanhado = quantidadePessoas >=2;;
		//if(idade >= 18 || quantidadePessoas>=2) {
		if(idade >=18 && acompanhado) {
			System.out.println("Seja bem vindo!");
			
		}else{
			
			System.out.println("Infelizmente voce n�o pode entrar");
			
		}
		
	}

}
