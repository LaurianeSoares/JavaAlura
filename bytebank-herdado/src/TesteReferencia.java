
public class TesteReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		
		
		EditorDeVideo f = new EditorDeVideo();
		f.setSalario(2000.0);
		
		
		Designer e = new Designer();
		e.setSalario(2500.0);
		
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registro(f);
		controle.registro(g1);
		controle.registro(e);
		
		System.out.println(controle.getSoma());
		

	}

}
