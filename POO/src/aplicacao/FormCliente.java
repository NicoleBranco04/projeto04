package aplicacao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import classes.PrjCliente;
import classes.PrjEndereco;
import classes.PrjUsuario;
import repositorio.RepoSistema;

public class FormCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdCliente;
	private JTextField txtEmail;
	private JTextField txtnomeCliente;
	private JTextField txtIdUsuario;
	private JTextField txtBairro;
	private JPasswordField txtSenha;
	private JTextField txtIdEndereco;
	private JTextField txtLogradouro;
	private JTextField txtNumero;
	private JTextField txtNomeUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCliente frame = new FormCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormCliente() {
		setTitle("Gerenciar Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 857, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCliente = new JLabel("ID do Cliente :");
		lblCliente.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblCliente.setBounds(10, 11, 82, 14);
		contentPane.add(lblCliente);
		
		txtIdCliente = new JTextField();
		txtIdCliente.setBounds(10, 30, 65, 20);
		contentPane.add(txtIdCliente);
		txtIdCliente.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-Mail:");
		lblEmail.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblEmail.setBounds(10, 61, 46, 14);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		txtEmail.setBounds(10, 79, 300, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblNomeCliente_1 = new JLabel("Nome do Cliente:");
		lblNomeCliente_1.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblNomeCliente_1.setBounds(135, 11, 82, 14);
		contentPane.add(lblNomeCliente_1);
		
		txtnomeCliente = new JTextField();
		txtnomeCliente.setFont(new Font("Times New Roman", Font.ITALIC, 10));
		txtnomeCliente.setColumns(10);
		txtnomeCliente.setBounds(135, 30, 207, 20);
		contentPane.add(txtnomeCliente);
		
		JLabel lblIdDoUsurio = new JLabel("id do Usu\u00E1rio:");
		lblIdDoUsurio.setForeground(new Color(0, 0, 0));
		lblIdDoUsurio.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblIdDoUsurio.setBounds(10, 126, 82, 14);
		contentPane.add(lblIdDoUsurio);
		
		txtIdUsuario = new JTextField();
		txtIdUsuario.setColumns(10);
		txtIdUsuario.setBounds(10, 151, 65, 20);
		contentPane.add(txtIdUsuario);
		
		JLabel lblNomeUsuario = new JLabel("Nome do Usu\u00E1rio:");
		lblNomeUsuario.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblNomeUsuario.setBounds(135, 126, 102, 14);
		contentPane.add(lblNomeUsuario);
		
		txtBairro = new JTextField();
		txtBairro.setFont(new Font("Times New Roman", Font.ITALIC, 10));
		txtBairro.setColumns(10);
		txtBairro.setBounds(135, 317, 207, 20);
		contentPane.add(txtBairro);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblSenha.setBounds(10, 176, 46, 14);
		contentPane.add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(10, 201, 97, 20);
		contentPane.add(txtSenha);
		
		JLabel lblIdDoEndereo = new JLabel("id do Endere\u00E7o:");
		lblIdDoEndereo.setForeground(Color.BLACK);
		lblIdDoEndereo.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblIdDoEndereo.setBounds(10, 232, 82, 14);
		contentPane.add(lblIdDoEndereo);
		
		txtIdEndereco = new JTextField();
		txtIdEndereco.setText("                          ");
		txtIdEndereco.setColumns(10);
		txtIdEndereco.setBounds(10, 260, 65, 20);
		contentPane.add(txtIdEndereco);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblLogradouro.setBounds(135, 232, 102, 14);
		contentPane.add(lblLogradouro);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setFont(new Font("Times New Roman", Font.ITALIC, 10));
		txtLogradouro.setColumns(10);
		txtLogradouro.setBounds(135, 261, 207, 20);
		contentPane.add(txtLogradouro);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblNmero.setBounds(5, 291, 102, 14);
		contentPane.add(lblNmero);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(10, 316, 65, 20);
		contentPane.add(txtNumero);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblBairro.setBounds(135, 286, 207, 20);
		contentPane.add(lblBairro);
		
		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setFont(new Font("Times New Roman", Font.ITALIC, 10));
		txtNomeUsuario.setColumns(10);
		txtNomeUsuario.setBounds(142, 143, 207, 20);
		contentPane.add(txtNomeUsuario);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   
				//Instância da classe PRJUsuario
				PrjUsuario usuario =  new PrjUsuario();
				//Instância da classe PRJEndereço
				PrjEndereco endereco = new PrjEndereco();
				//Instância da classe PRJCliente
				PrjCliente cliente = new PrjCliente();
				//Vamos adicionar o cliente a memória com RepoSistema
				RepoSistema rs = new RepoSistema();
				
				//o id usuário recebe apenas números inteiros, porem a caixa em que é digitado o id do tipo text.
				//Portanto, se faz necessário realizar uma conversão de texto para inteiro com o comando  Integer parseInt.
				usuario.idUsuario = Integer.parseInt(txtIdUsuario.getText());
				usuario.nomeUsuario = txtNomeUsuario.getText();
				usuario.senha = txtSenha.getText();
				
				endereco.idEndereco = Integer.parseInt(txtIdEndereco.getText());
				endereco.logradouro = txtLogradouro.getText();
				endereco.numero = txtNumero.getText();
				endereco.bairro = txtBairro.getText();
				
				cliente.idCliente = Integer.parseInt(txtIdCliente.getText());
				cliente.nomeCliente = txtnomeCliente.getText();
				cliente.email = txtEmail.getText();
				
				
				JOptionPane.showMessageDialog(null, rs.cadUsuario(usuario)+"\n"+rs.cadEndereco(endereco)+"\n"+rs.cadCliente(cliente));
			}
		});
		btnCadastrar.setBounds(308, 394, 122, 23);
		contentPane.add(btnCadastrar);
	}
}
