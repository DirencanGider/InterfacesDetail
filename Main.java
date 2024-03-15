/*

    Normalde daha öcneki Inteface derslerinde hoca bize Interfaceler için özellik ve metod eklenemez demişti.
    Fakat bu durum böyle değil. Interfacelere, özellik ve metod eklenebilmektedir.
    Birlikte bu derste bunu öğreneceğiz.

 */
public class Main {
    public static void main(String[] args) {

        System.out.println(IDeneme.a);  //  Java interface direkt erişmemizde problem çıkarmadı.  //  3
        System.out.println(IDeneme.b);  //  6
        System.out.println(IDeneme.deneme);  //  7
        System.out.println(IDeneme.c);  //  10

        IDeneme.deneme();  //  12

    }


}
