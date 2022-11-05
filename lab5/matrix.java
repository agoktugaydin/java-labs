
// 3x2 lik bir matris(iki boyutlu dizi) tanımlanan ve elemanlarının kullanıcı tarafından girilerek ekrana yazdıran java kodunuz yazınız.


import java.util.Scanner;   
public class matrix  
    {   
    public static void main(String args[])   
        {    
        int m = 2;  
        int n = 3;   
        int array[][] = new int[m][n];   

        Scanner keyboard =new Scanner(System.in);   

        System.out.println("elemanlari sirayla giriniz : ");   
        for (int i = 0; i < m; i++){  
            for (int j = 0; j < n; j++){
            array[i][j] = keyboard.nextInt();   
            }
        }
        System.out.println("matris: ");   
        for (int i = 0; i < m; i++)   
        {   
        for (int j = 0; j < n; j++)   
        System.out.print(array[i][j] + " ");   
        System.out.println();   
        }   
        }   
    }  
