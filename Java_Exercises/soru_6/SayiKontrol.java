package soru_6;

public class SayiKontrol {
   
    public static void main(String[] args) {
        System.out.println(IsNumeric("-2"));
    }

    public static boolean IsNumeric(String numberIn){
        boolean digit = true;
        
        if(numberIn.isEmpty() || numberIn == null || numberIn.length() == 0){
            return false;
        }

        for (int i = 0; i < numberIn.length(); i++) {
            digit = Character.isDigit(numberIn.charAt(i));
            if(numberIn.charAt(i) == '-'){
                continue;
            }
            if(!digit){
                return false;
            }
        }

        return digit;
    }
}
