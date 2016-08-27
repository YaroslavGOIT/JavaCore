/**
 * Created by admin-pc on 27.08.2016.
 */

import java.util.Scanner;

public class HomeWork2_2 {

    public static void main(String[] argc){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your balance ");

        int balance=sc.nextInt();

        System.out.println("How much would you like to withdraw? ");

        int withdraw=sc.nextInt();

        int comission= (int) (withdraw * 0.05);

        if ((balance - withdraw) >= comission){

            int rest = (balance - withdraw - comission);

            System.out.println(" OK " + comission + " " + rest);
        }else{

            System.out.println(" NO ");

        }

    }

}
