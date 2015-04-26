package Resume;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;

/**
 * Created by Abdel on 26/04/2015.
 */
@XmlRootElement(name = "competances")
public class Competances {
    private LinkedList<Competance> competance;

    public Competances() {
        competance = new LinkedList<Competance>();
    }

    public Competances(LinkedList<Competance> competances) {
        this.competance = competances;
    }

    public LinkedList<Competance> getCompetance() {
        return competance;
    }

    @XmlElement
    public void setCompetance(LinkedList<Competance> competances) {
        this.competance = competances;
    }
}
