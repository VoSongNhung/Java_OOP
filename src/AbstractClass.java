public abstract class AbstractClass {
    int id;
    String name;

    public abstract String Move();

    public void Sleep() {
        System.out.println("Zzzzz");
    }
}
class Subclass extends AbstractClass{
    public Subclass(){
        super();
    }
    @Override
    public String Move() {
        return "fly";
    }
}
class Main2{
    public static void main(String[] args) {
        Subclass subclass = new Subclass();
        System.out.println("The pig is "+subclass.Move());
        subclass.Sleep();
    }
}


