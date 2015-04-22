package Resume;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Abdel on 02/04/2015.
 */
@XmlRootElement(name = "information_perso")
public class Info_perso {
    private String nom;
    private String prenom;
    private String adresse;
    private String tele;

    public Info_perso(String nom, String prenom, String adresse, String tele) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tele = tele;
    }

    public Info_perso() {
    }

    public String getNom() {
        return nom;
    }

    @XmlElement
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @XmlElement
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    @XmlElement
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTele() {
        return tele;
    }

    @XmlElement
    public void setTele(String tele) {
        this.tele = tele;
    }
}
