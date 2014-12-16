package piratezpdx.sortathon;

/**
 * Created by piratezpdx on 12/15/14.
 */
public class array_based {
    protected int sorting_array [];         //  basic array

    // fill the array an item at a time from the input file
    public void set_element(int location, int incoming_value){
        sorting_array[location] = incoming_value;
        return;
    }

    public int get_element(int location){
        return sorting_array[location];
    }

    public int display() {
        int loc = 0;
        while (loc < sorting_array.length) {
            if (loc == sorting_array.length - 1) {  // formatting
                System.out.print(sorting_array[loc]);
            } else {
                System.out.print(sorting_array[loc] + ", ");
            }
            loc++;
        }
        return sorting_array.length;
    }

}
