package pckg_cls_obj;

public class Student {
    private String name;
    private String surname;
    private int id;

    private static int cntID = 100;

    public Student(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public Student(String name, String surname, int id){
        this(name, surname);
        this.id = id;
    }

    /*
    public Student (String name, String surname){
        this.id = cntID;
        cntID++;
        this.name = name;
        this.surname= surname;
    }
    */

    public void subscribeToStudentService(){
        System.out.println("Student id:"+ id);
        System.out.println(name + " - " + surname + "is subscribed to the student system");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }

    public Hlace operiMe(Hlace hlace){
        hlace.ciste =  true;
        System.out.println(this + "has washed pants.");
        return hlace;
    }
}
