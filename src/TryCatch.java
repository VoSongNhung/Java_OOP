public class TryCatch {
    public static void main(String[] args) {
        try{
            System.out.println("Test Exception");
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Done!!!");
        }
    }
}
