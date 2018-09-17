
public class ExoTableau1D {

	public static void main(String[] args) {
		

		int  [] entiersPremiers = {2, 3, 5, 7, 11, 13, 17, 19, 23} ;
		
		int recherche = 11 ;
		
		boolean existe = false ;
		
		for (int i  = 0; i < entiersPremiers.length; i++) {
			if(recherche==entiersPremiers[i]) {
				existe = true ;
			}
			if(existe) {
				System.out.println("le nombre" + recherche +"existe dans le tableau");
			} else {
				System.out.println("le nombre" + recherche +"n'existe pas dans le tableau");
				
			}
		}
		
		
	}

}
