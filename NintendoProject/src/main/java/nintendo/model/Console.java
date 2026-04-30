package nintendo.model;

public abstract class Console {

	private String nom;
	private double prix;
	private String date_sortie;

	public Console(String nom, double prix, String date_sortie) {
		this.nom = nom;
		this.prix = prix;
		this.date_sortie = date_sortie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + ", prix=" + prix + ", date_sortie=" + date_sortie + "]";
	}

	
	
}
