import java.util.Scanner;

public class UP4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int Summin = (hours * 60) + minutes + 30;
        int resultHour = Summin / 60;
        int resultMin = Summin % 60;
        if (resultHour > 23 ){
            resultHour = 0;
        }
        System.out.printf("%d:%02d",resultHour ,resultMin);

        }
    }

