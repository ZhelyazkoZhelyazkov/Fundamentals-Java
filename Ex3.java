import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typePeople = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            if (typePeople.equals("Students")) {
                price = people * 8.45;
                if (people >= 30) {
                    price = price * 0.85;
                }
            } else if (typePeople.equals("Business")) {
                price = people * 10.90;
                if (people >= 100) {
                    price = price - 109;
                }
            } else if (typePeople.equals("Regular")) {
                price = people * 15;
                if (people >= 10 && people <= 20) {
                    price = price * 0.95;
                }
            }
        }
        else if (day.equals("Saturday")) {
            if (typePeople.equals("Students")) {
                price = people * 9.80;
                if (people >= 30) {
                    price = price * 0.85;
                }
            } else if (typePeople.equals("Business")) {
                price = people * 15.60;
                if (people >= 100) {
                    price = price - 156;
                }
            } else if (typePeople.equals("Regular")) {
                price = people * 20;
                if (people >= 10 && people <= 20) {
                    price = price * 0.95;
                }
            }
        }
        else if (day.equals("Sunday")) {
            if (typePeople.equals("Students")) {
                price = people * 10.46;
                if (people >= 30) {
                    price = price * 0.85;
                }
            } else if (typePeople.equals("Business")) {
                price = people * 16;
                if (people >= 100) {
                    price = price - 156;
                }
            } else if (typePeople.equals("Regular")) {
                price = people * 22.50;
                if (people >= 10 && people <= 20) {
                    price = price * 0.95;
                }
            }
            
        }

        System.out.printf("Total price: %.2f",price);
        }
    }
