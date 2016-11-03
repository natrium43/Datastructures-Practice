package lafore.chapter1.Array;

/**
 * Created by dhanyapai on 10/26/16.
 */
public class BinarySearch {


    public static void main(String[] args) {
        int[] myArray = {10,20, 30, 40, 50 ,60,70,80,90,100};
        //System.out.println("Binary search returned with "+ binarySearch(myArray, 80, myArray.length));

        //System.out.println("Binary search returned with "+ binarySearch(myArray, 20, myArray.length));

        System.out.println("Binary search returned with "+ binarySearch(myArray, 110, myArray.length));

    }

    public static int binarySearch(int[] a, int searchKey, int numElems) {

        int lowerBound = 0;
        int upperBound = numElems-1;
        int currIndex = 0;
        int numComparisions = 0;

        while(true) {
            currIndex = (lowerBound + upperBound)/2;
                numComparisions++;
            if(a[currIndex] == searchKey) {
                System.out.println(numComparisions);
                return currIndex;
            }
            else if(lowerBound > upperBound) {
                System.out.println(numComparisions);
                return numElems;
            }
            else {
                    numComparisions++;
                if(a[currIndex] > searchKey) {

                    upperBound = currIndex-1;

                }
                else
                {
                    lowerBound = currIndex+1;

                }
            }
        }

    }
}
