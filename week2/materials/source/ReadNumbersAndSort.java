package com.hackbulgaria.programming51.week2;

import java.util.Arrays;
import java.util.Scanner;


public class ReadNumbersAndSort {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    
    int[] numbers = new int[n];
    
    for(int i = 0; i < n; i++) {
      int next = scanner.nextInt();
      numbers[i] = next;
    }
    
    Arrays.sort(numbers);
    
    for(int number: numbers) {
      System.out.println(number);
    }
    
  }
}

