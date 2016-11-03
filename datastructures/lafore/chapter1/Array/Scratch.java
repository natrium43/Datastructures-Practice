package lafore.chapter1.Array;

/**
 * Created by dhanyapai on 10/28/16.
 */
public class Scratch {

    public static void main(String[] args) {

        int[] myArray = {0,1,2,4,5,13};
        System.out.println(binarySearch(myArray, 6, 13));
        System.out.println(binarySearch(myArray, 6, 7));

    }

    public static int binarySearch(int[] array, int numElems, int searchKey) {

        int lowerBound = 0;
        int upperBound = numElems - 1;
        int currentIndex = 0;

        while(true) {

            currentIndex = (lowerBound + upperBound)/2;
            if(array[currentIndex] == searchKey)
            {
                return currentIndex;
            }

            else if(lowerBound > upperBound) {
                return numElems;
            }

            else {
                if(array[currentIndex] > searchKey) {
                    upperBound = currentIndex-1;

                } else
                {
                    lowerBound = currentIndex+1;

                }
            }
        }
    }
}
