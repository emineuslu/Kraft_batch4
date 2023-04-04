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

    public static void main(String[] args) {

        String kelime="EKinlenmek";
        String kontrol="kin";
        System.out.println(ilkKelimeKontrol(kelime, kontrol));

    }

    public static boolean ilkKelimeKontrol(String str,String target){
        if(target==null) return false;
        str=str.toLowerCase();
        target=target.toLowerCase();
     return str.startsWith(target)||str.substring(4).startsWith(target);

    }


    //Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa, uzun
    // kelimeyi ortada 30 defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.
    //Mehmet
    //Ali AliAliMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe hmet
    // MehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe hmetMehmetMehmetMehmet
    // MehmetMehmetMehmetMehmetMehmetMehmetMe hmetMehmetMehmetMehmetMehmetMehmetMehmet
    // MehmetMehmetMehmetMe hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
    // hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetAliAli

}
