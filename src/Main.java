import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        Random rn=new Random();
        int a= rn.nextInt();
        int b= rn.nextInt();
        int sonuc = a + b;
        System.out.println(sonuc);


    }
}