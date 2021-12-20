import java.util.Scanner;

public class Main {

    /*public static int bolme(int a,int b){
        if(b==0){
            System.out.println("İkinci sayı 0 olamaz.");
            System.exit(1);
        }
        return a / b;

    }*/
   /* public static int bolme(int a,int b) throws ArithmeticException{
        if(b==0){
            ArithmeticException ex = new ArithmeticException("Bir sayı 0 'a bölünemez");
            throw ex;
        }
        
            return a/b;
        

    }*/
    public static int deneme(int sayi)throws YusufExcepiton{
        if(sayi==0){
            YusufExcepiton yusufExcepiton = new YusufExcepiton("Exception sınıfı calisiyor");
            throw yusufExcepiton;
        }
        return sayi;
//denemeeeeeee
    }

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1,sayi2;
        /*
        
        System.err.println("Lutfen 1. sayiyi giriniz: ");
        sayi1 = scanner.nextInt();
        System.out.println("Lutfen 2. sayiyi giriniz: ");
        sayi2 = scanner.nextInt();
        System.out.printf("%d / %d = %d",sayi1,sayi2,sayi1/sayi2);
        */
      /*  Scanner scanner = new Scanner(System.in);
        int sayi1,sayi2;
        System.err.println("Lutfen 1. sayiyi giriniz: ");
        sayi1 = scanner.nextInt();
        System.out.println("Lutfen 2. sayiyi giriniz: ");
        sayi2 = scanner.nextInt();
        if(sayi2==0)
        System.out.println("Lutfen 2. sayiyi 0 girmeyiniz.");
        else
        System.out.printf("%d / %d = %d",sayi1,sayi2,sayi1/sayi2);*/

        /*System.err.println("Lutfen 1. sayiyi giriniz: ");
        sayi1 = scanner.nextInt();
        System.out.println("Lutfen 2. sayiyi giriniz: ");
        sayi2 = scanner.nextInt();
        try{
            System.out.printf("%d / %d = %d",sayi1,sayi2,bolme(sayi1, sayi2));
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Catchten sonra çalışan yer");
        */
        System.out.println("Lutfen 1.  sayiyi giriniz: ");
        sayi1 = scanner.nextInt();
        try{
            System.out.println("Sayi = "+deneme(sayi1));
        }catch(YusufExcepiton ex){
            System.out.println(ex.getMessage());
        }



    }
}
