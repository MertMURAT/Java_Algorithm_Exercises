package soru_8;

import java.util.ArrayList;
import java.util.List;

public class Database {

    List<Kullanici> kullaniciList;

    public Database(){
        this.kullaniciList = new ArrayList<>();;
    }

    public void KullaniciEkle(Kullanici kullanici){
        kullaniciList.add(kullanici);
    }

    public void KullaniciListele(){
        for (Kullanici kullanici : kullaniciList) {
            System.out.println("ID : " + kullanici.getId() + 
                               " İsim : " + kullanici.getIsim() +
                               " Email : " + kullanici.getEmail() +
                               " Şifre : " + kullanici.getSifre());
        }
    }
}
