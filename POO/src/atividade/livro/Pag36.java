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
		number1 = input.nextInt(); // l� primeiro o n�mero fornecido pelo usu�rio
		
		System.out.print("Enter second integer: "); //prompt
        number2 = input.nextInt(); // l� o segundo n�mero fornecidopelo usu�rio 
        
        sum = number1 + number2; // soma os n�meros, depois armazena o total em sum
        
        System.out.printf("Sum is %d%n", sum);// exibe a soma
	} // fim do m�todo
     // fim da classe
}
