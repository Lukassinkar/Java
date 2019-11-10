import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        double num1, num2, num3, result;
        char symbol;
        char repeat;

        System.out.println("Skaiciuotuvas.");

        do {
            Scanner S = new Scanner(System.in);
            System.out.println("Iveskite simboli.");
            symbol = S.next().charAt(0);
            System.out.println("Iveskite pirma skaiciu.");
            num1 = S.nextDouble();
            System.out.println("Iveskite antra skaiciu.");
            num2 = S.nextDouble();

            switch (symbol) {
                case '+':
                    result = add(num1, num2);
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case '-':
                    result = substract();
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case '*':
                    multiplicate(num1, num2);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Dalyba is nulio negalima.");
                    } else {
                        divide();
                    }
                    break;
                case '#':
                    for (int i = 13; i <= 25; i++) {
                        result = num1 * num2 + (num2 - num1) / num1 * i;
                        System.out.println(num1 + " * " + num2 + " + (" + num2 + " - " + num1 + ") / " + num1 + " * "
                                + i + " = " + result);

                        if (result < 6) {
                            System.out.println(result + " yra maziau uz 6.");
                        } else if (result == 6) {
                            System.out.println(result + " yra lygu 6.");
                        } else if (result > 6) {
                            System.out.println(result + " yra daugiau uz 6.");
                        }
                    }
                    break;
                case '%':
                    System.out.println("Iveskite trecia skaiciu.");
                    num3 = S.nextDouble();

                    multiplicate(num1, num2, num3);
                    break;
                default:
                    System.out.println("Ivestas netinkamas simbolis.");
            }

            System.out.println("Ar norite testi darba? y / kitu atveju gali rasyti, bet koki simboli.");
            repeat = S.next().charAt(0);
        } while (repeat == 'y');
    }

    /**
     * Atimtis tarp dvieju skaiciu, funkcija be parametru
     *
     * @return dvieju skaiciu skirtumas
     */
    private static double substract() {
        double num1, num2, result;

        Scanner S = new Scanner(System.in);
        System.out.println("Iveskite pirma skaiciu.");
        num1 = S.nextDouble();
        System.out.println("Iveskite antra skaiciu.");
        num2 = S.nextDouble();

        result = num1 - num2;

        return  result;
    }

    /**
     * Sudetis tarp dvieju skaiciu
     *
     * @param num1 - pirmas skaicius
     * @param num2 - antras skaicius
     * @return dvieju skaiciu suma
     */
    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Dalyba tarp dvieju skaiciu, funkcija be parametru, funkcija negrazina reiksmes
     */
    private static void divide() {
        double num1, num2;
        double result;

        Scanner S = new Scanner(System.in);
        System.out.println("Iveskite pirma skaiciu.");
        num1 = S.nextDouble();
        System.out.println("Iveskite antra skaiciu.");
        num2 = S.nextDouble();

        result = num1 / num2;

        System.out.println(num1 + " / " + num2 + " = " + result);
    }

    /**
     * Daugyba tarp dvieju skaiciu, funkcija negrazina reiksmes
     *
     * @param num1 - pirmas skaicius
     * @param num2 - antras skaicius
     */
    private static void multiplicate(double num1, double num2) {
        double result = num1 * num2;

        System.out.println(num1 + " * " + num2 + " = " + result);
    }

    /**
     * Daugyba tarp triju skaiciu, funkcija negrazina reiksmes
     *
     * @param num1 - pirmas skaicius
     * @param num2 - antras skaicius
     * @param num3 - trecias skaicius
     */
    private static void multiplicate(double num1, double num2, double num3) {
        double result;

        result = num1 * num2 * num3;

        System.out.println(num1 + " * " + num2 + " * " + num3 + " = " + result);
    }
}
