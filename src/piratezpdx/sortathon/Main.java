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

    static String MainName = "/home/piratezpdx/DATA/javasort";
    // static String fileOutName = "sortOut.result";

    // 1 --> # is the extension on the filename shown above
    // eg: javasort2
    static int numberOfTestFiles = 3;

    private BufferedReader in;
    // private Scanner scanIncoming;

    // protected int nxn_matrix [][];          // square matrix
    // protected int axb_matrix [][];          // solving a system of linear equations

    // this will need to change to a switch statement, but for now the prototype is working
    public static void main(String[] args) throws IOException {
        int numberOfItems = 0;
        int numberOfPasses = 0;
        Main incomingData = new Main();
        ArraySuite data2Sort = new ArraySuite();

        // right now there are only three test files (numbered 1, 2, 3) and so we can just
        // run them in a loop. Ideally, the next step is to cycle through some
        for (int fileNum = 1; fileNum <= numberOfTestFiles; fileNum++){

            // set up the filename
            String fileName = incomingData.getMainName();
            fileName += fileNum;
            incomingData.makeIn(fileName);

            // run the ArraySuite sorts on the filename
            data2Sort.copyFileData(fileName);
            data2Sort.makeSortObjects();
            data2Sort.sortThem();
            data2Sort.compareResults();
            data2Sort.display();
            incomingData.housekeeping();
        }
    }


    Main()
    {
        in = null;
    }

    // need more exceptions work here
    public void makeIn(String fname) throws FileNotFoundException{
        in = new BufferedReader(new FileReader(fname));
    }

    public String getMainName(){
        return MainName;
    }

    public void housekeeping() throws IOException{
        in.close();
    }

}
