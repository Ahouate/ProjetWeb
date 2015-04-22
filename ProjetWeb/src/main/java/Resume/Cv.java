package Resume;

import java.util.LinkedList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Abdel on 02/04/2015.
 */
@XmlRootElement(name = "resume")
public class Cv {
    private String titre;
    private Info_perso info_persos;
    private LinkedList<Formation> formations;
    private LinkedList<Experience_pro> experiences_pro;
    private LinkedList<Projet> projets;
    private LinkedList<Competance> competance;
    private LinkedList<Langue> langues;
    private LinkedList<String> loisirs;

    public Cv() {
        this.titre = new String();
        this.info_persos = new Info_perso();
        this.formations = new LinkedList<Formation>();
        this.experiences_pro = new LinkedList<Experience_pro>();
        this.projets = new LinkedList<Projet>();
        this.competance = new LinkedList<Competance>();
        this.langues = new LinkedList<Langue>();
        this.loisirs = new LinkedList<String>();
    }

    public Cv(String titre, Info_perso info_persos, LinkedList<Formation> formations, LinkedList<Experience_pro> experiences_pro, LinkedList<Projet> projets, LinkedList<Competance> competance, LinkedList<Langue> langues, LinkedList<String> loisirs) {
        this.titre = titre;
        this.info_persos = info_persos;
        this.formations = formations;
        this.experiences_pro = experiences_pro;
        this.projets = projets;
        this.competance = competance;
        this.langues = langues;
        this.loisirs = loisirs;
    }

    public String getTitre() {
        return titre;
    }

    @XmlElement
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Info_perso getInfo_persos() {
        return info_persos;
    }

    @XmlElement
    public void setInfo_persos(Info_perso info_persos) {
        this.info_persos = info_persos;
    }

    public LinkedList<Formation> getFormations() {
        return formations;
    }

    @XmlElement
    public void setFormations(LinkedList<Formation> formations) {
        this.formations = formations;
    }

    public LinkedList<Experience_pro> getExperiences_pro() {
        return experiences_pro;
    }

    @XmlElement
    public void setExperiences_pro(LinkedList<Experience_pro> experiences_pro) {
        this.experiences_pro = experiences_pro;
    }

    public LinkedList<Projet> getProjets() {
        return projets;
    }

    @XmlElement
    public void setProjets(LinkedList<Projet> projets) {
        this.projets = projets;
    }

    public LinkedList<Competance> getCompetance() {
        return competance;
    }

    @XmlElement
    public void setCompetance(LinkedList<Competance> competance) {
        this.competance = competance;
    }

    public LinkedList<Langue> getLangues() {
        return langues;
    }

    @XmlElement
    public void setLangues(LinkedList<Langue> langues) {
        this.langues = langues;
    }

    public LinkedList<String> getLoisirs() {
        return loisirs;
    }

    @XmlElement
    public void setLoisirs(LinkedList<String> loisirs) {
        this.loisirs = loisirs;
    }
}
