import java.util.Scanner;

public class P7_areaofacircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Radius of circle ");
        int r= sc.nextInt();
        System.out.println("area of circle");
        float area = (2*22*r)/7;
        System.out.println(area);
    }
}
