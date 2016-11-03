package lafore.chapter1.Array;

/**
 * Created by dhanyapai on 10/26/16.
 */
// lowArray.java
// demonstrates array class with low-level interface
// to run this program: C>java LowArrayApp
////////////////////////////////////////////////////////////////
public class LowArray
{
    private long[] a;
    //--------------------------------------------------------------
    public LowArray(int size)
    { a = new long[size]; }
    //--------------------------------------------------------------
    public void setElem(int index, long value)
    { a[index] = value; }
    //--------------------------------------------------------------
    public long getElem(int index)
    { return a[index]; }
//--------------------------------------------------------------
}
class LowArrayApp
{
    public static void main(String[] args)
    {
        LowArray arr;
        arr = new LowArray(100);
        int nElems = 0;
        int j;

        arr.setElem(0, 77);
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 00);
        arr.setElem(8, 66);
        arr.setElem(9, 33);
        nElems = 10;

        for(j=0; j<nElems; j++)      // display items
            System.out.print(arr.getElem(j) + " ");
        System.out.println("");

        int searchKey = 26;          // search for data item
        for(j=0; j<nElems; j++)            // for each element,
            if(arr.getElem(j) == searchKey) // found item?
                break;
        if(j == nElems)                    // no
            System.out.println("Can't find " + searchKey);
        else                               // yes
            System.out.println("Found " + searchKey);

        // delete value 55
        for(j=0; j<nElems; j++)            // look for it
            if(arr.getElem(j) == 55)
                break;
        for(int k=j; k<nElems; k++)        // higher ones down
            arr.setElem(k, arr.getElem(k+1) );
        nElems--;                          // decrement size

        for(j=0; j<nElems; j++)      // display items
            System.out.print( arr.getElem(j) + " ");
        System.out.println("");
    }  // end main()
}  // end class LowArrayApp
////////////////////////////////////////////////////////////////
