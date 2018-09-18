
public class Methodes  {

	public static void main(String[] args)  {
		int resultat1= addition (12, 15) ;
		int resultat2 = soustraction (16, 18) ;
		int resultat3 = multiplication (5, 18) ;
		int resultat4 = division (308, 12) ;
		
		System.out.println(resultat1 + ",  "+ resultat2 + ",  " + resultat3 + ",  " + resultat4);
		//System.out.println(resultat2);
		//System.out.println(resultat3);
		//System.out.println(resultat4);
	}

	public static int addition (int nombre1, int nombre2)   {
		return nombre1 + nombre2;	
	}
	
	public static int soustraction(int nombre1, int nombre2)   {
		return nombre1 - nombre2;	
	}
	
	public static int multiplication(int nombre1, int nombre2)   {
		return nombre1 * nombre2;	
	}
	
	public static int division(int nombre1, int nombre2)   {
		return nombre1 / nombre2;	
	}
	
	
	
	
	
}

