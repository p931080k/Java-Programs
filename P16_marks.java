import java.util.Scanner;

public class P16_marks {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= sc.nextInt();

        if(n<30){
            System.out.println("fail");
        }else if(n>=30 && n<45){
            System.out.println("D");
        }else if(n>=45 && n<60){
            System.out.println("C");
        } else if(n>=60 && n<70){
            System.out.println("B");
        }else if(n>=70 && n<80){
            System.out.println("A ");
        }else if (n>=80 &&n<90){
            System.out.println("A+ ");
        }else{
            System.out.println("Excellent");
        }
    }
}
