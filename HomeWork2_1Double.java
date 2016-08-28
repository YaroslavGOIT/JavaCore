/**
 * Created by admin-pc on 27.08.2016.
 */
public class HomeWork2_1Double {

    public static int maximum = 0;
    public static double[] array = {-10, 456, -228, 3478, 5600, -67, 890, 7566, 432, -1234};
    int main(String[] argc){

        static int sum(double[] array){
            int SumAll = 0;

            for (int i = 0;i <= array.length;i++){

                SumAll += array[i];
            }

            System.out.println("Sum - " + SumAll);
            return SumAll;
        }

        static double min(double[] array){
            double minimum = 0;
            for (int i = 0;i < array.length;i++){

                if (array[i] > array[i+1]){

                    minimum = array[i];
                }

            }
        System.out.println("Min - " + minimum);
            return minimum;
        }

        static double max(double[] array, maximum){
            for (int i = 0;i < array.length;i++){

                if (array[i] < array[i+1]){

                    maximum = array[i];
                }

            }
            System.out.println("Max - " + maximum);
            return maximum;
        }

        static double maxPositive(double[] array){
            double maxpositive = 0;
            for (int i = 0;i < array.length;i++){
                double findMaxPositiveInArray = 0;

                if (array[i] >= 0){
                    if (array[i] < array[i+1]){

                        maxpositive = array[i];
                    }

                }

            }
            System.out.println("MaxPositive - " + maxpositive);
            return maxpositive;
        }

        static double multiplication(double[] array){
            double numberMultiplication = 1;

            for (int i = 0;i <= array.length;i++){

                numberMultiplication += array[i] * array[i+1];

            }
            System.out.println("Multiplication - " + numberMultiplication);
            return numberMultiplication;
        }

        static double modulus(double[] array){
            double numberModulus = 0;

            for (int i = 0;i <= array.length;i++){

                numberModulus += array[i] % array[i+1];

            }
            System.out.println("Modulus - " + numberModulus);
            return numberModulus;
        }

        static double secondLargest(double[] array, maximum){
            double SecondLargest = 0;
            for (int i = 0;i < array.length;i++){

                if (array[i] != maximum){

                    if (array[i] < array[i+1]){

                        SecondLargest = array[i+1];
                    }

                }
            }
            System.out.println("SecondLargest - " + SecondLargest);
            return SecondLargest;
        }

    }

}
