package piratezpdx.sortathon;

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

public class FileIn {

    static String fileInName = "/home/piratezpdx/DATA/javaSort.txt";
    // static String fileOutName = "sortOut.result";
    // protected int size;

    private BufferedReader in;
    // private Scanner scanIncoming;

    // protected int nxn_matrix [][];          // square matrix
    // protected int axb_matrix [][];          // solving a system of linear equations


    public static void main(String[] args) throws IOException {
	// write your code here
        // System.out.print("Enter File Name: ");
        // System.in.read();
        int numberOfItems = 0;

        FileIn incomingData = new FileIn(fileInName);
        Selection dataToSort = new Selection();
        dataToSort.makeArray(incomingData.getFileInName());
        dataToSort.selection_sort();
        numberOfItems = dataToSort.display();
        System.out.print("There were " + numberOfItems + " sorted.");

        //all done
        incomingData.housekeeping();
    }


    // need more exceptions work here
    public FileIn(String fname) throws FileNotFoundException{
        in = new BufferedReader(new FileReader(fname));
    }

    public String getFileInName(){
        return fileInName;
    }

    public void housekeeping() throws IOException{
        in.close();
    }

}
