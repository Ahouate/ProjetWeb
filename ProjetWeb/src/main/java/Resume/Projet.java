package Resume;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Abdel on 02/04/2015.
 */
@XmlRootElement(name = "projet")
public class Projet {
    private String date;
    private String sujet;

    public Projet() {
    }

    public Projet(String date, String sujet) {
        this.date = date;
        this.sujet = sujet;

    }

    public String getDate() { return date; }

    @XmlElement
    public void setDate(String date) {
        this.date = date;
    }

    public String getSujet() {
        return sujet;
    }

    @XmlElement
    public void setSujet(String sujet) {
        this.sujet = sujet;
    }
}
