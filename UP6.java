import java.util.Scanner;

public class UP6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String coutry = scanner.nextLine();
        switch (coutry){
            case "USA":
            case "England":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
