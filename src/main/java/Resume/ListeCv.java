package Resume;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Abdel on 16/04/2015.
 */

@XmlRootElement(name = "Cvs")
public class ListeCv {

    private Map<Integer, Cv> Cvs;
    public ListeCv(){
        Cvs= new HashMap<Integer, Cv>();
    }

    public Map<Integer, Cv> getCvs() {
        return Cvs;
    }

    @XmlElement
    public void setCvs(Map<Integer, Cv> cvs) {
        Cvs = cvs;
    }

    public void add(Cv cv){
        Cvs.put(new Integer(Cvs.size()+1), cv);
    }

    public Cv find(int i){
        return Cvs.get(new Integer(i));
    }
}
