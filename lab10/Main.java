import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int kg ;
        int tl ;
        
        Cilek cilek = new Cilek();
        Elma elma = new Elma();
        Armut armut = new Armut();
        Karpuz karpuz = new Karpuz();

        System.out.println("Kaç kilo elma alindi? ");
        kg = scan.nextInt();
        elma.alinankg(kg);
        System.out.println("Elmanin kg basina fiyati?");
        tl = scan.nextInt();
        elma.fiyat(tl);
        System.out.println("Kaç kilo armut alindi? ");
        kg = scan.nextInt();
        armut.alinankg(kg);
        System.out.println("Armutun kg basina fiyati?");
        tl = scan.nextInt();
        armut.fiyat(tl);
        System.out.println("Kaç kilo çilek alindi? ");
        kg = scan.nextInt();
        cilek.alinankg(kg);
        System.out.println("Çileğin kg basina fiyati?");
        tl = scan.nextInt();
        cilek.fiyat(tl);
        System.out.println("Kaç kilo karpuz alindi? ");
        kg = scan.nextInt();
        karpuz.alinankg(kg);
        System.out.println("Karpuzun kg basina fiyati?");
        tl = scan.nextInt();
        karpuz.fiyat(tl);

        elma.meyveadi();
        armut.meyveadi();
        karpuz.meyveadi();
        cilek.meyveadi();

    }
}
