public interface Interface {
    public void doSomething();
    public int time();
}

 class Main1 implements Interface{
     public static void main(String[] args) {
        Main1 main1 = new Main1();
        main1.doSomething();
         System.out.println(main1.time()+" time");
     }

     @Override
     public void doSomething() {
         System.out.println("Do exercise!!");
     }

     @Override
     public int time() {
         return 10;
     }
 }
