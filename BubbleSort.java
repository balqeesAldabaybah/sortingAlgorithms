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
public  class BubbleSort {
    
    static void swap(int arr[],int i,int j){
        int tmp = arr[j];
        arr[j]= arr[i];
        arr[i]= tmp;   
    }
    static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    swap(arr,j,j+1);
                }
            }
    }
    
}
