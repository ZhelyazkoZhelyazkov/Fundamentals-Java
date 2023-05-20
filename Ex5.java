import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

import java.util.Scanner;

        public class Ex5 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                String username = scanner.nextLine();
                String password = "";

                for (int i = username.length() - 1; i >= 0; i--) {
                    char currentSymbol = username.charAt(i);
                    password += currentSymbol;
                }

                int countWrongpass = 0;
                String lastPassword = scanner.nextLine();

                while (!lastPassword.equals(password)) {
                    countWrongpass++;
                    if (countWrongpass == 4) {
                        System.out.printf("User %s blocked!", username);
                        break;
                    }
                    System.out.println("Incorrect password. Try again.");
                    lastPassword = scanner.nextLine();
                }
                if (lastPassword.equals(password)) {
                    System.out.printf("User %s logged in.", username);
//
                }
            }
        }


    }
}
