
public class TestaLacos {
	public static void main(String[] args) {
		System.out.println("Imprimindo a Tabuada: ");
		
		for(int i = 1; i<=10 ; i++) {
			System.out.println("Tabuada do " + i);
			for(int y = 0; y<=10 ; y++) {
				
				System.out.println(i + " X " + y + " = " + i * y);
			}
			System.out.println();
		}
	}
}
