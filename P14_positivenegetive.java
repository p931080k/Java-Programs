import java.util.Scanner;

public class P14_positivenegetive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n= sc.nextInt();
        if(n<0){
            System.out.println("negetive");
        }else if (n>0) {
            System.out.println("Positive");
        }
        else{
            System.out.println("Zero");
        }
    }
}
