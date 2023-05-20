import java.util.Scanner;

public class UP11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());


        for (int i =  num2  ; i <=10 ; i++) {
            int result = num * i;
            System.out.printf("%d X %d = %d%n",num,i,result);

        }if (num2>10){
            System.out.println(num+" X "+num2+  " = "+num2*num);
        }

    }
}
