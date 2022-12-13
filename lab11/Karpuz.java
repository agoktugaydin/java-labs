public class Karpuz extends Meyve {

    private double tl;
    private double kg;

    public Karpuz(double tl, double kg) {
        super(tl, kg);
    }

    @Override
    void meyveadi() {
        System.out.println("->Meyve adı : Karpuz");
        super.meyveadi();
    }

    @Override
    double fiyat() {
        return super.fiyat();
    }

}
