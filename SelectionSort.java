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
public class SelectionSort {
    
   
    static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min = findMin(arr, i);
            if(min != i)
                SharedOperations.swap(arr,min,i);
        }
    } 
    private static int findMin(int arr[], int from){
        int min= 999999999;
        int minIndex=-1;
        for(int i=from;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
