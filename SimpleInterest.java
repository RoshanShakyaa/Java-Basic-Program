import java.util.Scanner;

class CalutateInterest{
    double P;
    double R;
    double T;

    public CalutateInterest(double principle, double rate, double time){
        this.P = principle;
        this.T = time;
        this.R = rate;
    }

    public double calculateSI(){
        return (P*T*R)/100;
    }

}

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principle: ");
        double P = sc.nextDouble();
        System.out.println("Enter rate: ");
        double R = sc.nextDouble();
        System.out.println("Enter time: ");
        double T = sc.nextDouble();

        CalutateInterest calc = new CalutateInterest(P, R, T);
        double SI  =  calc.calculateSI();

        System.out.println("Simple Interest: "+ SI);
        sc.close();
    }   
}
