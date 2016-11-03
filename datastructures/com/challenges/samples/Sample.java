package com.challenges.samples;


import java.math.BigInteger;

/**
 * Created by dhanyapai on 10/9/16.
 */
public class Sample {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        String myString = scanner.next();
//        int myInt = scanner.nextInt();
//        int x=scanner.nextInt();
//
//        double y = scanner.nextDouble();
//        scanner.nextLine();
//        String s = scanner.nextLine();
//        System.out.println("myString is: " + myString);
//        System.out.println("myInt is: " + myInt);



        System.out.println("Number of zeros are:"+zeros(1000));

       // scanner.close();

    }

    /*
 * Complete the function below.
 */
    static BigInteger factorial(BigInteger n) {
        BigInteger factorial = BigInteger.valueOf(1);
        System.out.println("Called factorial  with"+ n);
        for (int i = 1; i <= n.intValue(); i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
    static int zeros(int n) {
        System.out.println("Called Zeors with"+ n);
        BigInteger fact = factorial(BigInteger.valueOf(n));
        System.out.println("Fact is"+fact);
        BigInteger factorialVal = fact;
        if (factorialVal.equals(BigInteger.ZERO)) {
            return 0;
        }
        System.out.println("Called Else with"+ factorialVal);
        int counter = 0;
        System.out.println(factorialVal.divideAndRemainder(BigInteger.TEN));
        while (factorialVal.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            counter++;
            System.out.println("Counter at"+ counter);
            factorialVal = factorialVal.divide(factorialVal.TEN);

        }
        return counter;
    }


}
