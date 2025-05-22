import java.util.Scanner;

public class P17_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
        boolean flag=false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=true;
            }else {
                flag=false;
            }
        }
        if(!flag){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}
