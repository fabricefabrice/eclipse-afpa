
public class Main {

	public static void main(String[] args) {

		System.out.println("Debut du programme : ");

		Ville paris = new Ville()  ;
		paris.nom = "Paris" ;
		paris.nombrehabitants = 100 ;
		paris.sup = 100 ;

		System.out.println("Traitement des donnees de la ville de Paris");
		System.out.println("nom : " + paris.nom);
		System.out.println("nombre d'habitants : "  + paris.nombrehabitants);
		System.out.println("Superficie : "  + paris.sup) ;


		Ville marseille = new Ville()  ;
		marseille.nom = "Marseille"  ;
		marseille.nombrehabitants = 200  ;
		marseille.sup = 95  ;

		System.out.println("Traitement des donnees de la ville de Marseille");
		System.out.println("nom : " + marseille.nom);
		System.out.println("nombre d'habitants : "  + marseille.nombrehabitants)  ;
		System.out.println("Superficie : "  + marseille.sup) ;


		Ville liverpool = new Ville("Liverpool",  500, 50) ;
		System.out.println("nom : " +liverpool.nom);
		System.out.println("nombre d'habitants : "  + liverpool.nom);
		System.out.println("Superficie : "  + liverpool.nom);


		System.out.println("-----------lille-----------");







	}

}
