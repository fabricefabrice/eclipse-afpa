
public class ExoVariable {

	public static void main(String[] args) {

	float note = 14.5f ;
	int coef = 3 ;
		float resultat = note * coef ;
	System.out.println("Resultat = " + resultat ) ;
	
	note = 12.0f ;
			coef = 5 ;
			System.out.println("Resultat = " + resultat ) ;
			
			float noteJava = 10.5f  ;
			float noteHtml = 13.2f ;
			float noteJavascipt = 11.3f ;
			float noteCSS = 8.5f ;
			float moyenne = (noteJava + noteHtml + noteJavascipt +noteCSS)  /  4  ;
			System.out.println("La Moyenne : " + moyenne ) ;
			
			
			int coefjava = 3 ;
					int coefhtml = 2 ;
					int coefjavascript = 3 ;
					int coefCSS = 1 ;
			
					float java = noteJava * coef;
					float html = noteHtml  * coefhtml ;
					float javascript = noteJavascipt * coefjavascript;
					float css = noteCSS * coefCSS;
					float moyenneGenerale = (java + html + javascript + css) / (coefjava+coefhtml+coefjavascript+coefCSS) ;
					System.out.println("Moyenne generale : " + moyenneGenerale) ;
			
			
					
			
		
			
			
				
		
		


	}

}
