import java.util.Scanner;

public class P21_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= sc.nextInt();
        int firstterm=0;
        int secondterm=1;
        int i=1;
        while(i<=n){
            int nextterm=firstterm+secondterm;
            System.out.print(nextterm+" ");
            firstterm=secondterm;
                    secondterm=nextterm;
            i++;
        }

    }
}
