import java.util.Scanner;

public class P24_leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= sc.nextInt();
        if((n%4==0 && n%100!=0) ||(n%400==0)){
            System.out.println("is leap year");
        }else{
            System.out.println(" not leap year");
        }
    }
}
