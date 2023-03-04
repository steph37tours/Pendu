import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Fenetre extends JFrame {
	
	
	private JButton bouton = new JButton("Valider");

	public Fenetre() {
		JFrame fenetre = new JFrame();
		this.setTitle("Jeu de Pendu");
		this.setSize(400, 400);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(800, 400);
		
		
		this.setLayout(new BorderLayout());
		
		JLabel ecran = new JLabel("Test");
		
		JPanel b1 = new JPanel();
		b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
		b1.add(ecran);
		JPanel b2 = new JPanel();
		b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));
		
		JPanel b3 = new JPanel();
		b3.setLayout(new BoxLayout(b3, BoxLayout.LINE_AXIS));
		b3.add(bouton);
		
		//on positionne les 3 lignes en colonne
		JPanel b4 = new JPanel();
		b4.setLayout(new BoxLayout(b4,BoxLayout.PAGE_AXIS));
		b4.add(b1);
		b4.add(b2);
		b4.add(b3);
		
		this.getContentPane().add(b4);
		this.setVisible(true);
	}
}

class Panneau extends JPanel{
	//instanciation d'un bouton
	
	
}