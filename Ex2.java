import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int max = Math.abs(num);
        int result =0;

        if (num % 10 == 0){
    result = num / 10;
    System.out.println("The number is divisible by 10");
}
       else if (num % 7 == 0){
            result = num / 7;
            System.out.println("The number is divisible by 7");
        }
       else if (num % 6 == 0){
            result = num / 6;
            System.out.println("The number is divisible by 6");
        }
       else if (num % 3 == 0){
            result = num / 3;
            System.out.println("The number is divisible by 3");
        }
       else if (num % 2 == 0){
            result = num / 2;
            System.out.println("The number is divisible by 2");
        }
            else {
            System.out.println("Not divisible");
        }


        }

    }

