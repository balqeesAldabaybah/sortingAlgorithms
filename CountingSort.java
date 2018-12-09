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
public class CountingSort {
    static void countingSort(int arr[]){
        int min=99999999,max=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
            if(arr[i]>max)
                max=arr[i];
        }
        int countArr[] = new int[max+1];
        for(int i=0;i<arr.length;i++){
            countArr[arr[i]]++;
        }
        for(int i=1;i<countArr.length;i++){
            countArr[i]+=countArr[i-1];
        }
        
        int sortedArr [] = new int [arr.length];
        for(int i=0;i<arr.length;i++){
            sortedArr[countArr[arr[i]]-1]=arr[i];
            countArr[arr[i]]--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=sortedArr[i];
        }
    }
}
