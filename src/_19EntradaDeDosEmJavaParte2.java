import java.util.Scanner;

public class _19EntradaDeDosEmJavaParte2 {

//	public static void main(String[] args) {
//		
//		//Para Ler um texto Até a quebra de linha;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		String xbox, Ps4, Nintendo;
//		
//		xbox = sc.nextLine();
//		Ps4 = sc.nextLine();
//		Nintendo = sc.nextLine();
//		
//		System.out.println("Você Digitou: ");
//		System.out.println(xbox);
//		System.out.println(Ps4);
//		System.out.println(Nintendo);

	public static void main(String[] args) {
		
		int x;
		String s1, s2, s3;
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt(); // quando usa comando de leitura diferente do nextline e da uma quebra de linha, essa quebra de linha, fica "pendente" na entrada padrao.
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
	
		
		System.out.println("Dados Digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	

	}
}