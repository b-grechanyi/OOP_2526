public class Test {
    public static void main(String[] args){
        USER us1 = new USER("Ivana", "ivana@gmail.com");
        System.out.println(us1);
        us1.performSomeStudyAction();
        AUX_CLS.printSomeMSG("THIS IS GOOD!!!");
        SuperUser sup1 = new SuperUser("Petar Spasitelj", "petar@gmail.com", 23);
        System.out.println(sup1);
        sup1.performSomeStudyAction();
    }
}
