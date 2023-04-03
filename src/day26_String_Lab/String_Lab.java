package day26_String_Lab;

public class String_Lab {



    //Kullanıcıdan bir input alın ve girilen inputun ilk 3
    // harfini yazan , 3 kelimeden az ise inputu döndüren bir metot yazınız.
    //Merhaba Mer Ali Ali


    public static void main(String[] args) {

        String str="a"; // Har
        // Ali Ali
        // iş iş
        // a  a
        System.out.println(ilkUcHarfGetir2(str));



    }
    public static String ilkUcHarfGetir(String str){
        if(str.length()<3){
            return str;
        }
        return str.substring(0,3);
    }





}
