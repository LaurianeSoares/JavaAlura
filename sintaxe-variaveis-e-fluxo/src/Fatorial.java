
public class Fatorial {
	public static void main(String[] args) {
		int numero = 6;
		int inicio = 1;
		int fim = 0 ;
		int fatorial=1;;
		System.out.print("O Fatorial de !"+numero+ " = ");
		for(int n = 1; n<10;n++) {
			if(n>numero) 
				break;
			
			if(n==1) {
				System.out.print(n);
			}else {
			System.out.print(" x " + n);
			}
			
				
			fim = n;
			fatorial = fatorial * n;
			
			
			
		}
		System.out.println( " = " + fatorial);
	}

}
