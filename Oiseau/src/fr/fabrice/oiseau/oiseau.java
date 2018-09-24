package fr.fabrice.oiseau;

public class oiseau {

	protected String nom;
	protected int taille;
	protected int poids;
	protected String race;
	protected boolean plumes;

	public oiseau() {
		super();
	}

	public oiseau(String nom, int taille, int poids, String race, boolean plumes) {
		super();
		this.nom = nom;
		this.taille = taille;
		this.poids = poids;
		this.race = race;
		this.plumes = plumes;
	}

	public void manger() {
	}

	public void boire() {
	}

	public void voler() {
	}

	public void courir() {
	}

	public void jouer() {
	}

	public void sauter() {
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public boolean isPlumes() {
		return plumes;
	}

	public void setPlumes(boolean plumes) {
		this.plumes = plumes;
	}

}
