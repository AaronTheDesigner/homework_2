import java.lang.Math;

class MagicCalculator extends Calculator {

    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public static double sin(double num) {
        double pi = Math.PI;
        double ans = Math.sin(pi/num);
        return ans;
    }

    public static double cos(double num) {
        return Math.cos(num);
    }

    public static double tan(double num) {
        return Math.tan(num);
    }

    public static int fac(int num) {
        int ans = 1;
        for (int i = 1; i <=num; i++) {
            ans = ans*i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int f = 5;
        System.out.print(fac(f));
    }
    
}
