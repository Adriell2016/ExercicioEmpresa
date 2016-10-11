import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = ler.next()+ler.nextLine();
		
		System.out.println("Digite seu peso: ");
		double peso = ler.nextDouble();
		
		System.out.println("Digite sua altura: ");
		double altura = ler.nextDouble();
		
		Pessoa pessoa = new Pessoa(nome,peso,altura);
		
		String imc = pessoa.indiceMassaCorporal();
		System.out.println(imc);
		
		ler.close();
	}

}
