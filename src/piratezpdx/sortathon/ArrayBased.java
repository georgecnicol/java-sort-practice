package piratezpdx.sortathon;


/**
 * Created by piratezpdx on 12/15/14.
 *
 * The base class for array data structure problems. Currently this is
 * written only to handle integers, not strings or other data types.
 *
 */

public class ArrayBased {
    protected int sortingArray [];         // basic array

    ArrayBased(){
        sortingArray = null;
    }

    // create the array based on contents of the file
    public void copyArray(int arraySize, int [] incArray){
        sortingArray = new int [arraySize];
        System.arraycopy(incArray, 0 ,sortingArray, 0, arraySize);
    }

    // put an item in the array
    public void set_element(int location, int incoming_value){
        sortingArray[location] = incoming_value;
    }

    // get a specific item from the array
    public int get_element(int location){
        return sortingArray[location];
    }

    // print the array contents to stdout
    public int display() {
        int loc = 0;
        while (loc < sortingArray.length) {
            if (loc == sortingArray.length - 1) {  // formatting
                System.out.println(sortingArray[loc]);
            } else {
                System.out.print(sortingArray[loc] + ", ");
            }
            loc++;
        }
        return sortingArray.length;
    }

    // returns the first array index where the two arrays are not the same
    // if the arrays are the same, returns a -1
    // ideally this should be the same calling object every time for consistently

    /* I chose not to use equals(array1, array2) because I wanted the particular location */
    public int isTheSame(ArrayBased object){
        int loc = -1;
        int i = 0;

        if (this.sortingArray.length != object.sortingArray.length) {
            return 0;
        }

        while (i < this.sortingArray.length && loc < 0) {
            if (this.sortingArray[i] != object.sortingArray[i]) {
                loc = i;
            }
            i++;
        }
        return loc;
    }
}
