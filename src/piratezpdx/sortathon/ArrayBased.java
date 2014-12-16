package piratezpdx.sortathon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by piratezpdx on 12/15/14.
 *
 * The base class for array data structure problems. Currently this is
 * written only to handle integers, not strings or other data types.
 *
 */

public class ArrayBased {
    protected int sortingArray [];         // basic array
    protected int arraySize;               // used to set the size of the array
    protected Scanner scanIncoming;

    ArrayBased(){
        sortingArray = null;
        scanIncoming = null;
        arraySize = 0;
    }

    // create the array based on contents of the file
    public void makeArray(String filename)throws FileNotFoundException{
        int count = 0;
        arraySize = 0;
        scanIncoming = new Scanner(new File(filename));
        while (scanIncoming.hasNextInt()){
            arraySize++;
        }
        scanIncoming.reset();
        sortingArray = new int[arraySize];
        while (scanIncoming.hasNextInt()){
            sortingArray[count] = scanIncoming.nextInt();
            count++;
        }
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
                System.out.print(sortingArray[loc]);
            } else {
                System.out.print(sortingArray[loc] + ", ");
            }
            loc++;
        }
        return sortingArray.length;
    }

}
