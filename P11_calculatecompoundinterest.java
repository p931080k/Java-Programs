import java.util.Scanner;

public class P11_calculatecompoundinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle : ");
        double p = sc.nextFloat();

        System.out.println("Enter the rate of interest : ");
         double r = sc.nextFloat();

        System.out.println("enter the time period :");
        double t = sc.nextFloat();

        double ci= Math.pow(1+r/r,r*t);
        System.out.println("Total amount will be "+ci);
        double amount=ci+p;
        System.out.println("Compound Interest will be "+amount);
    }
}
