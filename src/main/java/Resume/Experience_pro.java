package Resume;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Abdel on 02/04/2015.
 */
@XmlRootElement(name = "experience_pro")
public class Experience_pro {
    private String date;
    private String experience;

    public Experience_pro() {
    }

    public Experience_pro(String date, String experience) {
        this.date = date;

        this.experience = experience;
    }

    public String getDate() {
        return date;
    }

    @XmlElement
    public void setDate(String date) {
        this.date = date;
    }

    public String getExperience() {
        return experience;
    }

    @XmlElement
    public void setExperience(String experience) {
        this.experience = experience;
    }
}
