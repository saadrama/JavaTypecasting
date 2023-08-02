public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! today am learning java type casting");
        int myInt=87;
        double myDouble=myInt; //This is widening casting
        System.out.println(myDouble);
        double myPg=69.88d;
        int myZh=(int)myPg; //This is narrowing casting
        System.out.println(myZh);
    }
}