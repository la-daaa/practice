import java.text.DecimalFormat;
import java.util.Scanner;

public class P5708 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double p = (a+b+c)/2;
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println(df.format(Math.sqrt(p*(p-a)*(p-b)*(p-c))));
    }
}
