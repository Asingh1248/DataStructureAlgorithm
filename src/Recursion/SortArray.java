package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArray {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(0);
        list.add(2);

        System.out.println("Before sorting :"+list);
        sortingArray(list);
        System.out.println("After sorting :"+list);


    }

    private static void sortingArray(List<Integer> list) {

        if(list.size()==1)  //Base condition : only one element do nothing
            return;
        int temp = list.get(list.size() - 1); //Storing last element
        list.remove(list.size() - 1); //Removing it from array

        sortingArray(list); // sort(n-1)
        insert(list,temp); //Recursion to solve inserted element problem
        return;

    }

    private static void insert(List<Integer> list, int temp) {
        if(list.size()==0  || list.get(list.size()-1) <= temp){
            list.add(temp);  // temp > then insert at last
            return;
        }
        int val = list.get(list.size()-1) ; //Store the last element at end
        list.remove(list.size()-1); //Remove it
        insert(list,temp);  // calling recursion on temp no to make a place

        list.add(val); //ading at last
        return;



    }



}
