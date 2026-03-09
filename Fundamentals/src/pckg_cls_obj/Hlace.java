package pckg_cls_obj;

public class Hlace {
    private String model;

    public boolean ciste;

    public Hlace(String model){
        this.model = model;
        this.ciste = true;
    }


     boolean getCiste(){
        return ciste;}

    public void setCiste(boolean setValue) {
       this.ciste = setValue;}

    public void usedHlace(){
        this.ciste = false;
}


    public Hlace nekakocleaned(Student student){
        return student.operiMe(this);
    }

    public Hlace OperiMe;
}
