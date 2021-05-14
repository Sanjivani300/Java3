package loops;
import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
    /* 5!= 5*4*3*2*1 =120
       n!= n*(n-1)*(n-2)..... until i value 1 or uss se big hai
                              i ke value 0 or uss se choti hoti hai ya loops sai bhara aya ga
     */
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no");

        int n=obj.nextInt();
        int factorial=1;

        for(int i=n; i>=1;i--){
            factorial=factorial * i;
        }
        System.out.println(factorial);

    }
}
