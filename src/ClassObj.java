public class ClassObj {
    //List attribute
    int id;
    String name;
    int age;
    String address;
    int idJob;

    public ClassObj(int id, String name, int age, String address, int idJob) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.idJob = idJob;
    }
    //Return
    public ClassObj(){

    }

    //Create mehtod for object
    public void Show(){
        System.out.println("This is my method from ClassObj");
    }
}
