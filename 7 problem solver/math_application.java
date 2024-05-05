import java.util.*;
import java.math.*;
public class math_application {
public static void checkarm(int n){//function that check number is arm strong or not
    int ch=0,a=0;
    int temp=n;
    while (n!=0) {
      a=n%10;
      ch=(a*a*a)+ch;
      n=n/10;
    }
    if (temp==ch) {
        System.out.println(temp+" is arm strong");
    }else{
        System.out.println(temp+" is not arm strong");
    }
}
public static void checkpal(int n) { //function for palindrom
    int rem=0;
    int rev=0;
    int temp=n;
    while (n>0) {
        rem=n%10;
        rev=(rev*10)+rem;
        n=n/10;
    }
    if(rev==temp){
        System.out.println(temp+" is a palindrom number");
    }else{
        System.out.println(temp+" is not a palindrom number");
    }
}
public static void calfib(int j){ //function to calculate fibonaachi series
    int a=0;
    int b=0;
    int c=1;
    System.out.print(a);
    for (int i = 1; i <=j; i++) {
        a=b+c;
        b=c;
        c=a;
        System.out.print("+"+c);
    }
    System.out.println();
}
  public static int calgcd(int a , int b){ //function to calculate GCD
    int temp=1;
    for (int i = 1; i<=a && i<=b; i++) {
       if(a%i==0 && b%i==0){
          if(temp<i){
          temp=i;
          }
       }
    }
    return temp;
  }
  public static void calfact(int n){ //function to calculate factorial
    int sum=1;
    while (n>0) {
     sum=sum*n;
     n--;
    }
    System.out.println("factorial of is="+sum);
  }
 public static void add(int a,int b){ //basic calculater
      System.out.println("enter symbole u want to perform");
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
        switch (s) {
            case "+":
                System.out.println(a+b);
                break; 
            case "-":
            System.out.println(a-b);
                break;
            case "/":
            System.out.println(a/b);
                break;
            case "*":
            System.out.println(a*b);
                break;
            case "%":
            System.out.println(a%b);
                break;
            default:
            System.out.println("invalid input");
                break;
        }
    }
    public static void callsm(int n1,int n2) { //function for lsm calculate
        int lcm;
        lcm=(n1>n2)?n1:n2;
        while (true) {
            if(lcm %n1==0 && lcm%n2==0){
                System.out.println("the LCM of"+n1+"and"+n2+"="+lcm);
                break;
            }
            ++lcm;
        }
    }
   public static void main(String[] args) {
     Scanner obj=new Scanner(System.in);
     int choice=0;
     while(true){
        System.out.println("------------enter your choice that u want to perform------------");
     System.out.println("enter 1 if you want to reach calculater for two numbers");
     System.out.println("enter 2 if you want to calculate factorial of a number");
     System.out.println("enter 3 if you want to calulate GCD of given number");
     System.out.println("enter 4 if you want to get fibonacchi series of given n'th term");
     System.out.println("enter 5 if you want to check number is palindrom or not");
     System.out.println("enter 6 if given number is ARM STRONG OR NOT ");
     System.out.println("enter 7 to calculate lcm of given number");
     System.out.println("enter 8 if want to exit");
     choice=obj.nextInt();
     switch (choice) {
        case 1:
             System.out.println("enter two number for calcuation");
             int x=obj.nextInt();
             int y=obj.nextInt();
             add(x, y);
            break;
        case 2:
            System.out.println("enter number for factorial");
            int fact=obj.nextInt();
            calfact(fact);
             break;
        case 3:
            System.out.println("enter 2 number for GCD");
            int g=obj.nextInt();
            int d=obj.nextInt();
            System.out.println(calgcd(g, d));
            break;
        case 4:
        System.out.println("enter that n'th number for fibonacchi series");
        int n=obj.nextInt();
        calfib(n);
        break;
        case 5:
        System.out.println("enter a number");
         int p=obj.nextInt();
         checkpal(p);
        break;
        case 6:
         System.out.println("enter a three digit number");
         int w=obj.nextInt();
         checkarm(w);
        break;
        case 7:
        System.out.println("enter 2 numbers");
        int l=obj.nextInt();
        int m=obj.nextInt();
        callsm(l, m);
        break;
        case 8:
        System.out.println("-----exit successfuly-----");
        System.exit(0);
        break;
        default:
           System.out.println("!!invalid input");
            break;
     }
    }
   }   
}
