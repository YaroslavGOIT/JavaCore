/**
 * Created by admin-pc on 26.08.2016.
 */
public class HomeWork2_1Int {



    int[] array = {-10, 456, -228, 3478, 5600, -67, 890, 7566, 432, -1234};
    static int sum(int array[]){
        int SumAll = 0;

        for (int i = 0;i <= array.length;i++){

            int calculator = array[i];
            SumAll += calculator;
        }
        return SumAll;
    }

    static int min(int array[]){
        int minimum = 0;
        for (int i = 0;i < array.length;i++){

            if (array[i] > array[i+1]){

                int calculator = array[i+1];
                minimum = calculator;
            }

        }
        return minimum;
    }

    static int max(int array[]){
        int maximum = 0;
        for (int i = 0;i < array.length;i++){

            if (array[i] < array[i+1]){

                int calculator = array[i+1];
                maximum = calculator;
            }

        }
        return maximum;
    }

    static int MaxPositive(int array[]){

        int maxpositive = 0;

        for (int i = 0;i < array.length;i++){
            int calculator = 0;

            if (array[i] >= 0){
                if (array[i] < array[i+1]){

                    calculator = array[i+1];
                    maxpositive = calculator;
                }

            }

        }
        return maxpositive;
    }

    static int multiplication(int array[]){
        int NumberMultiplication = 1;

        for (int i = 0;i <= array.length;i++){

            int calculator = array[i] * array[i+1];
            NumberMultiplication += calculator;

        }
        return NumberMultiplication;
    }

    static int Modulus(int array[]){
        int NumberModulus = 0;

        for (int i = 0;i <= array.length;i++){

            int calculator = array[i] % array[i+1];
            NumberModulus += calculator;

        }
       return NumberModulus;
    }

    static int secondLargest(int array[]){
        int FirstLargest = 0;
        int SecondLargest = 0;
        for (int i = 0;i < array.length;i++){

            if (array[i] < array[i+1]) {

                int calculator1 = array[i + 1];
                FirstLargest = calculator1;
            }
            if (array[i] != FirstLargest){

                if (array[i] < array[i+1]){

                    int calculator2 = array[i+1];
                    SecondLargest = calculator2;
                }

            }
        }
        return SecondLargest;
    }
}

