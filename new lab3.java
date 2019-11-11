public class Main {

    public static void main(String[] args) {
        double[] numArr = {7, 91, -15, 24, -8, -11, 2, -55, 62, 42};

        try {
            System.out.println("Masyvai");
        } catch (Exception e) {
            System.out.println("Ivyko klaida.");
        }

        double evenNumAverage = getEvenNumAverage(numArr);
        System.out.println("Skaiciu vidurkis: " + evenNumAverage);

        printArr("Skaiciu masyvas pries pakeitimus:", numArr);

        double[] evenNumMinArr = getEvenNumMin(numArr);
        printArr("Skaiciu masyvas po min rusiavymo:", evenNumMinArr);

        double[] evenNumMaxArr = getEvenNumMax(numArr);
        printArr("Skaiciu masyvas po max rusiavymo:", evenNumMaxArr);

        double evenNegativeNumMin = getEvenNegativeNumMin(numArr);
        System.out.println("Maziausias lyginis neigiamas skaicius: " + evenNegativeNumMin);
    }

    /**
     *
     * Spauzdina masyva su zinute, negrazina reiksmes
     *
     * @param message - tekstas
     * @param numArr - skaiciu masyvas
     */
    private static void printArr(String message, double[] numArr) {
        System.out.println(message);

        for (int i = 0; i < numArr.length ; i++) {
            System.out.print(numArr[i]);

            if (i != numArr.length - 1) {
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }

        System.out.println('\n');
    }

    /**
     *
     * Gauna lyginiu skaiciu vidurki
     *
     * @param numArr - skaiciu masyvas
     * @return lyginiu skaiciu vidurki
     */
    private static double getEvenNumAverage(double[] numArr) {
        double evenNumAverage, evenNumQuantity, evenNumAmount;

        evenNumQuantity = getEvenNumQuantity(numArr);
        evenNumAmount = getEvenNumAmount(numArr);

        evenNumAverage = evenNumAmount / evenNumQuantity;

        return evenNumAverage;
    }

    /**
     *
     * Gauna lyginiu skaiciu kieki
     *
     * @param numArr - skaiciu masyvas
     * @return lyginiu skaiciu kiekis
     */
    private static double getEvenNumQuantity(double[] numArr) {
        double evenNumQuantity = 0;

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0) {
                evenNumQuantity++;
            }
        }

        return evenNumQuantity;
    }

    /**
     *
     * Gauna lyginiu skaiciu suma
     *
     * @param numArr - skaiciu masyvas
     * @return lyginiu skaiciu suma
     */
    private static double getEvenNumAmount(double[] numArr) {
        double evenNumAmount = 0;

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0) {
                evenNumAmount += numArr[i];
            }
        }

        return evenNumAmount;
    }

    /**
     *
     * Surusiuoja masyva nuo maziausio iki didziausio skaicio
     *
     * @param numArr - skaiciu masyvas
     * @return min skaiciu masyvas
     */
    private static double[] getEvenNumMin(double[] numArr) {
        for (int i = 0; i < numArr.length - 1 ; i++) {
            for (int j = 0; j < numArr.length - i - 1; j++) {
                if (numArr[j] > numArr[j + 1]) {
                    double temp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = temp;
                }
            }
        }

        return numArr;
    }

    /**
     *
     * Surusiuoja masyva nuo didziausio iki maziausio skaicio
     *
     * @param numArr - skaiciu masyvas
     * @return max skaiciu masyvas
     */
    private static double[] getEvenNumMax(double[] numArr) {
        for (int i = 0; i < numArr.length - 1 ; i++) {
            for (int j = 0; j < numArr.length - i - 1; j++) {
                if (numArr[j] < numArr[j + 1]) {
                    double temp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = temp;
                }
            }
        }

        return numArr;
    }

    private static double getEvenNegativeNumMin(double[] numArr) {
        double evenNegativeMin = 0;

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0 && numArr[i] < 0) {
                if (numArr[i] < evenNegativeMin) {
                    evenNegativeMin = numArr[i];
                }
            }
        }

        return evenNegativeMin;
    }
}
