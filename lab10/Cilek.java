public class Cilek implements IMeyve {

    private double kg;
    private int tl;

    @Override
    public void meyveadi() {

        System.out.println("Meyve adi : Çilek");
        System.out.println("Alınan kg : " + this.kg);
        System.out.println("Fiyat :" + fiyat(tl));

    }

    @Override
    public void alinankg(double k) {
        this.kg = k;

    }

    @Override
    public double fiyat(int tl) {
        this.tl = tl ;
        return kg*tl;
    }

}