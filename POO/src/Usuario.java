
public class Usuario {
    public String nomeUsuario;
    public String senha;
    public String nivleAcesso;
    
    public void criarUsuario() {
    	System.out.println("Usu�rio criado com sucesso!");
    }
    void logar(String nomeUsuario, String senha){
        if (this.nomeUsuario==nomeUsuario && this.senha==senha){
            System.out.println("Bem Vindo");
        }
        else{
            System.out.println("Usu�rio ou senha incorreta");
        }
    }
}
