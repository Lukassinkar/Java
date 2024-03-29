import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Skaiciuotuvas.");

        double num1, num2;
        double result = 0;
        char symbol;
        char repeat;

        Scanner S = new Scanner(System.in);

        do {
            System.out.println("Iveskite pirma skaiciu.");
            num1 = S.nextDouble();
            System.out.println("Iveskite antra skaiciu.");
            num2 = S.nextDouble();
            System.out.println("Iveskite simboli.");
            symbol = S.next().charAt(0);

            switch (symbol) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num1 == 0 || num2 == 0) {
                        System.out.println("Dalyba is nulio negalima.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Ivestas netinkamas simbolis.");
            }

            System.out.println("rezultatas: " + result);
            System.out.println("Ar norite testi darba? y / kitu atveju gali rasyti, bet koki simboli.");
            repeat = S.next().charAt(0);
        } while (repeat == 'y');
    }
}
