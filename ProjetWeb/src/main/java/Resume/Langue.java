package Resume;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Abdel on 02/04/2015.
 */
@XmlRootElement(name = "langue")
public class Langue {
    private String nom;
    private String niveau;

    public Langue() {
    }

    public Langue(String nom, String niveau) {

        this.nom = nom;
        this.niveau = niveau;
    }

    public String getNom() {
        return nom;
    }

    @XmlElement
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNiveau() {
        return niveau;
    }

    @XmlElement
    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
}
