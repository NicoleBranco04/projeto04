package atividade.livro;

import java.util.Scanner;


public class Pag36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cria um scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.print("Enter first integer: "); // prompt
		number1 = input.nextInt(); // lê primeiro o número fornecido pelo usuário
		
		System.out.print("Enter second integer: "); //prompt
        number2 = input.nextInt(); // lê o segundo número fornecidopelo usuário 
        
        sum = number1 + number2; // soma os números, depois armazena o total em sum
        
        System.out.printf("Sum is %d%n", sum);// exibe a soma
	} // fim do método
     // fim da classe
}
