import java.util.Scanner;

public class GcdLcm{
    public static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        else {
            return gcd(b,a%b);
        }
    }

    public static int lcm(int a, int b){
        return a/gcd(a,b)*b;
    }

    public static void  main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
    }
}
