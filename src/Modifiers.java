public class Modifiers {
    public int id;
    protected String name;
    final String address = "Trùm TP";
    static String job;
    String email;
    public void testModifiers(){

        id = 1;
        name = "Võ Song Nhưng";
        email = "vsn@gmail.com";
    }
    public static void main(String[] args) {
        //static
        job = "Student";
        Modifiers modifiers = new Modifiers();
        modifiers.testModifiers();
        System.out.println("ID: "+modifiers.id+"| Name: "+modifiers.name+"| Email: "+modifiers.email+"| Job: "+job);

    }
}
