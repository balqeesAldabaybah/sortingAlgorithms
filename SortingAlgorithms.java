/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Balqees
 */
public class SortingAlgorithms {
         static int arr[];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Enter the equivalent number for the sorting algorithm you want to apply : ");
        System.out.println("1 : Bubble Sort");
        System.out.println("2 : Selection Sort");
        System.out.println("3 : Insertion Sort");
        System.out.println("4 : Shell Sort");
        System.out.println("5 : Merge Sort");
        System.out.println("6 : Quick Sort");
        System.out.println("7 : Counting Sort");
        System.out.println("8 : Radix Sort");
        int s = reader.nextInt();
        System.out.println("Enter how many numbers you want to sort");
        int arrlngth = reader.nextInt();
        System.out.println("Enter a numbers range to generate random numbers ");
        System.out.print("from: ");
        int from = reader.nextInt();
        System.out.print("to: ");
        int to = reader.nextInt();
        buildArray(arrlngth,from,to);
        System.out.println(" The array that will be sorted is as follows:");
        printArray();
        reader.close();
        
        switch (s){
            case 1:
                BubbleSort.bubbleSort(arr);
                System.out.println(" The array sorted using Bubble sort:");
                printArray();
                break;
            case 2:
                SelectionSort.selectionSort(arr);
                System.out.println(" The array sorted using Selection sort:");
                printArray();
                break;
            case 3:
                InsertionSort.insertionSort(arr);
                System.out.println(" The array sorted using Insertion sort:");
                printArray();
                break;
            case 4:
                ShellSort.shellsort(arr);
                System.out.println(" The array sorted using Shell sort:");
                printArray();
                break;
            case 5:
                MergeSort.mergeSort(arr);
                System.out.println(" The array sorted using Merge sort:");
                printArray();
                break;
            case 6:
                QuickSort.quickSort(arr);
                System.out.println(" The array sorted using Quick sort:");
                printArray();
                break;
            case 7:
                CountingSort.countingSort(arr);
                System.out.println(" The array sorted using Counting sort:");
                printArray();
                break;
            case 8:
                RadixSort.radixSort(arr);
                System.out.println(" The array sorted using Radix  sort:");
                printArray();
                break;
            default: System.out.println("no such sorting algorithm");
        }
    }
    
    
    static void buildArray(int lngth, int from, int to){
        arr = new int[lngth];
        for(int i=0;i<arr.length;i++)
            arr[i] = new Random().nextInt((to-from)+1)+from;        
    }
    
    static void printArray()
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+ "  ");
        System.out.println();
    }
}
