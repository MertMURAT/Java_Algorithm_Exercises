package soru_8;

public class Kullanici {
    private int id;
    private String isim;
    private String email;
    private String sifre;

    public Kullanici(int id, String isim, String email, String sifre) {
        this.id = id;
        this.isim = isim;
        this.email = email;
        this.sifre = sifre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    
    
}
