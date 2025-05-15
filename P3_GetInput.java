import java.util.Scanner;

public class P3_GetInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("table");
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
}
