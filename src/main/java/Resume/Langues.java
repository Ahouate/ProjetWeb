package Resume;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;

/**
 * Created by Abdel on 26/04/2015.
 */
@XmlRootElement(name = "langues")
public class Langues {
    private LinkedList<Langue> langue;

    public Langues() {
        langue = new LinkedList<Langue>();
    }

    public Langues(LinkedList<Langue> langues) {
        this.langue = langues;
    }

    public LinkedList<Langue> getLangue() {
        return langue;
    }

    @XmlElement
    public void setLangue(LinkedList<Langue> langues) {
        this.langue = langues;
    }
}
