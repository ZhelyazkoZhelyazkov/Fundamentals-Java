import java.util.Scanner;

public class UP13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 1;
        for (int i = sum; i <= n; i++) {
            System.out.print(2 * i + 1);
            sum += 2 * i;
        }
        System.out.printf("Sum: %d%n", sum);
    }
}
