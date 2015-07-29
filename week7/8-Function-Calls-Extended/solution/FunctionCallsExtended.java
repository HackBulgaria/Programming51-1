package com.hackbulgaria.programming51.week7.solutions;

import java.util.ArrayList;
import java.util.Scanner;

public class FunctionCallsExtended {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int fCount = Integer.parseInt(scanner.nextLine());
    ArrayList<Function> allFunctions = new ArrayList<>();
    
    for(int i = 0; i < fCount; i++) {
      String nextF = scanner.nextLine();
      Function f = new Function(nextF);
      
      allFunctions.add(f);
      Context.allFunctions.put(f.getName(), f);
    }
    
    String compositionInput = scanner.nextLine();
    FunctionComposition composition = new FunctionComposition(compositionInput);
    
    int x = scanner.nextInt();
    
    System.out.println(composition.evaluate(x));
  }
}

