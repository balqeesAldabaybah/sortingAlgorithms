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
public class ShellSort {
    static void shellsort(int arr[]){
        int gap = (int) Math.floor(arr.length/2);
        while(gap>=1){
            for(int i=0;i<arr.length;i++){
                int nxt = (i+gap>arr.length-1)?-1:i+gap;
                if(nxt==-1)break;
                if(arr[nxt]<arr[i]){
                    SharedOperations.swap(arr, nxt, i);
                    if(i-gap<0)continue;
                    for(int j=i;j>0;j-=gap){
                        if(arr[j]<arr[j-gap] && j>=0)
                            SharedOperations.swap(arr, j, j-gap);
                        else
                            break;
                    }
                }
            }
            gap = (int)(Math.floor(gap/2));
            //if(gap==1)
               // InsertionSort.insertionSort(arr);
        }
    }
}
