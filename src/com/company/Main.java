package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {1,1,3,4,5};
        int[] temp = new int[array.length];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int a = scanner.nextInt();
        int j = 0;
        for(int i = 0; i< array.length; i++){
            if(array[i]==a){
                System.out.println("There is :"+a+" in array at: "+i);
            }else{
                temp[j]=array[i];
                j++;
            }
        }
        int count = 0;
        for(int k = 0; k < temp.length; k++){
           if(temp[k]!=0){
               count++;
           }
        }
        array = new int[count];
        for (int l = 0; l < count; l++){
            array[l]=temp[l];
            System.out.println(array[l]);
        }
    }
}
