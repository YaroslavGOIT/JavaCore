/**
 * Created by admin-pc on 27.08.2016.
 */
public class HomeWork2_1Int {

    public static int maximum = 0;
    public static int minimum = 0;
    public static int maxPositive = 0;
    public static int multiplication = 1;
    public static int secondLargest = 0;
    public static int numberModulus = 0;
    public static int sumAll = 0;
    public static int[] array = {-10, 456, -228, 3478, 5600, -67, 890, 7566, 432, -1234};
        static int sum(int array[]){
            for (int i = 0;i < array.length;i++){


                sumAll += array[i];
            }
            System.out.println("Sum - " + sumAll);
            return sumAll;
        }

    static int min(int array[]){
        for (int i = 0;i < array.length;i++){

            if (array[i] < array[i+1]){


                minimum = array[i];
            }else{

                minimum = array[i+1];

            }

        }
        System.out.println("Min - " + minimum);
        return minimum;
    }

    static int max(int array[]){
        for (int i = 0;i < array.length;i++){

            if (array[i] > array[i+1]){

                maximum =array[i];
            }else{

                maximum = array[i+1];

            }

        }
        System.out.println("Max - " + maximum);
        return maximum;
    }

    static int maxPositive(int array[]){

        for (int i = 0;i < array.length;i++){

            if (array[i] >= 0){
                if (array[i] > array[i+1]){


                    maxPositive = array[i];
                }else{

                    maxPositive = array[i+1];

                }

            }

        }
        System.out.println("MaxPositive - " + maxPositive);
        return maxPositive;
    }

    static int multiplication(int array[]){
        int numberMultiplication = 1;

        for (int i = 0;i < array.length;i++){
            numberMultiplication += (array[i] * array[i+1]);

        }
        System.out.println("Multiplication - " + numberMultiplication);
        return numberMultiplication;
    }

    static int modulus(int array[]){

        for (int i = 0;i < array.length;i++){

            numberModulus += array[i] % array[i+1];

        }
        System.out.println("Modulus - " + numberModulus);
        return numberModulus;
    }

    static int secondLargest(int array[]){
        for (int i = 0;i < array.length;i++){


            if (array[i] != maximum){

                if (array[i] < array[i+1]){
                    secondLargest = array[i+1];
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


