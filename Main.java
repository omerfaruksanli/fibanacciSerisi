import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print(" Eleman sayısını giriniz : ");
        n = input.nextInt();

        int toplam,n1=0,n2=1;
        for (int i=0; i<n ; i++ ){
        toplam=n1+n2;
            System.out.print(toplam+" ");
        n1=n2;
        n2=toplam;

        }





    }
}