package hvl.no.AVIS;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Kunde", schema = "AVIS")
public class kunde {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kunde_id")
    private int kundeId;

    @Column(name = "fornavn")
    private String fornavn;

    @Column(name = "etternavn")
    private String etternavn;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "telefonnummer")
    private int telefonnummer;
    
    public kunde (String fornavn, String etternavn, String adresse, int tlf) {
    	this.fornavn = fornavn;
    	this.etternavn = etternavn;
    	this.adresse = adresse;
    	telefonnummer = tlf;
    }

	public int getKundeId() {
		return kundeId;
	}

	public void setKundeId(int kundeId) {
		this.kundeId = kundeId;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public long getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(int telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

    // Getters and setters
    
}
