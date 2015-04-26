package Resume;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;

/**
 * Created by Abdel on 26/04/2015.
 */
@XmlRootElement(name = "projets")
public class Projets {
    private LinkedList<Projet> projet;

    public Projets() {
        projet = new LinkedList<Projet>();
    }

    public Projets(LinkedList<Projet> projets) {
        this.projet = projets;
    }

    public LinkedList<Projet> getProjet() {
        return projet;
    }

    @XmlElement
    public void setProjet(LinkedList<Projet> projets) {
        this.projet = projets;
    }
}

