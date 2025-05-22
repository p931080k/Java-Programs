import java.util.Scanner;

public class P18_largest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a= sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b= sc.nextInt();
        System.out.println("enter the value of c : ");
        int c= sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is greater than both b and c ");
        }else if(b>a && b>c){
            System.out.println("b is greater than both a and c ");
        }else{
            System.out.println("c is greater than both a and b ");
        }
    }
}
