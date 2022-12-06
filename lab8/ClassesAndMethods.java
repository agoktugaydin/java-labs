import java.util.ArrayList;

public class ClassesAndMethods {
    public static void main(String[] args) {

// dersler
        Ders ders1 = new Ders("Ders1", 2,"Hoca1");
        ders1.DersBilgisiYaz();
        ders1.DersSayiBilgisiYaz();

        Ders ders2 = new Ders("Ders2", 2,"Hoca2");
        ders2.DersBilgisiYaz();
        ders2.DersSayiBilgisiYaz();

        Ders ders3 = new Ders("Ders3", 1, "Hoca3");
        ders3.DersBilgisiYaz();
        ders3.DersSayiBilgisiYaz();

        Ders ders4 = new Ders("Ders4", 1, "Hoca4");
        ders4.DersBilgisiYaz();
        ders4.DersSayiBilgisiYaz();
        System.out.println("-------------------------------------------------------------------------------------");

// default constructor ile nesne oluşturma

        ArrayList<Ders> ogrenci1DersListesi = new ArrayList<Ders>();
        ogrenci1DersListesi.add(ders1);
        ogrenci1DersListesi.add(ders2);

        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.setAd("Ogrenci1");
        ogrenci1.setSinif(2);
        ogrenci1.setDersListesi(ogrenci1DersListesi);

        ogrenci1.OgrenciBilgisiYaz();
        ogrenci1.OgrenciDersBilgiYaz();
        System.out.println("-------------------------------------------------------------------------------------");
// 2 parametreli constructor ile nesne oluşturma

        ArrayList<Ders> ogrenci2DersListesi = new ArrayList<Ders>();
        ogrenci2DersListesi.add(ders2);
        ogrenci2DersListesi.add(ders3);
        ogrenci2DersListesi.add(ders4);

        Ogrenci ogrenci2 = new Ogrenci("Ogrenci2", ogrenci2DersListesi);
        ogrenci2.setSinif(1);

        ogrenci2.OgrenciBilgisiYaz();
        ogrenci2.OgrenciDersBilgiYaz();
        System.out.println("-------------------------------------------------------------------------------------");

// 3 parametreli constructor ile nesne oluşturma

        ArrayList<Ders> ogrenci3DersListesi = new ArrayList<Ders>();
        ogrenci3DersListesi.add(ders1);
        ogrenci3DersListesi.add(ders2);
        ogrenci3DersListesi.add(ders3);
        ogrenci3DersListesi.add(ders4);

        Ogrenci ogrenci3 = new Ogrenci("Ogrenci3", ogrenci3DersListesi);
        ogrenci3.setSinif(2);

        ogrenci3.OgrenciBilgisiYaz();
        ogrenci3.OgrenciDersBilgiYaz();
        System.out.println("-------------------------------------------------------------------------------------");

// Ders sınıfında yer alan DersSayiBilgisiYaz() metodu ile
// tüm öğrenci ve dersler oluşturulduktan sonra üretilen 
// toplam ders sayısını ekrana yazdırınız.

        ders4.DersSayiBilgisiYaz();
    }
}
