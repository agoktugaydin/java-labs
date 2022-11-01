
import java.io.Console;

public class stringInput {
    
    public static void main(String[]args){
    Console console = System.console();
    
    String str = console.readLine("enter first string: ");
    String str1 = console.readLine("enter second string: ");
    
    System.out.println(str);
    System.out.println(str1);

}
}