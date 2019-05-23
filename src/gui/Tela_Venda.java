package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Tela_Venda extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Venda frame = new Tela_Venda();
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
	public Tela_Venda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 298, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVendedor = new JLabel("Vendedor");
		lblVendedor.setBounds(10, 11, 46, 14);
		contentPane.add(lblVendedor);
		
		textField = new JTextField();
		textField.setBounds(10, 32, 257, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(10, 63, 46, 14);
		contentPane.add(lblCliente);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 84, 257, 20);
		contentPane.add(textField_1);
		
		JLabel lblDescontoGerente = new JLabel("Desconto Gerente");
		lblDescontoGerente.setBounds(10, 121, 87, 14);
		contentPane.add(lblDescontoGerente);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 142, 87, 20);
		contentPane.add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 200, 257, 20);
		contentPane.add(comboBox);
		
		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setBounds(10, 173, 46, 14);
		contentPane.add(lblProduto);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(10, 235, 87, 14);
		contentPane.add(lblQuantidade);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 256, 120, 20);
		contentPane.add(textField_3);
		
		JLabel lblPreco = new JLabel("Preco");
		lblPreco.setBounds(147, 235, 87, 14);
		contentPane.add(lblPreco);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(147, 256, 120, 20);
		contentPane.add(textField_4);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(8, 299, 89, 23);
		contentPane.add(btnFechar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(178, 299, 89, 23);
		contentPane.add(btnSalvar);
	}
}
