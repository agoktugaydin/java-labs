public abstract class Meyve {

    private double tl ;
    private double kg  ;

    

    public Meyve(double tl, double kg) {
        this.tl = tl;
        this.kg = kg;
    }

    void meyveadi() {
        System.out.println("Alınan miktar : " + kg + "kg");
        System.out.println("Fiyat : " + tl + "TL");
        System.out.println("Toplam fiyat : " + fiyat() +"TL");
    }

    double fiyat() {
        return tl*kg;
    }

}
