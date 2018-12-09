/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import java.util.Random;

/**
 *
 * @author Balqees
 */
public class QuickSort {
    static void quickSort(int arr[]){
        sort(arr,0,arr.length-1);
        
    }
    
    static int partition(int arr[], int l, int r){
        int p = l-1;
        int pivotIndex = new Random().nextInt((r-l)+1)+l;
        SharedOperations.swap(arr, pivotIndex, r);
         pivotIndex = r;
        int pivot = arr[pivotIndex]; 
        
        for(int i=l;i<=r-1;i++){
            if(arr[i]<=pivot){
                p++;
                SharedOperations.swap(arr, i, p);
            }
        }
        SharedOperations.swap(arr, p+1, pivotIndex);
        
        return p+1;
    }
    static void sort(int arr[], int l,int r){
        if(l<r){
            int m = partition(arr,l,r);
            sort(arr,l,m-1);
            sort(arr,m+1,r);
        }
    }
}
