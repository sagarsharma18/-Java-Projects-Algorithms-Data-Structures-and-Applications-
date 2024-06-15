import java.util.*;
public class percentagecalculater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total of Marks You Get");
        Double marks=sc.nextDouble();
        System.out.println("Enter Out Of Number");
        Double total=sc.nextDouble();
        Double per=(marks/total)*100;
        System.out.printf("Your Percentage is%.2f",per);
    }
}
