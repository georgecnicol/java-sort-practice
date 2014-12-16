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

public class file_in {

    protected String in_file;
    protected int nxn_matrix [][];          // square matrix
    protected int axb_matrix [][];          // solving a system of linear equations

    private BufferedReader in;

    public static void main(String[] args) throws IOException {
	// write your code here
        System.out.print("Enter File Name: ");
        System.in.read();
    }


    // need more exceptions work here
    public file_in(String fname) throws FileNotFoundException{
        in = new BufferedReader(new FileReader(fname));
    }

    // get a line from the input file
    // needs more exception coverage
    public String getline()throws IOException{
        String s;
        s = in.readLine();
        return s;
    }

    public void housekeeping() throws IOException{
        in.close();
    }
}
