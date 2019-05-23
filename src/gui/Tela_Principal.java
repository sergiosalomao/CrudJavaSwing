package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JMenuItem;

public class Tela_Principal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Principal window = new Tela_Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela_Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 800, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Cadastros");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmPessoas = new JMenuItem("Pessoas");
		mntmPessoas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaPessoa Tela = new TelaPessoa();
				Tela.show();
				
				
			}
		});
		mnNewMenu_1.add(mntmPessoas);
		
		JMenu mnNewMenu_2 = new JMenu("Estoque");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmProdutos = new JMenuItem("Produtos");
		mnNewMenu_2.add(mntmProdutos);
		
		JMenu mnVendas = new JMenu("Vendas");
		menuBar.add(mnVendas);
	}
}
