/**
 * Created by admin-pc on 27.08.2016.
 */
public class HomeWork2_1Double {

    public static double maximum = 0;
    public static double minimum = 0;
    public static double maxPositive = 0;
    public static double multiplication = 1;
    public static double secondLargest = 0;
    public static double numberModulus = 0;
    public static double sumAll = 0;
    public static double[] array = {-10, 456, -228, 3478, 5600, -67, 890, 7566, 432, -1234};

        static double sum ( double[] array){

            for (int i = 0; i <= array.length; i++) {

                sumAll += array[i];
            }
            return sumAll;
        }

    static double min(double[] array) {
        for (int i = 0; i < array.length; i++) {

            if (array[i] < array[i + 1]) {

                minimum += array[i];
            } else {
                minimum += array[i+1];
            }

        }
        return minimum;
    }

    static double max(double[] array) {
        for (int i = 0; i < array.length; i++) {

            if (array[i] > array[i + 1]) {

                maximum += array[i];
            } else {
                maximum += array[i+1];
            }

        }
        return maximum;
    }

    static double maxPositive(double[] array) {

        for (int i = 0; i < array.length; i++) {
            double findMaxPositiveInArray = 0;

            if (array[i] >= 0) {
                if (array[i] > array[i + 1]) {

                    maxPositive += array[i];
                } else {
                    maxPositive += array[i+1];
                }

            }

        }
        return maxPositive;
    }

    static double multiplication(double[] array) {

        for (int i = 0; i <= array.length; i++) {

            multiplication += array[i] * array[i + 1];

        }
        return multiplication;
    }

    static double modulus(double[] array) {

        for (int i = 0; i <= array.length; i++) {

            numberModulus += array[i] % array[i + 1];

        }
        return numberModulus;
    }

    static double secondLargest(double[] array) {
        for (int i = 0; i < array.length; i++) {

            if (array[i] != maximum) {

                if (array[i] < array[i + 1]) {
                    secondLargest = array[i];
                }else{
                    secondLargest = array[i];
                }

            }
        }
        return secondLargest;
    }

    static void main(String[] argc) {

        System.out.println("SecondLargest - " + secondLargest);
        System.out.println("Modulus - " + numberModulus);
        System.out.println("Multiplication - " + multiplication);
        System.out.println("MaxPositive - " + maxPositive);
        System.out.println("Max - " + maximum);
        System.out.println("Min - " + minimum);
        System.out.println("Sum - " + sumAll);
    }

}

