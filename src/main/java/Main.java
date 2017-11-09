import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static  double div(double a , double b) throws  ArithmeticException,
        InputMismatchException {
        double c;
        if (b==0){
            throw new ArithmeticException();
        }
        c = a / b;
        return c;
    }


    public static void main(String [] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a, b");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        try {
            System.out.println(m.div(a, b));
        } catch (ArithmeticException ae){
            ae.printStackTrace();
        }
        catch (RuntimeException re) {
            re.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}