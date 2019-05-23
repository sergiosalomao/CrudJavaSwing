package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class TelaPessoa extends JFrame {
	private JTextField pNome;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPessoa frame = new TelaPessoa();
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
	public TelaPessoa() {
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(131, 114, 144, 39);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 353, 290);
		getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Salvar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			}
		});
		btnNewButton_1.setBounds(169, 220, 72, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Fechar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			
			
			}
		});
		btnNewButton_2.setBounds(249, 220, 78, 23);
		getContentPane().add(btnNewButton_2);
		
		pNome = new JTextField();
		pNome.setBounds(10, 46, 316, 20);
		getContentPane().add(pNome);
		pNome.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 93, 316, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 27, 46, 14);
		getContentPane().add(lblNome);
		
		JLabel lblEndereco = new JLabel("Celular");
		lblEndereco.setBounds(10, 77, 46, 14);
		getContentPane().add(lblEndereco);
		
		JLabel lblCelular = new JLabel("Email");
		lblCelular.setBounds(10, 124, 46, 14);
		getContentPane().add(lblCelular);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 140, 316, 20);
		getContentPane().add(textField_2);
		
		JLabel label = new JLabel("Endereco");
		label.setBounds(10, 169, 46, 14);
		getContentPane().add(label);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 189, 316, 20);
		getContentPane().add(textField_3);
		
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 1;
	}
}
