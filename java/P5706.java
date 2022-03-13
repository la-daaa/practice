import java.text.DecimalFormat;
import java.util.Scanner;

public class P5706{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        int n = sc.nextInt();
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(t/n));
        System.out.println(n*2);
    }
}