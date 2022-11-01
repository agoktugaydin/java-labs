
import java.util.Scanner;

public class toplam {
    public static void main(String[]args){
        System.out.println("enter first value: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("enter second value: ");
        Scanner scanner1 = new Scanner(System.in);
        int b = scanner.nextInt();
       
        System.out.println("sum of values that you entered is:" + (a+b));

        scanner.close();
        scanner1.close();
}
}
