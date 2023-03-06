package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumbersInAnArray {

    public void PrimeNumbers(int[] arr){
        System.out.println("The Prime Numbers in the given Array is:");
        for(int i=0;i<arr.length;i++){
            boolean isPrime= true;
            for(int j=2;j<arr[i];j++){
                if(arr[i]%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int num= in.nextInt();
        int[] array= new int[num];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<num;i++){
            array[i]= in.nextInt();
        }
        PrimeNumbersInAnArray obj= new PrimeNumbersInAnArray();
        obj.PrimeNumbers(array);
    }
}
