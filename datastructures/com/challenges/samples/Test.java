package com.challenges.samples;

/**
 * Created by dhanyapai on 9/27/16.
 */
public class Test {

   public static void main(String args[]) {
        stairCase(5);
       char[] arra1= {'a','b','c','d','e'};
       char[] arra2= {'b','e','c','d','a'};
       System.out.println(X(arra1,arra2));
   }
    static void stairCase(int n) {
            int k = 0;
            while(k<=n) {
                int counter = 0;
                for (int i = 0; i < n - 1; i++) {
                    System.out.print(" ");
                    counter++;
                }

                for (int j = 0; j < n - (counter); j++) {
                    System.out.print("#");
                }

                System.out.println();
                k ++;
                n--;
            }
    }
    public static char[] Y(char[] s, int j) {
        char[] ret = new char[s.length - 1];
        int d = 0;
        for(int k = 0; k < s.length; k++) {
            if (k == j) {
                d = 1;
            } else
            {
                ret[k - d] = s[k];
            }
        }

        return  ret;
    }
    public static boolean X(char[] a, char[] b) {
        if(a.length != b.length) {
            return false;
        }
        while(true) {
            for(int x=0;x<b.length; x++) {
                if(a[0] == b[x]) {
                    return X(Y(a, 0), Y(b,x));
                }
            }
        }
//        for(int x=0;x<b.length; x++) {
//            if(a[0] == b[x]) {
//                return X(Y(a, 0), Y(b,x));
//            }
//        }
        //return b.length == 0;
    }
}
