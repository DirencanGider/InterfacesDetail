public interface IDeneme {

    //private int a = 4;  // Hata aldık. Interface içerisinde private bir alan kesinlikle kullanılamaz şeklinde.  //  1

    public int a = 4;  /* Fakat public yazdığımızda herhangi bir sorun çıkartmadı. Çünkü Arayüzler, sınıfların bir görevi
                          nasıl yapılacağını değil, görev yapılırken hangi adımları yapması gerektiğini belirtir. Bu nedenle
                          arayüzlerde değişkenler tanımlanabilir ve bu değişkenler varsayılan olarak public olur.*/  //  2

    /*public int b;  /*  Eğer veri tipine herhangi bir değer vermez ise yine problem çıkarıyor. Yani public olarak tanımlayacaksak
                       kesinlikle değer vermek zorundayız. */  //  4

    public int b = 5;  //  5

    public static String deneme = "Deneme";  /*  Burada yazmış olduğumuz static anlamsız. Zatnw yukarıdakileri static olarak
                                                 yazmadığımız halde dahi erişebildik. */  //  8

    public final int c = 6;  /*  Yine problem yaşamadık. Fakat eğer c'ye değer vermeseydik yine problem çıkaracaktı. Çünkü
                                 interface içerisinde constuctor oluşturamayacağımız için başka bir şekilde c'ye değer atama
                                 şansımız olmayacak. */  //  9

    public static void deneme () {  // Interface'e metod eklerken static ifadesi kullanmamız gerekir. Yoksa hata alırız.  //  11

        System.out.println("Deneme");

    }


}
