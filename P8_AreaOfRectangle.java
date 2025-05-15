import java.util.Scanner;

public class P8_AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length Of Rectangle ");
        int l= sc.nextInt();
        System.out.println("Breadth of Rectangle");
        int b= sc.nextInt();
        System.out.println("Area of rectangle");
        int area=l*b;
        System.out.println(area);
    }
}
