package lesson1;

public class Main {
    public static void main(String[] args) {


        testVars();
        System.out.println(calculateExp(4, 2, 8,7));
        System.out.println(checkSum(10, 11));
        checkNumber(-7);
        System.out.println(isItNegitive(5));
        sayMyName("Piter");
        testTern(25);


    }

    static void testVars(){
        int valA = 10;
        int valB = 8;
        int result = valA * valB;
        System.out.println(result);

        double doubleA = 12.25;
        double doubleB = 5.85;
        double doubleResult = doubleA / doubleB;
        System.out.println(doubleResult);


    }

    static double calculateExp(int a, int b, int c, int d) {
        double result = a * (b + (1.0 * c / (double) d));
        if (d != 0) {
            System.out.println(result);
        }
        else {
            System.out.println("int d cannot be a zero");
        }
        return result;

    }


    public static boolean checkSum(int a, int b) {
        int sumResult = a + b;
        return (sumResult >= 10 && sumResult <= 20);

    }

    public static void checkNumber(int a) {
        if (a >= 0) {
            System.out.println("The number is positive");
        }
        else {
            System.out.println("The number is negative");
        }
    }

    public static boolean isItNegitive(int a) {
       return (a < 0);

    }

    static void sayMyName(String a) {
        String str = "Hello, ";
        System.out.println(str + a);
    }

    static void testTern(int digit) {
        String word = (digit < 0) ? "negative" : "positive";
        System.out.println("digit " + digit + " is " + word );
    }



   }
