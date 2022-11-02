import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c,enKucuk=0,enBuyuk=0,orta;

        Scanner scan=new Scanner(System.in);
        System.out.print("1. sayiyi giriniz:");
        a=scan.nextInt();

        System.out.print("1. sayiyi giriniz:");
        b=scan.nextInt();

        System.out.print("1. sayiyi giriniz:");
        c=scan.nextInt();

        if (a<b && a<c){
            enKucuk=a;
            if (b>c){
                enBuyuk=b;
                orta=c;
            }else{
                enBuyuk=c;
                orta=b;
            }
        }else if (b<a && b<c) {
            enKucuk=b;
            if (a>c){
                enBuyuk=a;
                orta=c;
            }else {
                enBuyuk=c;
                orta=a;
            }
        }else {
            enKucuk=c;
            if (a>b){
                enBuyuk=a;
                orta=b;
            }else {
                enKucuk=b;
                orta=a;
            }
        }

        System.out.println(enKucuk+" " +orta+" " +enBuyuk);

    }
}