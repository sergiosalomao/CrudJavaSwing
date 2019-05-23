package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Tela_Produto extends JFrame {

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
					Tela_Produto frame = new Tela_Produto();
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
	public Tela_Produto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 293, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(11, 21, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 37, 261, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(11, 84, 122, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Preco Compra");
		lblNewLabel_1.setBounds(11, 68, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Preco Venda");
		lblNewLabel_2.setBounds(149, 63, 96, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(149, 84, 122, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Estoque");
		lblNewLabel_3.setBounds(11, 115, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(11, 138, 122, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEstoqueMinimo = new JLabel("Estoque Minimo");
		lblEstoqueMinimo.setBounds(149, 115, 79, 14);
		contentPane.add(lblEstoqueMinimo);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(149, 138, 122, 20);
		contentPane.add(textField_4);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(11, 169, 63, 23);
		contentPane.add(btnSalvar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(200, 169, 71, 23);
		contentPane.add(btnFechar);
	}

}
