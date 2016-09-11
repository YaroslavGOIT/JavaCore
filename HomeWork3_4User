package Module_3.HomeWork3_4;

/**
 * Created by admin-pc on 11.09.2016.
 */
public class User {
    String name ;
    int balance ;
    int monthsOfEmployment ;
    String companyName;
    int salary;
    String currency;

    void paySalary(){
        salary += balance;
    }

    void withdraw(int sum){
        int comision = 0;
        if (sum < 1000){
            comision = (int) (sum * 0.05);
            balance = balance - comision;
        } else {
            comision = (int) (sum * 0.1);
            balance = balance - comision;
        }
    }

    void companyNameLenfht(){
        String name = " Company ";
        companyName = name;
    }

    void monthIncreaser(int addMonth){
        monthsOfEmployment += addMonth;
    }
}
