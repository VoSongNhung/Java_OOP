public class OuterClasss {
    public int number = 1;
    static String end = "------------------------ \n End!!!!!!!!!!!!!";
    class  InnerClass{
        public int number= 2;
        void methodLever1(int number){
            System.out.println("Number equal "+number);
            System.out.println("This.number equal "+this.number);
            System.out.println("OuterClass.this.number equal "+OuterClasss.this.number);
            System.out.println(end);
        }
    }

    public static void main(String[] args) {
        OuterClasss outerClasss = new OuterClasss();
        OuterClasss.InnerClass innerClass = outerClasss.new InnerClass();
        innerClass.methodLever1(3);
    }
}
