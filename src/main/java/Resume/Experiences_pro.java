package Resume;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;

/**
 * Created by Abdel on 26/04/2015.
 */
@XmlRootElement(name = "experiences_pro")
public class Experiences_pro {
    private LinkedList<Experience_pro> experience_pro;

    public Experiences_pro() {
        experience_pro = new LinkedList<Experience_pro>();
    }

    public Experiences_pro(LinkedList<Experience_pro> experiences_pro) {
        this.experience_pro = experiences_pro;
    }

    public LinkedList<Experience_pro> getExperience_pro() {
        return experience_pro;
    }
    @XmlElement
    public void setExperience_pro(LinkedList<Experience_pro> experiences_pro) {
        this.experience_pro = experiences_pro;
    }
}
