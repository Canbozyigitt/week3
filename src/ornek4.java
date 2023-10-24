import java.util.Scanner;
public class ornek4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("bir sayı giriniz");
        num=input.nextInt();
while (true){
        if((num%2==0)&&(num%3==0)){
            System.out.println(num);
            System.out.println(num+" 2'ye ve 3'e bölünür");

            break;

        }
        else {
            System.out.println(num);
            System.out.println(num+" 6 ya bölünmez");
        }

    }
}}
