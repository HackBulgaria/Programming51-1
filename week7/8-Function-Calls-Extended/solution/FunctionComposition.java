package com.hackbulgaria.programming51.week7.solutions;

import java.util.Stack;

public class FunctionComposition {
  
  private Stack<Function> callStack = new Stack<>();
  
  public FunctionComposition(String composition) {
    
    String[] functions = composition.split(" . ");
    
    for(String f: functions) {
      callStack.add(Context.allFunctions.get(f));
    }
  }
  
  public int evaluate(int x) {
    while(!callStack.isEmpty()) {
      Function f = callStack.pop();
      System.out.println("Evaluating function: " + f.getName() + "(" + x + ")");
      x = f.evaluate(x);
    }
    
    return x;
  }
}

