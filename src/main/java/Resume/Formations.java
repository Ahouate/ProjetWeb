package Resume;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.text.Normalizer;
import java.util.LinkedList;

/**
 * Created by Abdel on 26/04/2015.
 */

@XmlRootElement(name = "formations")
public class Formations {
    private LinkedList<Formation> formation;

    public Formations() {
        formation = new LinkedList<Formation>();
    }

    public Formations(LinkedList<Formation> formations) {
        this.formation = formations;
    }

    public LinkedList<Formation> getFormation() {
        return formation;
    }

    @XmlElement
    public void setFormation(LinkedList<Formation> formations) {
        this.formation = formations;
    }
}
