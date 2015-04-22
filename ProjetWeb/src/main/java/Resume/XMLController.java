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

        Info_perso info_persos = new Info_perso("AHOUATE", "Abdellatif", "31, rue Mal lattre de tassigny", "07536031");

        Formation formation1 = new Formation("2007", "Bac");
        Formation formation2 = new Formation("2011", "Licence");
        LinkedList<Formation> formations = new LinkedList<Formation>();
        formations.add(formation1);
        formations.add(formation2);

        Experience_pro exp1 = new Experience_pro("2011", "Stage fin d'etude");
        Experience_pro exp2 = new Experience_pro("2013", "STAGE au sein de l'ECLANOR");
        LinkedList<Experience_pro> experiences_pro = new LinkedList<Experience_pro>();
        experiences_pro.add(exp1);
        experiences_pro.add(exp2);

        Projet projet1 = new Projet("2011", "gestion de stock");
        Projet projet2 = new Projet("2012", "Systeme d'information");
        LinkedList<Projet> projets = new LinkedList<Projet>();
        projets.add(projet1);
        projets.add(projet2);

        Competance c1 = new Competance("Langages", "C++, JAVA, PHP");
        Competance c2 = new Competance("Modelisation", "MERISE, UML");
        LinkedList<Competance> competances = new LinkedList<Competance>();
        competances.add(c1);
        competances.add(c2);

        Langue l1 = new Langue("Francais", "bon niveau");
        Langue l2 = new Langue("Anglais", "bon niveau");
        LinkedList<Langue> langues = new LinkedList<Langue>();

        LinkedList<String> loisirs = new LinkedList<String>();
        loisirs.add("voyage");
        loisirs.add("Natation");

        Cv cv = new Cv(titre, info_persos, formations, experiences_pro, projets, competances, langues, loisirs);
        Cv cv2 = new Cv("titre 2", info_persos, formations, experiences_pro, projets, competances, langues, loisirs);

        cvs.add(cv);
        cvs.add(cv2);

    }

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public @ResponseBody Cv getCvInXML(@PathVariable String id) {
        return cvs.find(new Integer(Integer.valueOf(id)));
    }

    @RequestMapping(value="", method = RequestMethod.GET)
    public @ResponseBody ListeCv getCvsInXML() {
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
    public @ResponseBody void removeCv(@PathVariable String id,@RequestBody Cv cv) {
        cvs.remove(Integer.valueOf(id));
    }

}