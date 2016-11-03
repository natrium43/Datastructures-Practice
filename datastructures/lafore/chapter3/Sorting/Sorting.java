package lafore.chapter3.Sorting;

/**
 * Created by dhanyapai on 10/28/16.
 */
public class Sorting {

    public static void main(String[] args) {


        int[] myArray = {10, 30, 40, 50 ,60,70,80,90,100, 20};
        int[] mySecondArray = {20,30,40,50,60,70,80,90,10};
        int[] myArray2 = {2, 10, 30, 1};
        int[] myArray3 = {3, 10, 30,100,23,12,42, 1};

        bubbleSort(myArray3,myArray3.length);
        shellSort(mySecondArray , mySecondArray.length);
        for(int i=0;i<mySecondArray.length;i++)
        System.out.println(mySecondArray[i]);

    }
    public static void bubbleSort(int[] myArray, int nElems)
    {
        int out, in;

        for(out=nElems-1; out>0; out--)   // outer loop (backward)
            for(in=0; in<out; in++)        // inner loop (forward)
                if( myArray[in] > myArray[in+1] )       // out of order?
                    swap(in, in+1, myArray);          // swap them
    }  // end bubbleSort()

    private static void swap(int one, int two, int[] myArray)
    {
        int temp = myArray[one];
        myArray[one] = myArray[two];
        myArray[two] = temp;
    }

    /**
     * 1. Calculate the h value
     * 2. Traverse  by reducing h to (h-1)/3 in each step, as long as the gap is greater than 0
     *      2.1> Increase outer variable from h to numOfElemns, in steps of 1
     *          2.1.1>save temp variable, save pointer to outer in inner
     *          2.1.2> check weather the array at inner-h position is greater than temp and inner > h-1
     *
     */

    public static void shellSort(int[] myArray, int nElems)
    {
        int inner, outer;
        int temp;

        int h = 1;                     // find initial value of h
        while(h <= nElems/3)
            h = h*3 + 1;                // (1, 4, 13, 40, 121, ...)

        while(h>0)                     // decreasing h, until h=1
        {
            // h-sort the file
            for(outer=h; outer<nElems; outer++)
            {
                temp = myArray[outer];
                inner = outer;
                // one subpass (eg 0, 4, 8)
                while(inner > h-1 && myArray[inner-h] >=  temp)
                {
                    myArray[inner] = myArray[inner-h];
                    inner -= h;
                }
                myArray[inner] = temp;
            }  // end for
            h = (h-1) / 3;              // decrease h
        }  // end while(h>0)
    }  // end shellSort()
//--------------------------------------------------------------

}
