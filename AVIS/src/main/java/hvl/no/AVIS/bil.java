package hvl.no.AVIS;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Biler")
public class bil {
    @Id
    @Column(name = "registreringsnummer")
    private String registreringsnummer;

    @Column(name = "merke")
    private String merke;

    @Column(name = "modell")
    private String modell;

    @Column(name = "farge")
    private String farge;

    @Column(name = "utleiegruppe")
    private String utleiegruppe;

    @Column(name = "ledig")
    private boolean ledig;

    @Column(name = "utleiekontor")
    private String utleiekontor;
    
    public bil (String registreringsnummer, String merke, String modell, String farge,
    		String utleiegruppe, boolean ledig, String utleiekontor) {
    	this.registreringsnummer = registreringsnummer;
    	this.merke = merke;
    	this.modell = modell;
    	this.farge = farge;
    	this.utleiegruppe = utleiegruppe;
    	this.ledig = ledig;
    	this.utleiekontor = utleiekontor;
    }
    
    public String getRegistreringsnummer() {
		return registreringsnummer;
	}

	public void setRegistreringsnummer(String regnr) {
		this.registreringsnummer = regnr;
	}

	public String getMerke() {
		return merke;
	}

	public void setMerke(String merke) {
		this.merke = merke;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public String getFarge() {
		return farge;
	}

	public void setFarge(String farge) {
		this.farge = farge;
	}

	public String getUtleiegruppe() {
		return utleiegruppe;
	}

	public void setUtleiegruppe(String utleiegruppe) {
		this.utleiegruppe = utleiegruppe;
	}

	public boolean isLedig() {
		return ledig;
	}

	public void setLedig(boolean ledig) {
		this.ledig = ledig;
	}

	public String getUtleiekontor() {
		return utleiekontor;
	}

	public void setUtleiekontor(String utleiekontor) {
		this.utleiekontor = utleiekontor;
	}

	

    // Getters and setters
}
/*
public class Main {
    public static void main(String[] args) {
        // Opprett EntityManagerFactory ved hjelp av persistence.xml-konfigurasjonen
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BilerPU");

        // Opprett EntityManager
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Start transaksjon
        entityManager.getTransaction().begin();

        // Hent en bil fra databasen ved hjelp av registreringsnummer
        Bil bil = entityManager.find(Bil.class, "ABC123");

        // Utfør endringer
        if (bil != null) {
            bil.setLedig(false);
            bil.setUtleiekontor("Utleiekontor X");
            entityManager.merge(bil); // Oppdater bilen i databasen
        }

        // Commit transaksjon
        entityManager.getTransaction().commit();

        // Lukk EntityManager og EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();
    } 
}*/

