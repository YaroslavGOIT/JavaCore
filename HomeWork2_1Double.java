/**
 * Created by admin-pc on 26.08.2016.
 */
public class HomeWork2_1Double {


    static double[] array = {-10, 456, -228, 3478, 5600, -67, 890, 7566, 432, -1234};
    static int sum(double[] array){
        int SumAll = 0;

        for (int i = 0;i <= array.length;i++){

            double calculator = array[i];
            SumAll += calculator;
        }
        return SumAll;
    }

    static double min(double[] array){
        double minimum = 0;
        for (int i = 0;i < array.length;i++){

            if (array[i] > array[i+1]){

                double calculator = array[i+1];
                minimum = calculator;
            }

        }
        return minimum;
    }

    static double max(double[] array){
        double maximum = 0;
        for (int i = 0;i < array.length;i++){

            if (array[i] < array[i+1]){

                double calculator = array[i+1];
                maximum = calculator;
            }

        }
        return maximum;
    }

    static double MaxPositive(double[] array){

        double maxpositive = 0;

        for (int i = 0;i < array.length;i++){
            double calculator = 0;

            if (array[i] >= 0){
                if (array[i] < array[i+1]){

                    calculator = array[i+1];
                    maxpositive = calculator;
                }

            }

        }
        return maxpositive;
    }

    static double multiplication(double[] array){
        double NumberMultiplication = 1;

        for (int i = 0;i <= array.length;i++){

            double calculator = array[i] * array[i+1];
            NumberMultiplication += calculator;

        }
        return NumberMultiplication;
    }

    static double Modulus(double[] array){
        double NumberModulus = 0;

        for (int i = 0;i <= array.length;i++){

            double calculator = array[i] % array[i+1];
            NumberModulus += calculator;

        }
        return NumberModulus;
    }

    static double secondLargest(double[] array){
        double FirstLargest = 0;
        double SecondLargest = 0;
        for (int i = 0;i < array.length;i++){

            if (array[i] < array[i+1]) {

                double calculator1 = array[i + 1];
                FirstLargest = calculator1;
            }
            if (array[i] != FirstLargest){

                if (array[i] < array[i+1]){

                    double calculator2 = array[i+1];
                    SecondLargest = calculator2;
                }

            }
        }
        return SecondLargest;
    }
}

    
    

