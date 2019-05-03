import java.util.Scanner;

public class Test {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        showMenu();


    }

    public static void showMenu() {
        MainHandler mainHandler = new MainHandler();


        //int howManyTimes = 5;
        String choice = " ";

        while (!choice.equals("0")) {

            System.out.println("1. Kup \n 2.Menu \n 0. Exit");
            choice = scanner.next();
            scanner.nextLine();
            System.out.println("Choice = " + choice);

            switch (choice) {
                case "1":
                    mainHandler.buyProduct();
                    break;

                case "2":
                    mainHandler.showProduct();
                    break;

                default:
                    System.out.println("Nie ma takiej opcji");
                    break;
            }
        }
        System.out.println("Koniec");
    }

}
