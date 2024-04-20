package executavel;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declarando as variáveis e vetores utilizados
		int a = 0, b = 0, numeroAtual;
		int numeroPar[] = new int[30];
		int numeroImpar[] = new int[30];
		
		System.out.println("Esse programa recebe valores e imprime a quantidade de pares e impares!");
		System.out.println("Digite '-1' para encerrar a leitura e mostrar os valores!");
		
		do {
			System.out.printf("Informe um número: ");
			numeroAtual = sc.nextInt();
			
			//Teste se o numero é par ou impar para armazenar no vetor e incrementar o contador 
			if (numeroAtual % 2 == 0) {
				numeroPar[a] = numeroAtual;
				System.out.println("Número Par Salvo!");
				a++;
			}
			
			else {
				numeroImpar[b] = numeroAtual;
				System.out.println("Número Impar Salvo!");
				b++;
			}
			
		} while (numeroAtual != -1);
		
		//Percorre os valores armazenados no vetor para mostrar ao usuário
		System.out.println("Números Pares Digitados:");
		for (int i = 0; i < a; i++) {
			System.out.printf("%d ",numeroPar[i]);
		} 
		
		System.out.printf("\nNúmeros Impares Digitados:\n");
		for (int i = 0; i < b; i++) {
			System.out.printf("%d ",numeroImpar[i]);
		}
		
		System.out.printf("\nNúmeros Pares = "+a);
		System.out.printf("\nNúmeros Impares = "+b);
	}
		
}


