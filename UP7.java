import java.util.Scanner;

public class UP7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        boolean itsValid = true;
        int price = 0;
        if (0 <= age && age <= 18) {
            if (day.equals("Weekday")) {
                price = 12;
            } else if (day.equals("Weekend")) {
                price = 15;
            } else if (day.equals("Holiday")) {
                price = 5;
            }
        } else if (18 <= age && age <= 64) {
            if (day.equals("Weekday")) {

                price = 18;
            } else if (day.equals("Weekend")) {
                price = 20;
            } else if (day.equals("Holiday")) {
                price = 12;
            }
        } else if (64 <= age && age <= 122) {
            if (day.equals("Weekday")) {

                price = 12;
            } else if (day.equals("Weekend")) {
                price = 15;
            } else if (day.equals("Holiday")) {
                price = 10;
            }
        }
            else {
                itsValid = false;
        }
            if (itsValid){
                System.out.printf("%d$",price);
            }
            else {
                System.out.println("Error!");
            }


    }
}



