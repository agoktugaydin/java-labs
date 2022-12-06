import java.util.ArrayList;

public class Ogrenci {

    private String ad;
    private int sinif;
    private ArrayList<Ders> dersListesi;
    private static int ogreniciSayisi;

    public Ogrenci() {
        dersListesi = new ArrayList<Ders>();
        this.ogreniciSayisi++;
    }
    public Ogrenci(String ad, ArrayList<Ders> dersListesi) {
        this.ad = ad;
        this.dersListesi = dersListesi;
        this.ogreniciSayisi++;
    }

    public Ogrenci(String ad, int sinif, ArrayList<Ders> dersListesi) {
        this.ad = ad;
        this.sinif = sinif;
        this.dersListesi = dersListesi;
        this.ogreniciSayisi++;
    }

    public void OgrenciBilgisiYaz() {
        System.out.println("Ad: " + this.ad);
        System.out.println("Sinif: " + this.sinif);
        System.out.println("Aldigi toplam ders sayisi: " + this.dersListesi.size());
        System.out.println();
    }

    public void OgrenciDersBilgiYaz() {
        for (int i=0; i < this.dersListesi.size(); i++) {
            this.dersListesi.get(i).DersBilgisiYaz();
        }
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

    public ArrayList<Ders> getDersListesi() {
        return dersListesi;
    }

    public void setDersListesi(ArrayList<Ders> dersListesi) {
        this.dersListesi = dersListesi;
    }

    public static int getOgreniciSayisi() {
        return ogreniciSayisi;
    }

    public static void setOgreniciSayisi(int ogreniciSayisi) {
        Ogrenci.ogreniciSayisi = ogreniciSayisi;
    }
}
