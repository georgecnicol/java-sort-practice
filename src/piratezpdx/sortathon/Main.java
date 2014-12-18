package piratezpdx.sortathon ;

/***************************************************************
 * Created by piratezpdx on 12/11/14.
 *
 * This demo suite of algorithms expects fileIO to bring the data
 * in, and accordingly, each suite expects that the data is in an
 * appropriate format. By that I mean, n by n arrays are in n by n
 * format, lists are in one or more lines. Additionally, the first
 * number of the file is expected to be a size. In the case of a
 * list, we are talking about the number of elements, For an array
 * that is square a single dimension will suffice.
 *
 * Please read the documentation for the given algorithm to more
 * exactly understand what is required. This suite is meant as an
 * exercise is coding algorithms, not data processing and formatting.
 *
 ***************************************************************/


import java.io. *;
// import java.util.Scanner;

public class Main {

    static String MainName = "/home/piratezpdx/DATA/J3.txt";
    // static String fileOutName = "sortOut.result";

    private BufferedReader in;
    // private Scanner scanIncoming;

    // protected int nxn_matrix [][];          // square matrix
    // protected int axb_matrix [][];          // solving a system of linear equations

    // this will need to change to a switch statement, but for now the prototype is working
    public static void main(String[] args) throws IOException {
        int numberOfItems = 0;
        int numberOfPasses = 0;
        Main incomingData = new Main(MainName);
        ArraySuite data2Sort = new ArraySuite();
        data2Sort.copyFileData(incomingData.getMainName());
        data2Sort.makeSortObjects();
        data2Sort.sortThem();
        data2Sort.compareResults();
        data2Sort.display();
/*
        Selection dataToSort = new Selection();
        System.out.println(incomingData.getMainName()); // placeholder for indicating file run as I expand to more files
        dataToSort.makeArray(incomingData.getMainName());
        System.out.println("Unsorted:");
        dataToSort.display();
        numberOfPasses = dataToSort.sort();
        System.out.println("Sorted:");
        numberOfItems = dataToSort.display();
        System.out.println("There were " + numberOfItems + " elements sorted in "+ numberOfPasses+ " rounds.");
*/
        //all done
        incomingData.housekeeping();
    }


    // need more exceptions work here
    public Main(String fname) throws FileNotFoundException{
        in = new BufferedReader(new FileReader(fname));
    }

    public String getMainName(){
        return MainName;
    }

    public void housekeeping() throws IOException{
        in.close();
    }

}
