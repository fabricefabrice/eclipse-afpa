
public class Chat  extends Animal{


	//Constructeur sans Params
	public Chat() {	}

	//Constructeur avec Params
	public Chat(String nom, int taille, int poids, String couleur, String race) {
		this.nom = nom;
		this.taille = taille;
		this.poids = poids;
		this.couleur = couleur;
		this.race = race;
	}


	//Methodes chat
	public void manger() {
		System.out.println("miam miam, c'est bon!!");
	}
	public void dormir() {
		System.out.println("rrrrrrrrrrrrr!!");
	}
	public void jouer() {
		System.out.println("je joue");
	}
	public void miauler() {
		System.out.println("miaou!");
	}
	public void mordre() {
		System.out.println("attention a vous");
	}



}