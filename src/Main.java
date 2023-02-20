public class Main {
    public static void main(String[] args) {
        ClassObj obj1 = new ClassObj();
        //Modify atrribute
        obj1.id = 1;
        obj1.name = "Võ Song Nhưng";
        obj1.age = 22;
        obj1.address = "Tuy Phước";
        obj1.idJob = 1;
        System.out.println("ID: " + obj1.id + "\nName: " + obj1.name + "\nAge: " + obj1.age + "\nAddress: " + obj1.address);
        System.out.println("----------------------------------------");
        //Call method form Object
        obj1.Show();
        //Use contructor
        ClassObj2 obj2 = new ClassObj2(1, "Student", "Learing new knowleage");
        System.out.println("----------------------------------------");
        System.out.println(obj1.name + " is a " + obj2.nameJob);
    }
}