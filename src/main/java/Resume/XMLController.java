package Resume; /**
 * Created by Abdel on 16/04/2015.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;

@Controller
@RequestMapping("/resume")
public class XMLController {
    ListeCv cvs = new ListeCv();

    public XMLController() {
        cvs= new ListeCv();

        String titre = "M1 GIL";

        Info_perso info_persos = new Info_perso("AHOUATE", "Abdellatif", "31, rue Mal lattre de tassigny", "0753603109");

        Formation formation1 = new Formation("2007", "Bac");
        Formation formation2 = new Formation("2011", "Licence");
        LinkedList<Formation> formationsListe = new LinkedList<Formation>();
        formationsListe.add(formation1);
        formationsListe.add(formation2);
        Formations formations= new Formations(formationsListe);

        Experience_pro exp1 = new Experience_pro("2011", "Stage fin d'etude");
        Experience_pro exp2 = new Experience_pro("2013", "STAGE au sein de l'ECLANOR");
        LinkedList<Experience_pro> experiences_proListe = new LinkedList<Experience_pro>();
        experiences_proListe.add(exp1);
        experiences_proListe.add(exp2);
        Experiences_pro experiences_pro = new Experiences_pro(experiences_proListe);


        Projet projet1 = new Projet("2011", "gestion de stock");
        Projet projet2 = new Projet("2012", "Systeme d'information");
        LinkedList<Projet> projetsListe = new LinkedList<Projet>();
        projetsListe.add(projet1);
        projetsListe.add(projet2);
        Projets projets = new Projets(projetsListe);

        Competance c1 = new Competance("Langages", "C++, JAVA, PHP");
        Competance c2 = new Competance("Modelisation", "MERISE, UML");
        LinkedList<Competance> competancesListe = new LinkedList<Competance>();
        competancesListe.add(c1);
        competancesListe.add(c2);
        Competances competances = new Competances(competancesListe);

        Langue l1 = new Langue("Francais", "bon niveau");
        Langue l2 = new Langue("Anglais", "bon niveau");
        LinkedList<Langue> languesListe = new LinkedList<Langue>();
        languesListe.add(l1);
        languesListe.add(l2);
        Langues langues = new Langues(languesListe);

        LinkedList<String> loisirsListe = new LinkedList<String>();
        loisirsListe.add("voyage");
        loisirsListe.add("Natation");
        Loisirs loisirs = new Loisirs(loisirsListe);

        Cv cv = new Cv(titre, info_persos, formations, experiences_pro, projets, competances, langues, loisirs);
        Cv cv2 = new Cv("titre 2", info_persos, formations, experiences_pro, projets, competances, langues, loisirs);

        cvs.add(cv);
        cvs.add(cv2);

    }

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public @ResponseBody
    Cv getCvInXML(@PathVariable String id) {
        return cvs.find(new Integer(Integer.valueOf(id)));
    }

    @RequestMapping(value="", method = RequestMethod.GET)
    public @ResponseBody
    ListeCv getCvsInXML() {
        return cvs;
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody void postCv(@RequestBody Cv cv) {
         cvs.add(cv);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody void putCv(@RequestBody Cv cv) {
        cvs.add(cv);
    }

    @RequestMapping(value="{id}", method = RequestMethod.DELETE)
    public @ResponseBody void deleteCvInXML(@PathVariable String id) {
        //int i = id.indexOf('/');
        cvs.delete(Integer.valueOf(id));
    }

}