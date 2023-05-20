    import java.util.Scanner;

    public class Ex7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            String input = scanner.nextLine();
            double money = 0;
            double productCost = 0;
            while (!input.equals("Start")) {
                double inputMoney = Double.parseDouble(input);

                if (inputMoney != 0.1 && inputMoney != 0.2 && inputMoney != 0.5 && inputMoney != 1 && inputMoney != 2) {
                    System.out.printf("Cannot accept %.2f%n", inputMoney);
                } else {
                    money += inputMoney;
                }
                input = scanner.nextLine();
            }

    //        "Nuts", "Water", "Crisps",
    //"Soda", "Coke". The prices are: 2.0, 0.7, 1.5, 0.8, 1.0 respectively.
            String product = scanner.nextLine();
            while (!product.equals("End")) {

                if (product.equals("Nuts")) {
                    productCost = +2.0;
                    if (productCost <= money) {
                        System.out.println("Purchased Nuts");
                        money = money-productCost;
                    } else System.out.println("Sorry, not enough money");
                    productCost = 0;

                } else if (product.equals("Water")) {
                    productCost += 0.7;
                    if (productCost <= money) {
                        System.out.println("Purchased Water");
                        money = money-productCost;
                    } else System.out.println("Sorry, not enough money");
                    productCost = 0;
                } else if (product.equals("Crisps")) {
                    productCost += 1.5;
                    if (productCost <= money) {
                        System.out.println("Purchased Crisps");
                        money = money-productCost;
                    } else System.out.println("Sorry, not enough money");
                    productCost = 0;
                } else if (product.equals("Soda")) {
                    productCost += 0.8;
                    if (productCost <= money) {
                        System.out.println("Purchased Soda");
                        money = money-productCost;
                    } else System.out.println("Sorry, not enough money");
                    productCost = 0;
                } else if (product.equals("Coke")) {
                    productCost += 1.0;
                    if (productCost <= money) {
                        System.out.println("Purchased Coke");
                        money = money-productCost;
                    } else System.out.println("Sorry, not enough money");
                    productCost = 0;
                } else {
                    System.out.println("Invalid product");
                }
                product = scanner.nextLine();
                if (product.equals("End")){

                    System.out.printf("Change: %.2f",money);
                }

            }

            //if (end.equals("End")){



           // }




            }
        }


