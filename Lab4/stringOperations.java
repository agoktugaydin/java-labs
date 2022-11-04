import java.util.Scanner;


public class stringOperations {
    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        int upperCase = 0;
        int aSayisi = 0;
for (int i = 0; i < str.length(); i++) {
   
    // uppercase kontrolu.
    if (Character.isUpperCase(str.charAt(i))) 
        upperCase++;

    // a karakteri kontrolu.
    if ('a' == (str.charAt(i))) 
        aSayisi++;
}

        System.out.println("Buyuk harfli karakter sayisi: "+ upperCase);
        System.out.println("a karakteri sayisi: "+ aSayisi);
    }
}
