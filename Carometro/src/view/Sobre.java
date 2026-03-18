package view;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.event.ActionEvent;

public class Sobre extends JDialog {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setTitle("Sobre o Carômetro");
		setResizable(false);
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/instagram.png")));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Projeto Carômetro");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(23, 25, 175, 18);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("@Professora Sirlene Sanches");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(23, 73, 208, 18);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sob a licença MIT");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(23, 120, 155, 18);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Sobre.class.getResource("/img/mit.png")));
		lblNewLabel_3.setBounds(285, 25, 96, 96);
		getContentPane().add(lblNewLabel_3);
		
		//Evento do botão Github
		JButton btnGithub = new JButton("");
		btnGithub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://github.com/");
				
			}
		});
		
		btnGithub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGithub.setContentAreaFilled(false);
		btnGithub.setBorderPainted(false);
		btnGithub.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		btnGithub.setBounds(55, 177, 48, 48);
		getContentPane().add(btnGithub);
		
		//Evento Botão OK
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		btnOK.setForeground(SystemColor.menu);
		btnOK.setBackground(SystemColor.controlDkShadow);
		btnOK.setFont(new Font("Arial", Font.BOLD, 12));
		btnOK.setBounds(299, 192, 80, 25);
		getContentPane().add(btnOK);
	}
	
	//Método Github
	private void link(String url) {
		Desktop desktop = Desktop.getDesktop();
		
		try {
			URI uri = new URI(url);
			desktop.browse(uri);
			
		} catch (Exception e) {
			System.out.println(e);
		}		
	}
}






