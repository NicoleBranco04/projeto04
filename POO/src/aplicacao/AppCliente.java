package aplicacao;

import java.util.Scanner;

import classes.Cliente;
import repositorio.RepoCliente;

public class AppCliente {

	public static void main(String[] args) {
	
		Scanner tela = new Scanner(System.in);
		
		Cliente cli = null;
		RepoCliente rc = new RepoCliente();
		
		String resposta = "";
		
		while(!resposta.equals("n")) {
		cli = new Cliente();
		
	    System.out.println(resposta);
			
		System.out.println("Digite o nome do cliente: ");
		cli.nome = tela.next();
	
		System.out.println("Digite o email do Cliente: ");
		cli.email = tela.next();
	
		System.out.println("Digite o cpf do cliente: ");
		cli.cpf = tela.next();	
	    
		rc.cadastrar(cli);
		
		System.out.println("\nVoc? deseja cadastrar outro cliente? Digite n para n?o e s para sim");
		resposta = tela.next();
	}
		
        System.out.println("-----------Cliente cadastrados------------");
        rc.listar();
        
        System.out.println("-------------Clientes Cliente atualizados--------------");
        Cliente cli2 =  new Cliente();
        cli2.nome = "Marcos";
        cli2.email = "marcos@uol.com";
        cli2.cpf = "15975364210";
        rc.atualizar(cli2);
        rc.listar();
        
        System.out.println("-----------Clientes cliente deletado----------");
        rc.deletar("heitor");
        
	}
  
}
