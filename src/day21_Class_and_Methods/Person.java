package day21_Class_and_Methods;

public class Person {
//isim cinsiyet yaş fields
    //uyu() oyunOyna ()

    String isim;
    String cinsiyet;
    int yas;
    String tcNo;

    public void uyu(){
        System.out.println(isim+" uyuyor");
    }

    public void  oyunOyna(){
        System.out.println(isim+ "oyun oynuyor");
    }

    public  void tumBilgileriGetir(){
        System.out.println("isim:"+isim);
        System.out.println("yas: "+yas);
        System.out.println("cinsiyet: "+cinsiyet);
        System.out.println("Kimlik numarası:"+tcNo);
    }





}
