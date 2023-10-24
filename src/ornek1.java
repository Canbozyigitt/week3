import java.util.Scanner;
public class ornek1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("bir sayı giriniz: ");
        num=input.nextInt();
        if(num%2==0){
            System.out.println("HiEven");
        }
        else if (num%5==0){
            System.out.println("HiFive");
        }


    }
}
