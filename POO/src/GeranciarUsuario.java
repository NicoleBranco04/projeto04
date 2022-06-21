
public class GeranciarUsuario {

	public static void main(String[] args) {
		Usuario us = new Usuario();
        us.nomeUsuario = "Admin";
        us.senha = "123";
        us.nivleAcesso = "Admin";
        us.criarUsuario();
		
	}

}
