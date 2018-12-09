/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author Balqees
 */
public class RadixSort {
    static private Queue<Integer> buckets [] = new Queue[10];
    static private int tmpArr[];
    
    static void radixSort(int arr[]){
        tmpArr = new int[arr.length];
        for(int i=0;i<arr.length;i++)
            tmpArr[i] = arr[i];
        int max = findMax(arr);
        int digits = numOfDigits(max);
        intializeBuckets();
        
        for(int i=1;i<=digits;i++){
            intializeBuckets();
            fillBucketsAtDigit(i);
            System.out.println();
            pickUpNumsFromBuckets();
        }
        
        for(int i=0;i<arr.length;i++)
            arr[i] = tmpArr[i];
    }
    
    static private  int numOfDigits(int v){
        int d=0;
        while(v!=0){
            
            v/=10;
            d++;
        }
        return d;
    }
    static private int findMax(int arr[]){
        int max =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static private void fillBucketsAtDigit(int d ){
        for(int i=0;i<tmpArr.length;i++){
            int tmp = getTheNthDigit(tmpArr[i], d);
            buckets[tmp].add(tmpArr[i]);
        }
    }
    static private void intializeBuckets(){
        for(int i=0;i<buckets.length;i++){
            buckets[i]= new LinkedList<>();
        }
    }
    static private void pickUpNumsFromBuckets(){
        int j=0;
        for(int i=0;i<buckets.length;i++){
            while(buckets[i].size()!=0){
                tmpArr[j] = buckets[i].remove();
                j++;
            }
        }
    }
    static private int getTheNthDigit(int value, int d){
        int v=-1;
        for(int i=1;i<=d;i++){
            v=value%10;
            value/=10;
        }
        return v;
    }
}   
