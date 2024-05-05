import java.util.*;
public class BanakManagementSystem {
    public static String username;
    public static int Accountnumber;
    public static Double amount=0.0;
    public static Double total=0.0;
    public static void getuserinformation() {//functio to get user account information
        System.out.println("---------------------");
        System.out.println("your details");
        System.out.println("user name="+username);
        System.out.println("account number="+Accountnumber);
        System.out.println("amount="+amount+"$");
        System.out.println("---------------------");
    }
    public static void insertDeposit() {// function to insert money
     System.out.println("enter how much money u want to deposit");
     double d;
     Scanner sc=new Scanner(System.in);
     d=sc.nextDouble();
     d=d+amount;
     total=d;
     System.out.println("money credited successfully");
     System.out.println("now your total balance is ="+total+"$");
    }
    public static void  withdrawmoney() { //function to  withdraw money
        if (total<0 || total>amount) {
            System.out.println("BALANCE ERROR!!");
            return;
        }
        System.out.println("your current balance is"+total);
        System.out.println("enter how much money u want to  withdraw");
        Scanner s=new Scanner(System.in);
        Double w=0.0;
        w=s.nextDouble();
        if (total<0 || total>amount || w>total) {
            System.out.println("BALANCE ERROR!!");
            return;
        }
        System.out.println("money debited successfully");
        total=total-w;
        amount=total;
        System.out.println("now your remaining balance is="+total+"$");
    }
public static void main(String[] args) {
    System.out.println("***welcome to BANK***");
    System.out.println("----warning=....please first create account if u don't created yet ...thank you----");
      while (true) {
        System.out.println("enter your choice how we can surve you");
        System.out.println("PRESS 1 TO CREATE A ACCOUNT");
        System.out.println("PRESS 2 TO GET PERSONAL INFORMATION");
        System.out.println("PRESS 3 TO DEPOSIT INTO YOUR ACCOUNT");
        System.out.println("PRESS 4TO  WITHDRAW FROM ACCOUNT");
        System.out.println("PRESS 5 TO EXIT");
        System.out.print("enter your choice");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("plese enter your good name");
                username=sc.next();
                System.out.println("enter your 10 digit mobile number as account_number");
                Accountnumber=sc.nextInt();
                System.out.println("enter your deposit amount $=");
                amount=sc.nextDouble();
                total=amount;
                break;
            case 2:
            if(username!=null){
                getuserinformation();
            }else{
                System.out.println("------WARNING! first create a account!-----");
            }
                break;
            case 3:
                if(username!=null){
                    insertDeposit();
                }else{
                    System.out.println("-----WARNING! first create a account!-----");
                }
                break;
            case 4:
            if(username!=null){
                 withdrawmoney();
            }else{
                System.out.println("-----WARNING! first create a account!-----");
            }
              break;
            case 5:
                System.out.println("****THANNK YOU HAVE A GREAT DAY****");
                System.exit(0);
                break;
            default:
               System.out.println("WRONG DATA ENTERED....!");
                break;
        }
   }
}   
}