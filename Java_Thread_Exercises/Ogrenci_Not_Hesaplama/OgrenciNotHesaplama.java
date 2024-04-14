
public class OgrenciNotHesaplama implements Runnable{

    private String ogrenciBilgi;

    public OgrenciNotHesaplama(String ogrenciBilgi) {
        this.ogrenciBilgi = ogrenciBilgi;
    }

    @Override
    public void run() {
        Hesapla(ogrenciBilgi);
    }

    private void Hesapla(String ogrenciBilgi){
        String[] parcalar = ogrenciBilgi.split(":");
        String ad = parcalar[0];
        String[] notlarStr = parcalar[1].split(",");

        int toplam = 0;
        for(String n : notlarStr){
            toplam += Integer.parseInt(n.trim());
        }

        double ortalama = toplam / (double)notlarStr.length;

        System.out.println(ad + " ortalama notu : " + ortalama);
    }

}