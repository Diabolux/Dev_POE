package calculatrice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calcul extends JFrame {

	private String operateur = ""; // string qui va contenir l'opérateur sur lequel on appuie
	private double resultat = 0;
	private boolean notFirstOperation = false;

	// Déclaration de la calculatrice
	public Calcul() {

		// Création de la fenêtre
		super("Ma Calculatrice");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);

		// Déclaration des boutons
//		for(int i = 1 ; i < 16 ; i++) {
//			JButton bouton[i] = new JButton("\"" + i + "\"");
//		}
		JButton bouton1 = new JButton("1");
		JButton bouton2 = new JButton("2");
		JButton bouton3 = new JButton("3");
		JButton bouton4 = new JButton("4");
		JButton bouton5 = new JButton("5");
		JButton bouton6 = new JButton("6");
		JButton bouton7 = new JButton("7");
		JButton bouton8 = new JButton("8");
		JButton bouton9 = new JButton("9");
		JButton bouton10 = new JButton(".");
		JButton bouton11 = new JButton("+");
		JButton bouton12 = new JButton("-");
		JButton bouton13 = new JButton("*");
		JButton bouton14 = new JButton("/");
		JButton bouton15 = new JButton("=");
		JButton bouton16 = new JButton("C");

		// Ajout des Actions sur les boutons
		bouton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('1');
				afficherTableau();
			}
		});
		bouton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('2');
				afficherTableau();
			}
		});
		bouton1.setSize(100, 100);
		bouton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('3');
				afficherTableau();
			}
		});
		bouton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('4');
				afficherTableau();
			}
		});
		bouton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('5');
				afficherTableau();
			}
		});
		bouton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('6');
				afficherTableau();
			}
		});
		bouton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('7');
				afficherTableau();
			}
		});
		bouton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('8');
				afficherTableau();
			}
		});
		bouton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('9');
				afficherTableau();
			}
		});
		bouton10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('.');
			}
		});
		bouton11.addActionListener(new PlusListener());
		bouton12.addActionListener(new MinusListener());
		bouton13.addActionListener(new MultiListener());
		bouton14.addActionListener(new DivListener());
		bouton15.addActionListener(new EqualListener());
		bouton16.addActionListener(new CleanListener());

		// Ajout des boutons sur la fenêtre
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		
//		for(int i = 1 ; i < 16 ; i++) {
//			contentPane.add(bouton+i);
//		}
		
		contentPane.add(bouton1);
		contentPane.add(bouton2);
		contentPane.add(bouton3);
		contentPane.add(bouton4);
		contentPane.add(bouton5);
		contentPane.add(bouton6);
		contentPane.add(bouton7);
		contentPane.add(bouton8);
		contentPane.add(bouton9);
		contentPane.add(bouton10);
		contentPane.add(bouton11);
		contentPane.add(bouton12);
		contentPane.add(bouton13);
		contentPane.add(bouton14);
		contentPane.add(bouton15);
		contentPane.add(bouton16);
	}

	private void calcul() {
		if (operateur.equals("+")) {
			resultat += Double.parseDouble(tab);// Double.parseDouble(String) permet de transformer une chaîne de caractère en double
		}
		if (operateur.equals("-")) {
			resultat -= Double.parseDouble(tab);
		}
		if (operateur.equals("*")) {
			resultat *= Double.parseDouble(tab);
		}
		if (operateur.equals("/")) { // Nécessaire de faire un test si division par 0 pour renvoyer une erreur
			// Mettre à jour l'écran avec résultat de l'opération transformé au préalable en
			// String
		}
	}

	class PlusListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			// nécessaire de tester si première opération pour enregistrer la première
			// valeur dans resultat
			if (notFirstOperation) {
				// mettre code pour afficher le résultat de la dernière opération effectuée
				calcul(); // appel de la méthode calcul
				System.out.println(resultat);
				tab="";
			} else {
				resultat = Double.parseDouble(tab);
				notFirstOperation = true;
				tab="";
			}
			operateur = "+"; // on met + dans opérateur pour pouvoir le comparer dans la méthode calcul

		}
	}

	class MinusListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			
			if (notFirstOperation) {
				// mettre code pour afficher le résultat de la dernière opération effectuée
				calcul(); // appel de la méthode calcul
				System.out.println(resultat);
				tab="";
			} else {
				resultat = Double.parseDouble(tab);
				notFirstOperation = true;
				tab="";
			}
			operateur = "-"; // on met + dans opérateur pour pouvoir le comparer dans la méthode calcul
		}
	}

	class MultiListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			
			if (notFirstOperation) {
				// mettre code pour afficher le résultat de la dernière opération effectuée
				calcul(); // appel de la méthode calcul
				System.out.println(resultat);
				tab="";
			} else {
				resultat = Double.parseDouble(tab);
				notFirstOperation = true;
				tab="";
			}
			operateur = "*"; // on met + dans opérateur pour pouvoir le comparer dans la méthode calcul
		}
	}

	class DivListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			
			if (notFirstOperation) {
				// mettre code pour afficher le résultat de la dernière opération effectuée
				calcul(); // appel de la méthode calcul
				System.out.println(resultat);
				tab="";
			} else {
				resultat = Double.parseDouble(tab);
				notFirstOperation = true;
				tab="";
			}
			operateur = "/"; // on met + dans opérateur pour pouvoir le comparer dans la méthode calcul
		}
	}

	class CleanListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			// mettre code pour afficher 0 à l'écran
			notFirstOperation = false; // remise à false car la prochaine opération en sera une nouvelle

		}
	}

	class EqualListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			calcul();
			// mettre code pour afficher le résultat de la dernière opération effectuée
			notFirstOperation = false; // remise à false car la prochaine opération en sera une nouvelle
			System.out.println(resultat);
			tab = "";
		}
	}

	/*
	 * Booléen qui indique si on est en train d'entrer le premier ou le deuxieme
	 * nombre du calcul false -> saisie du premier nombre true -> saisie du deuxieme
	 * nombre
	 */
	static boolean nb = false;

	/*
	 * Booléen qui indique si une virgule a déjà été saisie dans le nombre false ->
	 * aucune virgule n'a été saisie true -> une virgule a déjà été saisie
	 */
	static boolean virgule = false;

	// Chaine de caractère qui stocke temporairement le nombre saisi
	static String tab = "";

	// Les nombres du calcul
	static double nombre1;
	static double nombre2;

	// Ajoute le chiffre qui vient d'être saisi à la fin de la chaine de caractère
	public static void ajouter(char a) {
		tab += a;
	}

	// Convertit la chaine de caratère en double et l'affiche
	public static void afficherTableau() {
		System.out.println("Valeur = " + Double.parseDouble(tab));
	}

	// Réinitialise les valeurs des nombres à 0 et les booleens à false
	public static void reset() {
		nb = false;
		virgule = false;
		tab = "";
		nombre1 = 0;
		nombre2 = 0;
	}

	public static void main(String[] args) {

		// Création de la calculatrice
		Calcul calculatrice = new Calcul();
		calculatrice.setVisible(true);

	}
}
