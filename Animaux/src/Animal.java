
public class Animal {

	public String nom  ;
	public int taille  ;
	public int poids  ;
	public String couleur  ;
	public String race ;
	
	public Animal() {
		super();
	}

	public Animal(String nom, int taille, int poids, String couleur, String race) {
		super();
		this.nom = nom;
		this.taille = taille;
		this.poids = poids;
		this.couleur = couleur;
		this.race = race;
	}

	public void manger ()  {
		System.out.println("miam miam, c'est bon!!");
		
	}
	public void dormir()  {
		System.out.println("zzzzzzzzzzzzz");
	}
	
	public void jouer()  {
		System.out.println("je joue");;
	}

	}





