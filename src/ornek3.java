import java.util.Scanner;
public class ornek3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double weight;
        double height;
        System.out.println("boyunuzu giriniz: ");
        weight=input.nextDouble();
        System.out.println("kilonuzu giriniz: ");
        height=input.nextDouble();
        double bmd=height/(weight*weight);
        if(bmd<18.5)
        {
            System.out.println("UNDERWEİGHT"+bmd);

        } else if (bmd<25) {
            System.out.println("normal"+bmd);

        }
        else if (bmd<30){
            System.out.println("overweight"+bmd);
        }
        else {
            System.out.println("obez"+bmd);
        }


    }
}
