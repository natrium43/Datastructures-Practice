package lafore.chapter1.Array;

/**
 * Created by dhanyapai on 10/26/16.
 */

public class Array
{
    public static void main(String[] args)
    {
        long[] arr;                  // reference to array
        arr = new long[100];         // make array
        int nElems = 0;
        int j;
        long searchKey;
//--------------------------------------------------------------
        arr[0] = 77;                 // insert 10 items
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        nElems = 10;
//--------------------------------------------------------------
        for(j=0; j<nElems; j++)      // display items
            System.out.print(arr[j] + " ");
        System.out.println("");
//--------------------------------------------------------------
        searchKey = 66;
        for(j=0; j<nElems; j++)
            if(arr[j] == searchKey)
                break;
        if(j == nElems)
            System.out.println("Can't find " + searchKey);
        else
            System.out.println("Found " + searchKey);
//--------------------------------------------------------------
        searchKey = 55;
        for(j=0; j<nElems; j++)
            if(arr[j] == searchKey)
                break;
        for(int k=j; k<nElems; k++)
            arr[k] = arr[k+1];
        nElems--;
//--------------------------------------------------------------
        for(j=0; j<nElems; j++)
            System.out.print( arr[j] + " ");
        System.out.println("");
    }  // end main()
}  // end class ArrayApp


/*****
 * int[] intArray = new int[100]; //intArray is the reference to the array, and not the array itself.
 * int   intArray[] = new int[100];
 *  int arraylength = intArray.length; // this is a property.
 *  int[] intArray = { 0, 3, 6, 9, 12, 15, 18, 21, 24, 27 };
 *
 ***/
