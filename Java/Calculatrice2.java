package calculatrice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.border.LineBorder;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Calculatrice2 {

	/*
	 * Déclaration des variables utilisées dans le programme
	 */
	static boolean virgule = false;
	static boolean op = false;
	private boolean div0 = false;
	private boolean neg = false;
	boolean erreur = false;
	private boolean secondNumber = false;
	private String operateur = ""; // string qui va contenir l'opérateur sur lequel on appuie
	static String tab = ""; // String qui stocke temporairement le nombre saisi
	private double resultat = 0;
	private static String affichage = ""; // String qui sert à afficher le résultat

	private JLabel actionReceived;
	private JFrame frmCalculette;
	private static JTextField valeur2;
	private static JTextField valeur1;

	/*
	 * Create the application.
	 */
	public Calculatrice2() {
		initialize();
	}

	/*
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// Création de l'application
		frmCalculette = new JFrame();
		frmCalculette.setTitle("Calculette"); // Nom de l'application
		frmCalculette.setBounds(100, 100, 302, 367); // Taille de la fenêtre
		frmCalculette.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Paramètre de fermeture
		frmCalculette.getContentPane().setLayout(null);

		/*
		 * Création des boutons
		 */
		JButton btnNewButton = new JButton("1"); // Création d'un nouveau bouton
		btnNewButton.addActionListener(new ActionListener() { // Ajout d'event listener
			public void actionPerformed(ActionEvent e) {
				ajouter('1');
				afficherTableau();
			}
		});
		btnNewButton.setBounds(10, 103, 58, 34); // Taille du bouton
		frmCalculette.getContentPane().add(btnNewButton); // Ajout du bouton à la frame

		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = false;
				ajouter('2');
				afficherTableau();
			}
		});
		btnNewButton_1.setBounds(78, 103, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = false;
				ajouter('3');
				afficherTableau();
			}
		});
		btnNewButton_2.setBounds(146, 103, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_2);

		JButton btnC = new JButton("C");
		btnC.addActionListener(new CleanListener());
		btnC.setForeground(Color.RED);
		btnC.setBounds(214, 103, 58, 34);
		frmCalculette.getContentPane().add(btnC);

		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = false;
				ajouter('4');
				afficherTableau();
			}
		});
		btnNewButton_4.setBounds(10, 148, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = false;
				ajouter('5');
				afficherTableau();
			}
		});
		btnNewButton_5.setBounds(78, 148, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = false;
				ajouter('6');
				afficherTableau();
			}
		});
		btnNewButton_6.setBounds(146, 148, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("9");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = false;
				ajouter('9');
				afficherTableau();
			}
		});
		btnNewButton_7.setBounds(146, 193, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = false;
				ajouter('8');
				afficherTableau();
			}
		});
		btnNewButton_8.setBounds(78, 193, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("7");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = false;
				ajouter('7');
				afficherTableau();
			}
		});
		btnNewButton_9.setBounds(10, 193, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("0");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = false;
				ajouter('0');
				afficherTableau();
			}
		});
		btnNewButton_10.setBounds(10, 239, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_10);

		JButton btnNewButton_11 = new JButton(".");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = false;
				testVirgule();
			}
		});
		btnNewButton_11.setBounds(78, 238, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_11);

		JButton btnNewButton_12 = new JButton("/");
		btnNewButton_12.addActionListener(new DivListener());
		btnNewButton_12.setBounds(146, 238, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_12);

		JButton btnNewButton_13 = new JButton("+");
		btnNewButton_13.addActionListener(new PlusListener());
		btnNewButton_13.setBounds(214, 148, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_13);

		JButton btnNewButton_14 = new JButton("-");
		btnNewButton_14.addActionListener(new MinusListener());
		btnNewButton_14.setBounds(214, 193, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_14);

		JButton btnNewButton_15 = new JButton("*");
		btnNewButton_15.addActionListener(new MultiListener());
		btnNewButton_15.setBounds(214, 239, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_15);

		JButton btnNewButton_16 = new JButton("=");
		btnNewButton_16.addActionListener(new EqualListener());
		btnNewButton_16.setFont(new Font("Dialog", Font.BOLD, 18));
		btnNewButton_16.setForeground(Color.DARK_GRAY);
		btnNewButton_16.setBounds(78, 284, 194, 34);
		frmCalculette.getContentPane().add(btnNewButton_16);

		JButton btnNewButton_17 = new JButton("(-)");
		btnNewButton_17.addActionListener(new MultiListener());
		btnNewButton_17.setBounds(10, 284, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_17);

		JEditorPane editorPane = new JEditorPane();
		editorPane.setFont(new Font("Dialog", Font.PLAIN, 20));
		editorPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		editorPane.setBounds(10, 12, 262, 79);
		frmCalculette.getContentPane().add(editorPane);

		/*
		 * Création de textField pour afficher les opérations
		 */
		valeur1 = new JTextField();
		valeur1.setText(" ");
		valeur1.setHorizontalAlignment(SwingConstants.RIGHT);
		valeur1.setFont(new Font("Dialog", Font.PLAIN, 15));
		valeur1.setBorder(new LineBorder(new Color(0, 0, 0)));
		valeur1.setBounds(146, 23, 114, 20);
		frmCalculette.getContentPane().add(valeur1);
		valeur1.setColumns(10);

		valeur2 = new JTextField();
		valeur2.setText("0");
		valeur2.setFont(new Font("Dialog", Font.BOLD, 20));
		valeur2.setBorder(new LineBorder(new Color(0, 0, 0)));
		valeur2.setBounds(10, 12, 262, 79);
		frmCalculette.getContentPane().add(valeur2);
		valeur2.setColumns(10);

		actionReceived = new JLabel(""); // making global variable
		actionReceived.setBackground(UIManager.getColor("Button.foreground"));
		actionReceived.setForeground(UIManager.getColor("Button.background"));
		actionReceived.setBounds(10, 295, 55, 16);
		frmCalculette.getContentPane().add(actionReceived);
	}

	/*
	 * Début récupération chiffre et calcul
	 */

	// Ajoute le chiffre qui vient d'être saisi à la fin de la chaine de caractère
	public static void ajouter(char a) {
		System.out.println(a);
		tab += a;
	}

	// Convertit la chaine de caratère en double et l'affiche
	public static void afficherTableau() {
		System.out.println("Valeur = " + Double.parseDouble(tab));
		affichage = "" + Double.parseDouble(tab);
		valeur2.setText(affichage);
	}

	// les différentes fonction de calcul
	private void calcul() {
		double number = Double.parseDouble(tab);
		if(neg) {
			number *= -1;
		}
		if (operateur.equals("+")) {
			resultat += number;// Double.parseDouble(String) permet de transformer une chaîne de caractères en double
		}
		if (operateur.equals("-")) {
			resultat -= number;
		}
		if (operateur.equals("*")) {
			resultat *= number;
		}
		if (operateur.equals("/")) { // Nécessaire de faire un test si division par 0 pour renvoyer une erreur
			if (Double.parseDouble(tab) != 0.0) {
				resultat = resultat / number;
				System.out.println("réussi");
			} else {
				div0 = true;
			}
		}
	}

	// Description des tâches à effectuer en cas d'activation d'event listener
	class PlusListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			/*
			 * on teste si on à pas cliqué sur 2 opérateurs différents à la suite
			 */
			if (op == false) {
				op = true;
				System.out.println(operateur);
				/*
				 * on teste si première opération pour enregistrer la première
				 * valeur dans resultat
				 */
				if (secondNumber) {
					calcul(); // appel de la méthode calcul
					System.out.println(resultat);
					testDivPar0();
				} else {
					resultat = Double.parseDouble(tab);
					secondNumber = true;
					tab = "";
					virgule = false;
				}
				operateur = "+"; // on met + dans opérateur pour pouvoir le comparer dans la méthode calcul

			}
		}
	}

	class MinusListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			if (op == false) {
				op = true;
				if (secondNumber) {
					calcul(); // appel de la méthode calcul
					System.out.println(resultat);
					testDivPar0();
				} else {
					resultat = Double.parseDouble(tab);
					secondNumber = true;
					tab = "";
					virgule = false;
				}
				operateur = "-";

			}
		}
	}

	class MultiListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			if (op == false) {
				op = true;
				if (secondNumber) {
					calcul(); // appel de la méthode calcul
					System.out.println(resultat);
					testDivPar0();
				} else {
					resultat = Double.parseDouble(tab);
					secondNumber = true;
					tab = "";
					virgule = false;
				}
				operateur = "*"; 

			}

		}
	}

	class DivListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			if (op == false) {
				op = true;
				if (secondNumber) {
					calcul(); // appel de la méthode calcul
					affichage = "" + resultat;
					testDivPar0();
				} else {
					resultat = Double.parseDouble(tab);
					secondNumber = true;
					tab = "";
					virgule = false;
				}
				operateur = "/";

			}

		}
	}

	class NegListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			neg = true;
			op = true;
		}
	}

	class CleanListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			// mettre code pour afficher 0 à l'écran
			secondNumber = false; // remise à false car la prochaine opération en sera une nouvelle
			tab = affichage = "";
			op = false;
			valeur2.setText(affichage);
			resultat = 0;
			virgule = false;
		}
	}

	class EqualListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			calcul();
			testDivPar0();
			secondNumber = false; // remise à false car la prochaine opération en sera une nouvelle
			affichage = "";
			div0 = false;
		}

	}

	private void testVirgule() {
		if (virgule) {
		} else {
			ajouter('.');
			virgule = true;
		}
	}

	private void testDivPar0() {
		if (div0 == false) {
			System.out.println(resultat);
			affichage = "" + resultat;
			valeur2.setText(affichage);
			tab = "";
			virgule = false;
		} else {
			valeur2.setText("ERREUR");
			virgule = false;
		}
	}

	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculatrice2 window = new Calculatrice2();
					window.frmCalculette.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}