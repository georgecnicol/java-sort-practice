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

public class selection extends array_based {

    public void selection_sort() throws ArrayIndexOutOfBoundsException{
        int focus_element = 0;
        int current_element = 0;
        int comparison_number = 0;
        int array_length = sorting_array.length;

        if (array_length < 1) {
            throw new ArrayIndexOutOfBoundsException();
        }

        while (focus_element < array_length){
            comparison_number = sorting_array[focus_element];
            current_element = focus_element +1;
            while (current_element < array_length){
                if(comparison_number > sorting_array[current_element]){
                    sorting_array[focus_element] = sorting_array[current_element];
                    sorting_array[current_element] = comparison_number;
                    comparison_number = sorting_array[focus_element];
                } // end if
                current_element++;
            } // end inner while
            focus_element++;
        } // end outer while
        return;
    } // end method
}
