package Resume;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Abdel on 02/04/2015.
 */
@XmlRootElement(name = "formation")
public class Formation {
    private String date;

    private String diplome;

    public Formation() {
    }

    public Formation(String date, String diplome) {
        this.date = date;
        this.diplome = diplome;
    }

    public String getDate() {
        return date;
    }

    @XmlElement
    public void setDate(String date) {
        this.date = date;
    }

    public String getDiplome() {
        return diplome;
    }

    @XmlElement
    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }
}
