import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;
public class P1425 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        LocalDateTime start = LocalDateTime.of(2022, 1, 1, a, b, 0);
        LocalDateTime end = LocalDateTime.of(2022, 1, 1, c, d, 0);
        Duration duration = Duration.between(start, end);
        long e = duration.toHours();
        long f = duration.toMinutes();
        System.out.println(e+" "+f%60);
    }
}