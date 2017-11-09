import java.util.Scanner;

public class Main {
    private double a;
    private double b;

    public double div() {
        return a / b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public static void main(String [] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        m.setA(scanner.nextDouble());
        m.setB(scanner.nextDouble());
        try {
            System.out.println(m.div());
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