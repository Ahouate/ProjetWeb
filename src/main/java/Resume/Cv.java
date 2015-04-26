package Resume;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;

/**
 * Created by Abdel on 02/04/2015.
 */
@XmlRootElement(name = "resume")
public class Cv {
    private String titre;
    private Info_perso info_perso;
    private Formations formation;
    private Experiences_pro experience_pro;
    private Projets projet;
    private Competances competance;
    private Langues langue;
    private Loisirs loisir;

    public Cv() {
    }

    public Cv(String titre, Info_perso info_persos, Formations formations, Experiences_pro experiences_pro, Projets projets, Competances competance, Langues langues, Loisirs loisirs) {
        this.titre = titre;
        this.info_perso = info_persos;
        this.formation = formations;
        this.experience_pro = experiences_pro;
        this.projet = projets;
        this.competance = competance;
        this.langue = langues;
        this.loisir = loisirs;
    }

    public String getTitre() {
        return titre;
    }
    @XmlElement
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Info_perso getInfo_perso() {
        return info_perso;
    }
    @XmlElement
    public void setInfo_perso(Info_perso info_persos) {
        this.info_perso = info_persos;
    }

    public Formations getFormations() {
        return formation;
    }
    @XmlElement
    public void setFormations(Formations formations) {
        this.formation = formations;
    }

    public Experiences_pro getExperiences_pro() {
        return experience_pro;
    }
    @XmlElement
    public void setExperiences_pro(Experiences_pro experiences_pro) {
        this.experience_pro = experiences_pro;
    }

    public Projets getProjets() {
        return projet;
    }
    @XmlElement
    public void setProjets(Projets projets) {
        this.projet = projets;
    }

    public Competances getCompetances() {
        return competance;
    }
    @XmlElement
    public void setCompetances(Competances competances) {
        this.competance = competance;
    }

    public Langues getLangues() {
        return langue;
    }
    @XmlElement
    public void setLangues(Langues langues) {
        this.langue = langues;
    }

    public Loisirs getLoisirs() {
        return loisir;
    }
    @XmlElement
    public void setLoisirs(Loisirs loisirs) {
        this.loisir = loisirs;
    }
}
