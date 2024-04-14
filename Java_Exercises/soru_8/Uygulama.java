package soru_8;


public class Uygulama {

    private Database db;

    public Uygulama(Database database){
        this.db = database;
    }

    public void Menu(){
        System.out.println("MENU : ");
        System.out.println("1 - Kullanıcı oluştur");
        System.out.println("2 - Kullanıcı Listele");
        System.out.println("3 - Çıkış");
    }
    
    public void KullaniciOlustur(int id, String isim, String email, String sifre){
        Kullanici kullanici = new Kullanici(id, isim, email, sifre);
        db.KullaniciEkle(kullanici);
        System.out.println("Kullanıcı Oluşturuldu.");
    }

    public void KullaniciListele(){
        db.KullaniciListele();
    }
}
