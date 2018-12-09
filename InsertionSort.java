/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

/**
 *
 * @author Balqees
 */
public class InsertionSort {
    
    static void insertionSort(int arr[]){
       for(int i=1;i<arr.length;i++){
           sortUpTo(i,arr);
       }
    }
    
   private static void sortUpTo(int to,int arr[]){
       for(int i=0;i<to;i++){
           if(arr[to]<arr[i]){
               //place arr[to] in arr[i] and shift other elements
               for(int j=to ; j>i;j--)
                   SharedOperations.swap(arr, j, j-1);
           }
       }
   }
}
