import java.util.Scanner;

public class UP9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int n = 1 ; n <=  num * 2; n ++) {
            if (n % 2 != 0){
                System.out.println(n);
                sum += n;
            }

        }
        System.out.println("Sum: " + sum);
    }
}
