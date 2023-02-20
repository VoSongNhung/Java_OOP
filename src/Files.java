import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {
    File myObj = new File("filename.txt");
    //Method create a new file
    public void CreateFile(){
        try {
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //Method write on file
    public void WriteFile(){
        try{
            FileWriter fileWriter = new FileWriter("filename.txt");
            fileWriter.write("This is my content");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Method read fromfile
    public void ReadFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(myObj);
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    //Method delete file
    public void DeleteFile(){
        if(myObj.delete()){
            System.out.println("File "+myObj.getName()+" is deleted");
        }
        else{
            System.out.println("Can't deleted this file");
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Files files = new Files();
        files.CreateFile();
        files.WriteFile();
        files.ReadFile();
        files.DeleteFile();
    }
}
