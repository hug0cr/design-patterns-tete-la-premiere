import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Exemple du pattern Observer avec les listeners de Swing
 */
public class AngeEtDemonApp {
	JFrame cadre;

	public static void main(String[] args) {
		AngeEtDemonApp exemple = new AngeEtDemonApp();
		exemple.go();
	}

	public void go() {
		cadre = new JFrame();
		JButton bouton = new JButton("Dois-je le faire ?");
		bouton.addActionListener(new AuditeurAnge());
		bouton.addActionListener(new AuditeurDemon());
		cadre.getContentPane().add(BorderLayout.CENTER, bouton);
		// Définir les propriétés du cadre ici
		cadre.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		cadre.setLocationRelativeTo(null);
		cadre.setSize(500, 150);
		cadre.setResizable(false);
		cadre.setTitle("Ange et démon");
		cadre.setVisible(true);
	}

	class AuditeurAnge implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Ne le fais pas, tu pourrais le regretter!");
		}
	}

	class AuditeurDemon implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Allez, vas-y, fais-le ");
		}
	}
}
