package day26_String_Lab;

public class String_Lab {



    //Kullanıcıdan bir input alın ve girilen inputun ilk 3
    // harfini yazan , 3 kelimeden az ise inputu döndüren bir metot yazınız.
    //Merhaba Mer Ali Ali



    public static String ilkUcHarfGetir(String str){
        if(str.length()<3){
            return str;
        }
        return str.substring(0,3);
    }






     //Kullanıcıdan bir dize sözcük alın ve her
    // boşluğa % ibaresi ekleyin. Merhaba dünya Merhaba%dünya
    // "   merhaba dünya  "   %%%merhaba%dünya%%

   public static String boslukSilYuzdeEkle(String str){

        return str.replace(" ","%");
   }

    public static void main(String[] args) {
        String kelime="  merhaba  dünya  "; // %%merhaba%dünya
        System.out.println(boslukSilYuzdeEkle(kelime));
    }


    //Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını
    // döndüren bir program yazdırın.
    //Sanayagı yagı Mutluluk uluk
}
