import java.util.Scanner;
public class ornek5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int year;
        System.out.println("yıl giriniz: ");
        year=input.nextInt();
        if((year%100!=0)&&(year%4==0)){
            System.out.println("artık yıl");
        }
        else {
            System.out.println("artık yıl değildir");
        }

    }
}
