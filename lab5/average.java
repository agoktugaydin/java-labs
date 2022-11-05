
// Kullanıcı tarafından eleman sayısı ve değerleri girilen bir tam sayı dizisinin başka bir diziye kopyalanması
// ve kopyalanan dizinin elemanlarının ortalaması bulunarak ekrana yazan java kodunuz yazınız.

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("dizi boyutunu giriniz :");
        int size = keyboard.nextInt();
        
        int sum = 0;
        int[] firstArray = new int[size];
        int[] secondArray  = new int[size];
        
        //dizinin icini doldurma
        for (int i = 0; i < size; i++)  {                               
            System.out.print( i+1 +". elemani giriniz: ");
            firstArray[i] = keyboard.nextInt(); }      

        //ikinci diziye kopyalama
        for (int i = 0; i < size; i++) {
            secondArray[i] = firstArray[i]; 
            sum += secondArray[i];
            }        

        int average = sum/size;
        System.out.println("girilen degerler ortalamasi: "+ average);
        keyboard.close();    
    }
}
