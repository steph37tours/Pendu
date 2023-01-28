
public class Pendu {

	public static void main(String[] args) {
		System.out.println("jeu de pendu");
		String motChoisi = "TOTO";
		char lettreChoisie = 'O';
		int position;
		int nbcar=0;
		String [] tableauResultat = new String [4];
		
		//on recherche si le caractere choisi est présent plusieurs fois
		int j=0;
		do {
		position = motChoisi.indexOf(lettreChoisie,j);
		if (position >=0) {
			//On ajoute le caractere à la position dans le tableau
			tableauResultat[position]= Character. toString(lettreChoisie);
			nbcar++;
			j = position+1;
		}
		}
		while (position >= 0);
		System.out.println(nbcar);
		
		if (position >= 0) {
			int inc = 0;
			for (int i=0;i< motChoisi.length();i++) {
				
				
				if (inc == position) 
					System.out.print(lettreChoisie);
				else 
					System.out.print("_");
				inc++;
			}
			
			
		}
		else {
			for (int i=0;i< motChoisi.length();i++) {
				System.out.print("_");
			}
		}
		

	}

}
