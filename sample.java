import java.util.Scanner;
import java.util.ArrayList;
class sample {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        /* 
            add     // add element in the last of arraylist
            size    // return size of arraylist at that instant
            remove  // remove element from last of arraylist
            get     // give the element at the given index
            set     // replace element at given index with the given value
        */

        // int i = arr.size(); 

        // System.out.println(i);

        // arr.add(11);

        // System.out.println(arr);

        // arr.add(15);

        // System.out.println(arr);

        // arr.add(16);

        // System.out.println(arr);

        // arr.add(20);

        // System.out.println(arr);

        // int j = arr.size(); 

        // System.out.println(j);

        // arr.remove(1);

        // System.out.println(arr);

        // arr.remove(0);
        // arr.remove(4);

        // System.out.println(arr);

        // 1  2  3  4  5  7  8  9  10 

        // for (int i = 0; i < arr.size(); i++) {

        // }

        // arr.get(3);

        int i = 0;
        while (i <= 10) {
            arr.add(i);
            i++;
        }
        // System.out.println(arr);

        // int j = 0;
        // while(j <= 3) {
        //     arr.remove(0);
        //     j++;
        // }
        // System.out.println(arr);

        System.out.println(arr.get(2));

        arr.set(1, 26);

        System.out.println(arr);

    }
}

/* 
1 2 3 4 4 5 5 5 5 6 7 7 8 

int  ==== Integer  // (int, int , int , int )
char ==== Character
boolean === Boolean
 */

// value = 1  3  5  1  6  7  7  90  80  3  1

// index = 0  1  2  3  4  5  6  7   8   9  10

// set(90, 7);
// add(80, 8);

// //============================================

// // 7  6  5  4  3  2  1

// 1   45
// 2   67
// 4   56
// 3   68
// 6   78 
