public class Ders {

    private String ad;
    private int sinif;
    private String hoca;
    private static int dersSayisi;

    public Ders() {
        this.dersSayisi++;
    }

    public Ders(String ad, String hoca) {
        this.ad = ad;
        this.hoca = hoca;
        this.dersSayisi++;
    }

    public Ders(String ad, int sinif, String hoca) {
        this.ad = ad;
        this.sinif = sinif;
        this.hoca = hoca;
        this.dersSayisi++;
    }

    public void DersBilgisiYaz() {

        System.out.println("Ders Adi: " + this.ad);
        System.out.println("Ders Sinifi: " + this.sinif);
        System.out.println("Ders Hocasi: " + this.hoca);
        System.out.println();
    }

    public void DersSayiBilgisiYaz() {
        System.out.println("Ders Sayisi: " + this.dersSayisi);
        System.out.println();
    }

    // getter setter metodları

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public String getHoca() {
        return hoca;
    }

    public void setHoca(String hoca) {
        this.hoca = hoca;
    }

    public static int getDersSayisi() {
        return dersSayisi;
    }

    public static void setDersSayisi(int dersSayisi) {
        Ders.dersSayisi = dersSayisi;
    }
}
