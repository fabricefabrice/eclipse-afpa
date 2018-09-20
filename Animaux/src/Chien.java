
public class Chien  extends Animal{
	//manger dormir  jouer aboyer mordre ;


	//Constructeur sans Params
	public Chien() {	}

	//Constructeur avec Params
	public Chien(String nom, int taille, int poids, String couleur, String race) {
		this.nom = nom;
		this.taille = taille;
		this.poids = poids;
		this.couleur = couleur;
		this.race = race;
	}



	//Methodes
	public void manger() {
		System.out.println("miam miam, c'est bon!!");
	}
	public void dormir() {
		System.out.println("rrrrrrrrrrrrr!!");
	}
	public void jouer() {
		System.out.println("je joue");
	}
	public void aboyer() {
		System.out.println("ouah ouah!");
	}
	public void mordre() {
		System.out.println("attention a vous");


	}
}