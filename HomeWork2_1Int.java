/**
 * Created by admin-pc on 27.08.2016.
 */
public class HomeWork2_1Int {

    public static int[] array = {-10, 456, -228, 3478, 5600, -67, 890, 7566, 432, -1234};
    public static int main(String[] argc){

        static int sum(int array[]){
            int SumAll = 0;

            for (int i = 0;i < array.length;i++){

                int findNumbersSum = array[i];
                SumAll += findNumbersSum;
            }
            return SumAll;
        }

    static int min(int array[]){
        int minimum = 0;
        for (int i = 0;i < array.length;i++){

            if (array[i] > array[i+1]){

                int findMin = array[i+1];
                minimum = findMin;
            }

        }
        return minimum;
    }

    static int max(int array[]){
        int maximum = 0;
        for (int i = 0;i < array.length;i++){

            if (array[i] < array[i+1]){

                int findMax = array[i+1];
                maximum = findMax;
            }

        }
        return maximum;
    }

    static int maxPositive(int array[]){

        int maxpositive = 0;

        for (int i = 0;i < array.length;i++){
            int findMaxPositiveInArray = 0;

            if (array[i] >= 0){
                if (array[i] < array[i+1]){

                    findMaxPositiveInArray = array[i+1];
                    maxpositive = findMaxPositiveInArray;
                }

            }

        }
        return maxpositive;
    }

    static int multiplication(int array[]){
        int NumberMultiplication = 1;

        for (int i = 0;i < array.length;i++){

            int multiplicateNumbers = array[i] * array[i+1];
            NumberMultiplication += multiplicateNumbers;

        }
        return NumberMultiplication;
    }

    static int modulus(int array[]){
        int NumberModulus = 0;

        for (int i = 0;i < array.length;i++){

            int findNumberModulus = array[i] % array[i+1];
            NumberModulus += findNumberModulus;

        }
        return NumberModulus;
    }

    static int secondLargest(int array[]){
        int FirstLargest = 0;
        int SecondLargest = 0;
        for (int i = 0;i < array.length;i++){

            if (array[i] < array[i+1]) {

                int firstLargest = array[i + 1];
                FirstLargest = firstLargest;
            }
            if (array[i] != FirstLargest){

                if (array[i] < array[i+1]){

                    int secondLargest = array[i+1];
                    SecondLargest = secondLargest;
                }

            }
        }
        return SecondLargest;
    }
}

}
