import java.util.Scanner;
import java.util.Random;
public class ornek2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random rn=new Random();
        int num1=rn.nextInt(10);
        int num2= rn.nextInt(10);
        int sonuc=0;
        if(num1>num2){
            System.out.println(num1);
            System.out.println(num2);
            System.out.println("1.sayı büyüktür");
             sonuc=num1-num2;

        }
        else {
            System.out.println(num1);
            System.out.println(num2);
            System.out.println("2. sayı büyüktür");
            sonuc=num2-num1;

        }
        System.out.println(sonuc);




    }
}
