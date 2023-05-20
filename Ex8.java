import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        int currentNum = 0;

        for (int i = 1; i <= num; i++) {
            currentNum++;
            for (int count = 1; count <= i ; count++) {
                System.out.print(i + " ");
            }
            System.out.println();

//            //System.out.printf("%d  ", currentNum);
//            //System.out.printf("%d %n", currentNum);


        }
    }

}



