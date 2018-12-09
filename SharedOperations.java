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
public class SharedOperations {
     static void swap(int arr[],int i,int j){
        int tmp = arr[j];
        arr[j]= arr[i];
        arr[i]= tmp;   
    }
    
}
