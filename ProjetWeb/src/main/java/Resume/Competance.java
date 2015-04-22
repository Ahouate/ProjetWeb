package Resume;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;


/**
 * Created by Abdel on 02/04/2015.
 */
@XmlRootElement(name = "competence")
public class Competance {
    private String titre;
    private String description;

    public Competance() {
    }

    public Competance(String titre, String description) {
        this.titre = titre;
        this.description = description;

    }

    public String getTitre() {
        return titre;
    }

    @XmlElement
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    @XmlElement
    public void setDescription(String description) {
        this.description = description;
    }
}
