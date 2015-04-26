package Resume;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by Abdel on 16/04/2015.
 */

@XmlRootElement(name = "resumes")
public class ListeCv {

    private LinkedList<Cv> resumes;
    public ListeCv(){
        resumes= new LinkedList<Cv>();
    }

    public LinkedList<Cv> getResume() {
        return resumes;
    }

    @XmlElement
    public void setResume(LinkedList<Cv> resume) {
        resumes = resume;
    }

    public void add(Cv cv){
        resumes.add(cv);
    }

    public Cv find(int i){
        if(i<=resumes.size())
            return resumes.get(i-1);
        return null;
    }

    public void delete(int i){
        if(i<=resumes.size())
             resumes.remove(i-1);
    }
}
