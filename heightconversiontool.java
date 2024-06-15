import java.util.Scanner;
public class heightconversiontool {
  public static void main(String[] args) {
    Boolean a=true;
    while (a) {
           System.out.println("enter your choice");
           System.out.println("enter 1 for feet to inches and centimetter");
           System.out.println("enter 2 for inches to feet and centimetter");
           System.out.println("enter 3 for centimetter to feet and inches");
           System.out.println("enter 4 for exit->");
           Scanner sc=new Scanner(System.in);
           int choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("<--------------------->");        
                System.out.println("enter feet");
                double h=sc.nextDouble();
                System.out.println("centimetter="+h*30.48);
                System.out.println("Inches="+h*12);
                System.out.println("<--------------------->");
                break;
            case 2:
                 System.out.println("<--------------------->");
                 System.out.println("enter hight in inches");
                 double i=sc.nextDouble();
                 System.out.println("feet="+i/12);
                 System.out.println("centimetter="+i*2.54);
                 System.out.println("<--------------------->");
                break;
            case 3:
                System.out.println("<--------------------->");
                System.out.println("enter higth in centimetter");
                double c=sc.nextDouble();
                System.out.println("feet="+c/30.48);
                System.out.println("inches="+c*2.54);
                System.out.println("<--------------------->");
                break;
            case 4:
                System.out.println("<--------------------->");
                System.out.println("EXIT DONE");
                a=false;
                System.out.println("<--------------------->");
                break;
            default:
                System.out.println("**wrong input plese try again**");
                break;
        }
    }
  }
}
