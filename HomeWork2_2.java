/**
 * Created by admin-pc on 27.08.2016.
 */

import java.util.Scanner;

public class HomeWork2_2 {


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

        static double withdrawBalance(double balance, double withdrawal) {

            Scanner sc=new Scanner(System.in);

            System.out.println("Enter your name ");

            String name = String.valueOf(sc.nextInt());

            for (int i = 0;i < balances.length;i++){

                if (name == ownerNames[i]) {

                    balance = balances[i];
                }
            }


            System.out.println("How much would you like to withdraw? ");

            withdrawal=sc.nextInt();

            double comission= (withdrawal * 0.05);

            if ((balance - withdrawal) >= comission){

               double rest = (balance - withdrawal - comission);

                System.out.println(" OK " + comission + " " + rest);
            }else{

                System.out.println(" NO ");
            }
            return 0;
        }


}




