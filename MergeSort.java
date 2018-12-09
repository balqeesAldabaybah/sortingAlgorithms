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
public class MergeSort {
    static void mergeSort(int arr[]){
        sort(arr,0,arr.length-1);
    }
    private static void sort(int arr[],int l,int r){
        if(l<r){
            int middle = (l+r)/2;
            sort(arr,l,middle);
            sort(arr,middle+1,r);
            merge(arr,l,middle,r);
        }
        
    }
    private static void merge(int arr[], int l, int m, int r){
            int lftLngth = m-l+1;
            int rghtLngth = r-m;
            int L[] = new int[lftLngth];
            int R[] = new int [rghtLngth];
            
            for(int i=0;i<lftLngth;i++)
                L[i] = arr[i+l];
            for(int j=0;j<rghtLngth;j++)
                R[j] = arr[j+m+1];
            int i=0,j=0,t=l;
            while(i<lftLngth && j<rghtLngth){
                if(L[i]<=R[j]){
                    arr[t]=L[i];
                    i++;
                }
                else{
                    arr[t] = R[j];
                    j++;
                }
                t++;
            }
            
            while(i<lftLngth){
                arr[t]= L[i];
                i++;
                t++;
            }
            
            while(j<rghtLngth){
                arr[t]= R[j];
                j++;
                t++;
            }
    }
}
