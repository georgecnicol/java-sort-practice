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
    protected Scanner scanIncoming;
    protected int [] mainArray;
    protected Selection selectionSort;
    protected Insertion insertionSort;
    //etc...
    protected String results;

    ArraySuite(){
        scanIncoming = null;
        mainArray = null;
        selectionSort = new Selection();
        insertionSort = new Insertion();
        //etc...
        results = null;
    }



    // read the file in so we can make copies to the various sort objects
    public void copyFileData(String fileName) throws FileNotFoundException {
        int count = 0;
        int arraySize = 0;
        scanIncoming = new Scanner(new File(fileName));

        while (scanIncoming.hasNextInt()){
            arraySize++;
            scanIncoming.nextInt(); // just getting a count to size the array
        }
        scanIncoming.close();
        scanIncoming = new Scanner(new File(fileName));
        mainArray = new int[arraySize];
        while (scanIncoming.hasNextInt()){
            mainArray[count] = scanIncoming.nextInt();
            count++;
        }
    }

    public void makeSortObjects(){
        selectionSort.copyArray(mainArray.length, mainArray);
        insertionSort.copyArray(mainArray.length, mainArray);
        //etc...
    }

    // probably get rid of the printed stuff eventually, but it's nice to get some
    // output while building the thing. Maybe next part is to make an array of ArrayBased
    // objects and iterate through that...

    public void sortThem(){
        System.out.println("Selection sort in: " + selectionSort.sort());
        selectionSort.display();
        System.out.println("Insertion sort in: " + insertionSort.sort());
        insertionSort.display();
        //etc...
    }


    // have to think of a better way other wise code will balloon.
    public boolean compareResults(){
        int outcome = 0;
        boolean flag = false;
        outcome = selectionSort.isTheSame(insertionSort);
        if (outcome >= 0){
            flag = true;
            results = "Selection sort varies starting at element ";
            results += outcome + "\n";
        }
        return flag;
    }

    public void display(){
        if (results != null) {
            System.out.println(results);
        }
        else{
            System.out.println("All sorts match");
        }
    }


}
