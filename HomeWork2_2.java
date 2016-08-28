/**
 * Created by admin-pc on 27.08.2016.
 */

import java.util.Scanner;

public class HomeWork2_2 {


         static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

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

        static double withdrawBalance(double balance, double withdrawal) {

            Scanner sc=new Scanner(System.in);

            System.out.println("Enter your balance ");

            double getBalance=sc.nextInt();

            System.out.println("How much would you like to withdraw? ");

            int withdraw=sc.nextInt();

            int comission= (int) (withdraw * 0.05);

            if ((balance - withdraw) >= comission){

               double rest = (balance - withdraw - comission);

                System.out.println(" OK " + comission + " " + rest);
            }else{

                System.out.println(" NO ");

            }
            return 0;
        }


}




