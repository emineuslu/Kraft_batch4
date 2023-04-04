package day27_String_Lab_Cont;

public class StringLabCont {




    /*
    Kullanıcıdan bir kelime alın ve kin kelimesi başından veya
    ilk karakterden sonra gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;
    Kinlenmek true
    Kin tutmak true
    Ekin ektim true
    Keskin ilçesinden geçiyorum false
     Neden kin tutuyorsun false */



    public static boolean ilkKelimeKontrol(String str,String target){
        if(target==null) return false;
        str=str.toLowerCase();
        target=target.toLowerCase();
     return str.startsWith(target)||str.substring(4).startsWith(target);
    }

    public static boolean ilkKelimeKontrol2(String str,String target){

        return str.substring(0,target.length()+1).contains(target);
    }


    //Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa, uzun
    // kelimeyi ortada 30 defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.
    //Mehmet
    //Ali AliAliMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe hmet
    // MehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe hmetMehmetMehmetMehmet
    // MehmetMehmetMehmetMehmetMehmetMehmetMe hmetMehmetMehmetMehmetMehmetMehmetMehmet
    // MehmetMehmetMehmetMe hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
    // hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetAliAli



    public static String cokluYazdir(String str1,String str2,int ilkDongu,int ortaDongu,int sonDongu){
        String result="";
        if(str1.length()<str2.length()){

            for (int i = 0; i <ilkDongu ; i++) {
                result+=str1;
            }
            //result=str1+str1+str2+str2
            for (int i = 0; i < ortaDongu; i++) {
                result+=str2;
            }
            for (int i = 0; i <sonDongu ; i++) {
                result+=str1;
            }
        }else {
            for (int i = 0; i <ilkDongu ; i++) {
                result+=str2;
            }
            //result=str1+str1+str2+str2
            for (int i = 0; i < ortaDongu; i++) {
                result+=str1;
            }
            for (int i = 0; i <sonDongu ; i++) {
                result+=str2;
            }
        }
        return result;

    }


    //Kullanıcıdan bir kelime veya söz alın ve ilk 5
    // karakterini yazdırın. 5 karakterin altında bir kelime girdiği taktirde
    // 5 karaktere nokta ile tamamlayın.
    //Sabun Sabun Merhaba Merha Ali Ali..
    //Hey Hey..
    //Pi Pi...

     public static String karaktereTamamla(String str,int number,char karakter){
        if(str.length()>=number){
            return str.substring(0,number);
        }
       // int count=number-str.length();
         for (int i = str.length(); i <number ; i++) {
             str+=karakter;
         }
        return str;

    }



//Kullanıcıdan bir kelime alın ve
// bu kelimenin ilk 2 harfi sonunda
// yer alıyorsa true almıyorsa false yazdırın.


}
