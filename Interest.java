import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Enter the Principal amount :");
        double p = scanner.nextDouble();
        System.out.print("Enter the Interest rate (in %) : ");
        double r = scanner.nextDouble();
        System.out.print("Enter the number of times interest is compounded per year : ");
        double n = scanner.nextDouble();
        System.out.print("Times in years :");
        double t = scanner.nextDouble();
        System.out.println();
        double q = n * t ;
        double w = (1 + r/n  );
        ////////////////////////////////////////////////////////////////////////////////

        double a =  p * Math.pow(w , q )  ;
        System.out.println("The whole amount = " + a);

        scanner.close() ;
    }
}
