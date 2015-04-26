package Resume;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;

/**
 * Created by Abdel on 26/04/2015.
 */
@XmlRootElement(name = "loisirs")
public class Loisirs {
    private LinkedList<String> loisir;

    public Loisirs() {
        this.loisir = new LinkedList<String>();
    }

    public Loisirs(LinkedList<String> loisirs) {
        this.loisir = loisirs;
    }

    public LinkedList<String> getLoisir() {
        return loisir;
    }

    @XmlElement
    public void setLoisir(LinkedList<String> loisirs) {
        this.loisir = loisirs;
    }
}
