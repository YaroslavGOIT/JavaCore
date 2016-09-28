package Module_6;

import Module_2.HomeWork2_1Int;

public class ArrayUtils {

    public static int sum(int array[]){
        return HomeWork2_1Int.sum(array);
    }
    public static int min(int array[]){
        return HomeWork2_1Int.min(array);
    }
    public static int max(int array[]){
        return HomeWork2_1Int.max(array);
    }
    public static int maxPositive(int array[]){
        return HomeWork2_1Int.maxPositive(array);
    }
    public static long multiplication  (int array[]){
        return HomeWork2_1Int.multiplication(array);
    }
    public static int modulus(int array[]){
        return HomeWork2_1Int.modulus(array);
    }
    public static int secondLargest(int array[]){
        return HomeWork2_1Int.secondLargest(array);
    }
    public static int[] reverse(int[] array){
        int forReverse=array.length-1;
        int[] getReverseArray=new int[forReverse+1];
        for(short i=0;i<=forReverse;i++){
            getReverseArray[i]=array[forReverse-i];
        }
        return getReverseArray;
    }

    public static int[] findEvenElements(int[] array){
        int[] evenElements=new int[lengthOfEven(array)];
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                evenElements[count]=array[i];
                count++;
            }
        }
        return evenElements;
    }

    private static int lengthOfEven(int[] array){
        int count=0;
        int arL=array.length;
        for(int i=0;i<arL;i++){
            if(array[i]%2==0){
                count++;
            }
        }
        return count;
    }
}
