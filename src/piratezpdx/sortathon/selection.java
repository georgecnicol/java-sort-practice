package piratezpdx.sortathon;

/***************************************************************
 * Created by piratezpdx on 12/11/14.
 *
 * Selection Sort
 *
 * data structure of choice:
 *  - array
 *
 * advantages:
 *  - sort in place
 *
 * big O
 *  - n squared
 *
 * pseudo code:
 * for i = 1 to n
 *  - select the ith element and store it in a temporary variable
 *  - for j = i+1 to n
 *    - if the temp variable is greater than the jth element
 *      + swap all the things as follows:
 *      + put the jth element in the ith slot
 *      + put the temp variable in the jth slot
 *      + put the ith element in the temp variable
 *
 *****************************************************************/
public class selection {
    protected int [] sorting_ground;

    public void read_selection(int number_of_elements){
        sorting_ground = new int[number_of_elements];

    }

    public String selection_sort(){
        int focus_element, current_element, comparison;

        for (focus_element = 0; focus_element < sorting_ground.length(); focus_element++){

        }
    }


}
