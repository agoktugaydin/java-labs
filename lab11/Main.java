import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        double tl ;
        double kg ; 
        Scanner scan  = new Scanner(System.in);


        System.out.println("Kaç kilo elma almak istersiniz ?  ");
        kg = scan.nextInt();
        System.out.println("Elmanin kg fiyati ?  ");
        tl = scan.nextInt();
        Elma elma = new Elma(tl, kg);
        System.out.println("Kaç kilo armut alindi ?  ");
        kg = scan.nextInt();
        System.out.println("Armutun kg fiyati ?  ");
        tl = scan.nextInt();
        Armut armut = new Armut(tl, kg);
        System.out.println("Kaç kilo karpuz alindi ?  ");
        kg = scan.nextInt();
        System.out.println("Karpuzun kg fiyati ?  ");
        tl = scan.nextInt();
        Karpuz karpuz = new Karpuz(tl, kg);
        System.out.println("Kaç kilo çilek alindi ?  ");
        kg = scan.nextInt();
        System.out.println("Çileğin kg fiyati ?  ");
        tl = scan.nextInt();
        Cilek cilek = new Cilek(tl, kg);
        elma.meyveadi();
        armut.meyveadi();
        karpuz.meyveadi();
        cilek.meyveadi();

  
    }
}
