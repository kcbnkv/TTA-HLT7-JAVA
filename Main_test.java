//public class Main_test {
//    public static int max(int numA, int numB) {
//        return Math.min(numA, numB);
//    }
//
//    public static void main(String[] args) {
//        int a = 15, b = 20;
//        int c = max(a, b);
//        System.out.println("Largest value = " + c);
//    }
//}

//public class Main_test {
//    public static void sayHello()
//    {
//        System.out.println("Hello");
//    }
//    public static void main(String[] args) {
//        System.out.println("Hi im main method");
//        sayHello();
//    }
//}

import java.util.Scanner;

public class Main_test {
    public static void main(String[] args)
    {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first no= ");

int num1, num2;

num1=sc.nextInt();
System.out.println("Enter 2nd no= ");

num2=sc.nextInt();
System.out.println("Sum of no is= "+(num1+num2));
}
}




