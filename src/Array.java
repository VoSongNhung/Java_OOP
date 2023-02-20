import java.util.*;

public class Array {
    public ArrayList<ClassObj> ArrayListPerson(){
        ArrayList<ClassObj> person = new ArrayList<ClassObj>();
        ClassObj obj = new ClassObj(1,"Võ Song Nhưng",22,"Tuy Phước",1);
        ClassObj obj1 = new ClassObj(1,"Đinh Minh Mạnh",22,"Tuy Phước",1);
        ClassObj obj2 = new ClassObj(1,"Đỗ Minh Tâm",22,"Tuy Phước",1);
        person.add(obj);
        person.add(obj1);
        person.add(obj2);
        return person;
    }

    public LinkedList<ClassObj2> LinkedListJob(){
        LinkedList<ClassObj2> job = new LinkedList<ClassObj2>();
        ClassObj2 obj = new ClassObj2(1,"Student","leaning new knowleage");
        ClassObj2 obj1 = new ClassObj2(1,"Worker","do in farmmer");
        job.add(obj);
        job.add(obj1);
        //Add new item linkedlist
        ClassObj2 objnew = new ClassObj2(1,"Teacher","help student learing knowleage");
        job.addFirst(objnew);
        return job;
    }
    public HashMap<String,String> HashMap(){
        HashMap<String,String> hashMap = new HashMap<String,String>();
        hashMap.put("1","Teacher");
        hashMap.put("2","Student");
        hashMap.put("3","Worker");
        return hashMap;
    }
    public void HashSet(){
        HashSet<String> hashSetJob = new HashSet<String>();
        String job = "Teacher";
        String job1 = "Student";
        hashSetJob.add(job1);
        hashSetJob.add(job);
        Iterator<String> it = hashSetJob.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        Array arr = new Array();
        //Collections.sort(arr.Person());
        //Print arraylist person with index
        System.out.println("Print arraylist person with index equal 0: ");
        System.out.println(arr.ArrayListPerson().get(0).name);
        System.out.println("------------------------------");
        //Print all person
        //System.out.println(arr.Person());
        System.out.println("Print all person with Arraylist:");
        for(ClassObj i : arr.ArrayListPerson()){
            System.out.println(i.name + " " +i.age + " " +i.address);
        }
        System.out.println("------------------------------");
        //Print linkedlist all person
        System.out.println("Print Linkedlist all person:");
        for(ClassObj2 i : arr.LinkedListJob()){
            System.out.println(i.nameJob + " " +i.description);
        }
        System.out.println("------------------------------");
        //Get many item in hashmap
        int size = arr.HashMap().size();
        //Print all item in hashmap
        System.out.println("Print all item in Hashmap:");
        for(String i : arr.HashMap().keySet()){
            System.out.println("IdJob: "+ i + " | NameJob: " + arr.HashMap().get(i));
        }
        System.out.println("------------------------------");
        //Print all item in hashset
        System.out.println("Print all item in Hashset use Iterator:");
        arr.HashSet();

        System.out.println("------------------------------");

    }
}

