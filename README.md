# Java_Algorithm_Exercises

Egzersiz Soruları :
SORU 1;
Bir menü yapalım. Bu menüde aşağıdaki seçenekler olsun ;
1. Harf Saydırma
○ Dışarıdan bir kelime ve bir harf girilsin eğer kelimenin içinde o harf var ise hangi
indexlerde olduğunu ve en sonda toplam kaç adet olduğunu yazdırsın.
ÖR; “Alperen”, “e” Konsol çıktısı ⇒
■ Girdiğiniz ‘e’ harfi 3. indexte bulunmaktadır.
■ Girdiğiniz ‘e’ harfi 5. indexte bulunmaktadır.
Son Konsol Çıktısı;
○ Girdiğiniz ‘e’ harfi verdiğiniz kelimenin içerisinde 2 kere geçmektedir.
○ Girdiğiniz harf verdiğiniz kelimede bulunmamaktadır.
2. Harf Değiştirme
○ Dışarıdan bir kelime ve bir harf girilsin. Eğer kelimenin içinde o harf var ise yeni
bir harf girelim ve kelimeyi değiştirelim.
ÖR; “Araba” “a”,”e” Konsol çıktısı ⇒
■ Eski Kelime ‘Araba’ yeni kelime ⇒ ‘Arebe’
3. Palindrom Kontrolü
○ Dışarıdan bir kelime girelim. Kelime palindrom ise : “Girdiğiniz ‘x’ kelimesi
palindromdur.” değilse “Girdiğiniz ‘x’ kelimesi palindrom değildir. yazdırsın.
0. Çıkış
SORU 2;
Dışarıdan girilen ülke ismi bizim array’imizde bulunuyor mu? Kontrol edelim.
Array; { "Türkiye", "Japonya", "Moğolistan", "Amerika", "Rusya", "Çin" };
Bulunup bulunmama durumuna göre çıktı verelim.
SORU 3;
int[] sayilar = { 120, 130, 125, -256, 16, 1300, 1258, 81, 14 };
Dizideki en büyük 2. Sayıyı bulup yazdıralım.
SORU 4;
int[] sayilar = { 2, -256, 2, 1258, 2, 2 };
bir dizide ard arda gelen 2 index deki sayı değeri 2 ise true yazdırıp döngüyü sonlandıralım.
Arka arkaya 2 sayısı gelmiyor ise false yazdıralım.
SORU 5;
int [] sayilar={1,4,5,6,1,1,4,8};
dizi içerisinde 1 ve 4 sayılarının kaç kere geçtiğini yazdıralım. 1 sayısının adeti 4
sayısının adetinden fazla ise true değilse false yazdıralım.
SORU 6;
Bir hesap makinesi uygulaması yazacağız.
İşlevler;
1- Toplama
2- Çıkarma
3- Çarpma
4- Bölme
0- Çıkış
4 işlem yaparken kullanıcı "=" girene kadar işlem gerçekleştirilmeye devam edecek.
"=" yazıldığı zaman sonucu gösterip ana menüye dönecek.
Sınıflar;
HesapMakinesi
Uygulama
SayiKontrol (Gerekli Açıklamalar En Altta)
Uygulama sınıfımız her şeyin bir arada toplandığı sınıfımız olacak.
HesapMakinesi sınıfımız Uygulama sınıfımızı çalıştıracağımız main sınıfımız olacak.
Bunu gerçekleştirebilmek için aşağıdaki metotlara ihtiyacımız olacak;
Uygulama Sınıfı İçin;
uygulama();
menu();
islemSec();
toplama();
cikarma();
carpma();
bolme();
SayiKontrol Sınıfı İçin;
SayiKontrol sınıfımız, girilen string'in nümerik bir değer olup olmadığını kontrol edecek kontrol
sınıfımız olacak.
boolean isNumeric(); isimli bir metoda ihtiyacımız var.
isNumeric metodunda yapmamız gerekenler;
Dışarıdan parametre olarak bir String değer alacağız.
Sonra bu aldığımız String değerin bütün "char"larında gezmemiz gerekiyor.
Her gezdiğimiz "char"da :
Negatif sayıları kontrol edebilmek için string'in 0. indexinde "-" var mı diye kontrol edebiliriz.
Sonrasında Character.isDigit(); metodunu kullanabiliriz. Bu metot bize true ya da false bir değer
dönecektir.
Buradan dönen değere göre kullanıcıya; "Lütfen geçerli bir değer giriniz" yönlendirmesi yapabilir,
SORU 7;
Taş-kağıt-makas oyunu yazalım. Kullanıcı dışarıdan bir seçim girsin ( Taş , Kağıt, Makas ).
Bilgisayar da rastgele bir seçim üretsin. Ondan sonra kim kazanıyor ise onun skoru artsın. Oyun
kullanıcı devam etmek istediği sürece devam edebilsin. Devam etme sorusu şu sekilde olabilir.
Oynamaya devam etmek istiyor musunuz? ( E / H) → ‘E’ girildiği sürece oyun devam eder. ‘E ’
dışında herhangi bir girdide oyun kapanır. Oyun kapanırken final skoru ve kimin kazandırdığını
da yazdırsın.
SORU 8;
● Bir kullanıcı kayıt sistemi oluşturacağız.
İhtiyacımız olan sınıflar;
○ Kullanıcı
■ id, isim, email, sifre tutsun.
○ Database
■ Oluşturulan bütün kullanıcıların listesini tutsun.
○ Uygulama
■ Bütün oluşturma, menü vs işlemlerini burada gerçekleştirelim.
○ Main
■ Uygulama sınıfının bir nesnesini oluşturup bu sınıfta çalıştıralım ve
uygulamamız ayağa kalksın.
Bu soruda Encapsulation mantığına uygun kod yazalım.
SORU 9;
● Calisan isimli bir superclass oluşturup. Bu sınıftan faydalanacak Muhendis ve
OfisCalisani sınıfları oluşturacağız.
● Her çalışanın aşağıdaki field’ları olacak
○ isim
○ soyisim
○ unvan
○ maas
● Çalışanların ünvanları aldıkları maaşa göre değişecek.
○ Mühendisler için;
■ 10000 - 12000 arasında maaş alanların ünvanı : “Mühendis”
■ 12000 - 17000 arasında ise ünvanı : “Kıdemli Mühendis”
■ 17000’den yuksek ise ünvanı : “Uzman Mühendis”
■ 10000’den küçük ise ünvanı : “Stajyer Mühendis”
○ Ofis Çalışanları için;
■ 8000 - 12000 arasında maaş alanların ünvanı : “Çalışan”
■ 12000’den yüksek ise ünvanı : “Kıdemli Çalışan”
■ 8000’den küçük ise ünvanı : “Stajyer”
● Bütün çalışanlara zam yapılabilecek. Dolayısıyla bütün çalışanlar bir zamYap()
metoduna sahip olmalıdır. ( Burada kalıtımı ve diğer öğrendiklerimizi göz önüne alarak
metodun nerede tanımlanması gerektiğini bulabilirsiniz ).
● Mühendisler ve Ofis çalışanları maaş zammını aynı şekilde almayacaklar.
○ Mühendisler için:Maaş+(Maaş*Zam Oranı) + 250TL
○ Ofis Çalışanları için : Maaş+(Maaş*Zam Oranı)
Kurguyu tamamladıktan sonra bütün maaş senaryolarını, Zam senaryolarını test edelim.
UNUTMAYIN! : Bir çalışan zam aldığında ünvanı değişebilir �
