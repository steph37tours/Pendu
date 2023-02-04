import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pendu {

	public static void main(String[] args) {
		System.out.println("jeu de pendu");
		String motChoisi = "TOTO";
		//char lettreChoisie = 'O';
		int position;
		int nbcar=0;
		int nbPerdu=0;
		String [] tableauResultat = new String [4];
		
		//on remplit le tableau
				for (int i=0;i< motChoisi.length();i++) {
					tableauResultat[i]="_";
				}
		
		System.out.println("Entrez un caractère :");
		 
		String lettreChoisie = LectureClavier.lireString();
				
		
		//on recherche si le caractere choisi est présent plusieurs fois
		int j=0;
		do {
		position = motChoisi.indexOf(lettreChoisie,j);
		if (position >=0) {
			//On ajoute le caractere à la position dans le tableau
			tableauResultat[position]= lettreChoisie;
			nbcar++;
			j = position+1;
		}
		}
		while (position >= 0);
		
		if (nbcar==0) nbPerdu++;
		
		
		//on imprime le tableau
		for (int i=0;i< motChoisi.length();i++) {
			System.out.print(tableauResultat[i]);
		}

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
