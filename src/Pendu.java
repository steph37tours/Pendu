import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pendu {

	public static void main(String[] args) {
		System.out.println("jeu de pendu");
		String rejouer = "O";

		// dans un premier temps, un mot simple
		String motChoisi = "TOTO";
		int position;
		int nbcar;
		int nbPerdu;
		int lettresTrouvees;
		int j;

		boolean condSortie;
		boolean succesEchec;
		String[] tableauResultat = new String[motChoisi.length()];
		do {
			//init
			condSortie = false;
			succesEchec = false;
			nbPerdu = 0;
			j = 0;
			lettresTrouvees = 0;
			nbcar = 0;

			// on remplit le tableau
			for (int i = 0; i < motChoisi.length(); i++) {
				tableauResultat[i] = "_";
			}

			do {
				// on affiche le tableau
				for (int i = 0; i < motChoisi.length(); i++) {
					System.out.print(tableauResultat[i]);
				}

				System.out.println("");
				System.out.println("Entrez un caractère :");

				String lettreChoisie = LectureClavier.lireString();

				// on recherche si le caractere choisi est présent plusieurs fois

				do {
					position = motChoisi.indexOf(lettreChoisie, j);
					if (position >= 0) {
						// On ajoute le caractere à la position dans le tableau
						tableauResultat[position] = lettreChoisie;
						nbcar++;
						// on compte le nombre de lettres trouvées au total
						lettresTrouvees++;
						j = position + 1;
					}
				} while (position >= 0);

				if (nbcar == 0)
					nbPerdu++;

				// on réinitialise les variables :
				nbcar = 0;
				j = 0;

				if (lettresTrouvees >= motChoisi.length()) {
					condSortie = true;
					succesEchec = true;
				}

				if (nbPerdu >= 5) {
					condSortie = true;
				}

			} while (condSortie == false);

			// on affiche le succès ou l'échec
			// on affiche le tableau
			for (int i = 0; i < motChoisi.length(); i++) {
				System.out.print(tableauResultat[i]);
			}

			System.out.println("");
			if (succesEchec == true)
				System.out.println("Bravo vous avez gagné !");
			else
				System.out.println("Perdu!");

			System.out.println("Voulez-vous rejouer ? (O/N)");
			rejouer = LectureClavier.lireString();

		} while (rejouer.equals("O"));

	}

}

class LectureClavier {
	public static String lireString() {
		String ligne = null;
		try {
			InputStreamReader i = new InputStreamReader(System.in);
			BufferedReader b = new BufferedReader(i);
			ligne = b.readLine();
		} catch (IOException e) {
			System.err.println(e);
		}
		return ligne;
	}

	public static int lireInt() {
		return Integer.parseInt(lireString());
	}

	public static double lireDouble() {
		return Double.parseDouble(lireString());
	}
// Nous pouvons imaginer d'autres types de lecture.
}
