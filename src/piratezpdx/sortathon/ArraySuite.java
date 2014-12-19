package piratezpdx.sortathon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by piratezpdx on 12/17/14.
 * 
 * Each type of ArrayBased object will be represented here.
 * A copy of the file will be read in to an array here and then imported into
 * all the objects in turn. After that their various sorting routines will be 
 * run and the answers compared within this object for consistency/ correctness.
 * 
 */

public class ArraySuite {
    // infrastructure
    protected Scanner scanIncoming;
    protected String results;
    protected int [] mainArray;

    // the sorting objects
    protected Selection selectionSort;
    protected Insertion insertionSort;
    protected Quick quickSort;
    //etc...


    ArraySuite(){
        // init infrastructure
        scanIncoming = null;
        mainArray = null;
        results = null;

        // init sorting objects
        selectionSort = new Selection();
        insertionSort = new Insertion();
        quickSort = new Quick();
        //etc...

    }



    // read the file in so we can make copies to the various sort objects
    public void copyFileData(String fileName) throws FileNotFoundException {
        int count = 0;
        int arraySize = 0;

        // get a count of data objects to size the array
        scanIncoming = new Scanner(new File(fileName));
        while (scanIncoming.hasNextInt()){
            arraySize++;
            scanIncoming.nextInt();
        }
        scanIncoming.close();

        // fill the array
        scanIncoming = new Scanner(new File(fileName));
        mainArray = new int[arraySize];
        while (scanIncoming.hasNextInt()){
            mainArray[count] = scanIncoming.nextInt();
            count++;
        }
        scanIncoming.close();
    }

    public void makeSortObjects(){
        selectionSort.copyArray(mainArray.length, mainArray);
        insertionSort.copyArray(mainArray.length, mainArray);
        quickSort.copyArray(mainArray.length, mainArray);
        //etc...
    }

    // probably get rid of the printed stuff eventually, but it's nice to get some
    // output while building the thing. Maybe next part is to make an array of ArrayBased
    // objects and iterate through that...

    public void sortThem(){
        System.out.println("Selection sort in: " + selectionSort.sort());
        //selectionSort.display();
        System.out.println("Insertion sort in: " + insertionSort.sort());
        //insertionSort.display();
        System.out.println("Quick sort in: " + quickSort.sort());
        //etc...
    }

    public boolean recordError(int error){
        boolean flag = false;
        if (error >= 0){
            flag = true;
            results = "Selection sort varies starting at element " + error;
        }
        return flag;
    }

    // have to think of a better way other wise code will balloon?
    // although these are similar to assert statements so.... meh?
    public void compareResults(){
        if (recordError(selectionSort.isTheSame(insertionSort))){
            results += " from insertion sort\n";
        }
        if (recordError(selectionSort.isTheSame(quickSort))){
            results += " from quick sort\n";
        }
    }


    // show any errors or give the all clear...
    public void display(){
        // check to see if the compareResults has put any results in the string
        // that's where any errors would have been recorded...
        if (results != null) {
            System.out.println(results);
        }
        else{
            System.out.println("All sorts match");
        }
    }


}
