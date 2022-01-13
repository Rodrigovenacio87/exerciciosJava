import java.util.Locale;
import java.util.Scanner;

public class _18EntradaDeDadosEmJavaParte1 {

   
	
	/*
	 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
	 * 
	 * String x; x =sc.next(); System.out.println("Voce digitou:" + x);
	 * 
	 * sc.close();
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
	 * 
	 * int x; x =sc.nextInt(); System.out.println("Voce digitou:" + x);
	 * 
	 * sc.close();
	 */
	  
	 /* public static void main(String[] args) { 
		  
		 Scanner sc = new Scanner(System.in);
		 Locale.setDefault(Locale.US);
		 Double x; 
		 x =sc.nextDouble(); 
		 System.out.println("Voce digitou:" + x);
		 
		  sc.close();*/
	
	
		/*
		 * public static void main(String [] args){
		 * 
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
		 * 
		 * double x; x = sc.nextDouble(); System.out.printf("Voce Digitou: %.2f%n", x );
		 */
			
//			//para ler um caractere 
//			public static void main(String [] args){
//				
//				Locale.setDefault(Locale.US);
//				Scanner Sc = new Scanner(System.in);
//				
//				char x;
//				x = Sc.next().charAt(0);
//				System.out.println("Voce Digitou: " + x );
//				
				// para ler varíos dados na mesma linha
	
	            public static void main(String [] args){
					
				 String x;
				 int y;
				 double z;
				
			    Locale.setDefault(Locale.US);
				Scanner Sc = new Scanner(System.in);
				
				x = Sc.next();
				y = Sc.nextInt();
				z = Sc.nextDouble();
				System.out.println("Dados Digitados: "); 
				System.out.println(x);
				System.out.println(y);
				System.out.println(z);
			
		}
	  
	 }

	 

