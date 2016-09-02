package Module_2;

import java.util.Scanner;

/**
 * Created by admin-pc on 01.09.2016.
 */
public class HomeWork2_4 {
    public static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    public static int[] balances = {1200, 250, 2000, 500, 3200};
    static int balancesSum(int[] balances) {
        int sum = 0;
        for (int balance : balances) {
            if (balance > 1000 && balance < 5000) {
                sum += balance;
            }
        }
        return sum;
    }

    static String[] getOwnerNames(int[] balances, String[] names) {
        int ownersCount = 0;
        for (int balance : balances) {
            if (balance > 1000) ownersCount++;
        }

        String[] result = new String[ownersCount];

        int index = 0;
        for (int i = 0; i < balances.length; i++) {
            if (balances[i] > 1000) {
                result[index] = names[i];
                index++;
            }
        }

        return result;
    }

    static double fundBalance(String ownerName, double fund) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name ");
        double balance = 0;
        for (int i = 0;i < balances.length;i++){

            if (ownerName == ownerNames[i]) {

                balance = balances[i];
            }
        }

        System.out.println("Hi, " + ownerName + " how much you want to top up your account? ");
        fund =sc.nextInt();
        double rest = (balance + fund);

            System.out.println(ownerName + rest);


        return 0;
    }
}
