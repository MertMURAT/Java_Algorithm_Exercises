import java.util.Scanner;

public class QuestionOne{
    public static void main(String[] args) {
        // HarfSaydirma();
        //HarfDegistirme();
        // PalindromKontrol();
    }


    public static void HarfSaydirma(){

        String word;
        String characterIn;
        int sayac = 0;

        System.out.println("Dışarıdan girilen bir kelimede yine dışarıdan girilen bir harfin bulunmasını sağlayan uygulama");

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir Kelime Giriniz : ");
        word = sc.nextLine();
        String wordArray[] = new String[word.length()];

        for (int index = 0; index < wordArray.length; index++) {
           wordArray[index] = word.substring(index, index+1);
        //    System.out.println(wordArray[index]);
        }
    

        System.out.print("Bir Harf Giriniz : ");
        characterIn = sc.nextLine();

        sc.close();

        for (int i = 0; i < wordArray.length; i++) {
            if(characterIn.equalsIgnoreCase(wordArray[i])){
                sayac++;
                System.out.println("Girdiğiniz '" + characterIn + "' harfi " + i + ". indexte bulunmaktadır.");
            }
        }

        if (sayac > 1){
            System.out.println("Girdiğiniz '" + characterIn + "' harfi verdiğiniz kelimenin içerisinde " + sayac + " kere geçmektedir.");
        }else{
            System.out.println("Girdiğiniz harf verdiğiniz kelime içerisinde bulunmamaktadır.");
        }
    }

    public static void HarfDegistirme(){
        String word;
        String characterIn;
        String characterOut;
        String newWord = "";

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz : ");
        word = sc.nextLine();

        System.out.print("Lütfen değiştirmek istedidiğiniz harfi giriniz : ");
        characterIn = sc.nextLine();

        System.out.print("Hangi harf ile değiştirmek istiyorsunuz : ");
        characterOut = sc.nextLine();

        sc.close();
        
        String[] wordArray = new String[word.length()];

        for (int i = 0; i < wordArray.length; i++) {
            wordArray[i] = word.substring(i, i + 1);
        }

        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].equalsIgnoreCase(characterIn)) {
                newWord += characterOut; 
            } else {
                newWord += wordArray[i];
            }
        }

        System.out.println("Yeni oluşan kelime : " + newWord);
    }

    public static void PalindromKontrol(){
        String word;
        // Örnek Madam kelimesi
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz : ");
        word = sc.nextLine();

        sc.close();

        word = word.replaceAll("\\s+", "").toLowerCase();
        String reverse = new StringBuilder(word).reverse().toString();
        System.out.println("Kelimenin tersi : " + reverse);

        if(word.equals(reverse)){
            System.out.println("Girdiğiniz " + word + " kelimesi bir palindromdur.");
        }else{
            System.out.println("Girdiğiniz " + word + " kelimesi palindrom değildir.");
        }
    }

}