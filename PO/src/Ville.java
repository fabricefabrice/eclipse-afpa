
public class Ville {

	String nom;
	int nombrehabitants;
	int sup;

	public Ville()  {
		System.out.println("Creation d'un objet de type Ville");
	}
	//constructeur avec params
	public Ville(String nomP, int nombrehabitantsP, int supP)  {
	}
	public Ville(String nom, int nombrehabitants) {
		super();
		this.nom = nom;
		this.nombrehabitants = nombrehabitants;
	}
	public Ville(int nombrehabitants, int sup) {
		super();
		this.nombrehabitants = nombrehabitants;
		this.sup = sup;
	}
public Ville(String nom, int nombrehabitants, int sup) {
	super();
	this.nom = nom;
	this.nombrehabitants = nombrehabitants;
	this.sup = sup;
}

public void EteindreLesLumieres ()  {
	System.out.println("Les lumieres de la ville" +nom +" sont eteintes");
}
