
public class _20FuncoesMatematicasEmJava {

	public static void main(String[] args) {
		double x = 3.0;
		double y= 4.0;
		double Z = -5.0;
		
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("A raiz quadrada de " +  x  +" = " +  A );
		System.out.println("A raiz quadrada de " +  x  +" = " +  B );
		System.out.println("A raiz quadrada de  25  = " +  C );
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println( x + " elavado "  +  y  + " = " +  A);
		System.out.println( x + " elavado "  +  2.0  + " = " +  B);
		System.out.println( 5 + " elavado "  +  2.0  + " = " +  C);
		
		A = Math.abs(y);
		B = Math.abs(Z);
		
		
		System.out.println("Valor Absoluto de " + y + " = " + A);
		System.out.println("Valor Absoluto de " + Z + " = " + B);
		
	}

}
