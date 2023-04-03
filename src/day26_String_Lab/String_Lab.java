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




    //Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını
    // döndüren bir program yazdırın.
    //Sanayagı yagı Mutluluk uluk
    public static String ikinciYari(String str){
        return str.substring(str.length()/2);
    }
    public static String ikinciYari2(String str){

        // sanatyağı
         //012345678
        if(str.length()%2==0){
            return str.substring(str.length()/2);
        }else {
            return str.substring(str.length()/2+1);
        }
    }

    public static String ikinciYari3(String str){
//                                                (int) 5.0=5
//                                      (int)Math.ceil(4.5 )
       return str.substring( (int) Math.ceil( (double)str.length()/2   )        );
    }




    public static void main(String[] args) {
        String kelime="Sanatyagı"; // %%merhaba%dünya
        //             012345678
        System.out.println(ilkKelimeDegistir("Merhabaer" ,"er", "is"));
    }
    //Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve
    // yeni harfi/harfleri alan ve buna göre kelimede/dizede sadece
    // ilk bulduğu yeri değiştiren metodu yazınız.
    //(Merhaba ,a, e) Merheba (Kasaba , a, i) Kisaba

    public static String ilkKelimeDegistir(String str,String eski,String yeni){

        return str.replaceFirst(eski,yeni);
    }

    //trim(String str) şeklinde bir metot yazın trim gibi çalışsın
    // ve string döndürsün.  İçerisinde string in hazır metodu olan trim metodunu kullanmayın.

}
