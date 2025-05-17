import java.util.Scanner;

public class P13_fahrenheittocelsius {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit : ");
        double fahrenheit= sc.nextDouble();
        double celsius= (fahrenheit-32)*5/9;
        System.out.println( celsius);
    }
}
