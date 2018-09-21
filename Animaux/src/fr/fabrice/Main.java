package fr.fabrice;

import fr.fabrice.animal.Animal;
import fr.fabrice.animal.Chat;
import fr.fabrice.animal.Chien;

public class Main {

	


	public static void main(String[] args) {


		Chien ch1 = new Chien ()  ;
		ch1.nom = "ch1"  ;
		ch1.taille = 100 ;
		ch1.poids = 25 ;
		ch1.couleur =  "noire";
		ch1.race = "berger"  ;




		System.out.println("Voici le chien : " + ch1.nom);
		System.out.println("qui mesure  : " + ch1.taille);
		System.out.println("poids : " + ch1.poids)  ;
		System.out.println("de couleur : " + ch1.couleur);
		System.out.println("race : " + ch1.race)  ;


		Chat
		ct1 = new Chat("ct1", 50, 5 , "noir" , "angora")  ;


		System.out.println("Voici le chat : " + ct1.nom);
		System.out.println("qui mesure  : " + ct1.taille);
		System.out.println("poids : " + ct1.poids)  ;
		System.out.println("de couleur : " + ct1.couleur);
		System.out.println("race : " + ct1.race)  ;

		ct1.miauler();

		Chien ada = new Chien ("ada" , 152, 5, "noir", "levrier")  ;
		System.out.println("la couleur du chien" + ada.nom  + "est le : " + ada.couleur);

		Chien rex = new Chien ("rex ", 120, 2, "rouge", "bulldog") ;
		System.out.println("le chien" + rex.nom  + "est un : " + rex.race + "de poids :" +rex.poids);

		Animal monanimal = new Chien("chien sans nom", 10, 1, "gris", "Teckel") ;
		System.out.println( monanimal.nom + "est de couleur : " + monanimal.couleur);

		Chat chat1 = new Chat ("Chat n1", 125, 125, "rouge", "persan")  ;
		chat1.setCouleurDesYeux("rose") ;












	}

}
