import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		 
		//int y = 32;
		double x = 10.35784;
		
		
		//System.out.printf("%.2f%n",x);
		//System.out.println(x);
		Locale.setDefault(Locale.US);
		//System.out.printf("%.4f%n",x);
		System.out.println("Resultado = " + x + "metros");
		System.out.printf("Resultado = %.2f Metros %n",x);
		
	}

}
