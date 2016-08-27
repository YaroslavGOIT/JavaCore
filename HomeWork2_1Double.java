/**
 * Created by admin-pc on 27.08.2016.
 */
public class HomeWork2_1Double {

    public static double[] array = {-10, 456, -228, 3478, 5600, -67, 890, 7566, 432, -1234};
    public static int main(String[] argc){

        static int sum(double[] array){
            int SumAll = 0;

            for (int i = 0;i <= array.length;i++){

                double findNumbersSum = array[i];
                SumAll += findNumbersSum;
            }
            return SumAll;
        }

        static double min(double[] array){
            double minimum = 0;
            for (int i = 0;i < array.length;i++){

                if (array[i] > array[i+1]){

                    double findMin = array[i+1];
                    minimum = findMin;
                }

            }
            return minimum;
        }

        static double max(double[] array){
            double maximum = 0;
            for (int i = 0;i < array.length;i++){

                if (array[i] < array[i+1]){

                    double findMax = array[i+1];
                    maximum = findMax;
                }

            }
            return maximum;
        }

        static double maxPositive(double[] array){

            double maxpositive = 0;

            for (int i = 0;i < array.length;i++){
                double findMaxPositiveInArray = 0;

                if (array[i] >= 0){
                    if (array[i] < array[i+1]){

                        findMaxPositiveInArray = array[i+1];
                        maxpositive = findMaxPositiveInArray;
                    }

                }

            }
            return maxpositive;
        }

        static double multiplication(double[] array){
            double NumberMultiplication = 1;

            for (int i = 0;i <= array.length;i++){

                double multiplicateNumbers = array[i] * array[i+1];
                NumberMultiplication += multiplicateNumbers;

            }
            return NumberMultiplication;
        }

        static double modulus(double[] array){
            double NumberModulus = 0;

            for (int i = 0;i <= array.length;i++){

                double findNumbersMudulus = array[i] % array[i+1];
                NumberModulus += findNumbersMudulus;

            }
            return NumberModulus;
        }

        static double secondLargest(double[] array){
            double FirstLargest = 0;
            double SecondLargest = 0;
            for (int i = 0;i < array.length;i++){

                if (array[i] < array[i+1]) {

                    double firstLargest = array[i + 1];
                    FirstLargest = firstLargest;
                }
                if (array[i] != FirstLargest){

                    if (array[i] < array[i+1]){

                        double findSecondLargest = array[i+1];
                        SecondLargest = findSecondLargest;
                    }

                }
            }
            return SecondLargest;
        }

    }

}
