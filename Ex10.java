import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double amountMoney = Double.parseDouble(scanner.nextLine());
        int  studentsCount = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        double freeBelts = (studentsCount / 6) * beltPrice;
       double totalCost =  (Math.ceil(studentsCount * 1.1)) * lightsaberPrice   + (studentsCount * robesPrice) + (studentsCount * beltPrice) - freeBelts;

            if (totalCost <= amountMoney){
                System.out.printf("The money is enough - it would cost %.2flv.",totalCost);
            }
            else  {
                System.out.printf("George Lucas will need %.2flv more.",totalCost-amountMoney);

            }

    }
}
