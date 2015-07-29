package com.hackbulgaria.programming51.week7.solutions;

import java.util.LinkedList;

public class Function {
  private String fName;
  private String argumentName;
  private String source;
  private String fBody;
  
  public Function(String source) {
//    inc x = x + 1
    this.source = source;
    
    String[] fParts = source.split(" = ");
    fBody = fParts[1];
    
    String[] fDefinitionParts = fParts[0].split(" ");
    fName = fDefinitionParts[0];
    argumentName = fDefinitionParts[1];
  }
  
  public String getName() {
    return fName;
  }
  
  public String getArgumentName() {
    return argumentName;
  }
  
  public int evaluate(int x) {
//    "5 + 2 - 3"
//    ["5", "+", "2", "-", "3"]
    String[] expressionParts = fBody.split(" ");
    LinkedList<String> operations = new LinkedList<>();
    LinkedList<Integer> values = new LinkedList<>();
    
    for(String token: expressionParts) {
      if(isOperation(token)) {
        operations.add(token);
      }
      
      if(isStringInteger(token)) {
        values.add(Integer.parseInt(token));
      }
      
      if(token.equals(argumentName)) {
        values.add(x);
      }
      
      if(isFunction(token)) {
        values.add(callOtherFunction(token, x));
      }
      
    }
    
    while(!operations.isEmpty()) {
      String op = operations.removeFirst();
      int left = values.removeFirst();
      int right = values.removeFirst();
      int result = 0;
      
      switch (op) {
      case "+":
        result = left + right;
        break;
      case "-":
        result = left - right;
      }
      
      values.addFirst(result);
    }
    
    return values.removeFirst();
  }
  
  public String toString() {
    return source;
  }
  
  private int callOtherFunction(String token, int x) {
//    inc(x)
//    inc(1)
    
    String[] fParts = token.split("\\(");
    
    String fName = fParts[0];
    String argument = fParts[1].substring(0, fParts[1].length() - 1);
    int argumentValue = 0;
    
    if(argument.equals(argumentName)) {
      argumentValue = x;
    } else if(isStringInteger(argument)) {
      argumentValue = Integer.parseInt(argument);
    }
    
    return Context.allFunctions.get(fName).evaluate(argumentValue);
  }
  
  private boolean isFunction(String token) {
//    Чрез регулярен израз.
    
    int indexOfOpenBracket = token.indexOf("(");
    int indexOfCloseBracket = token.indexOf(")");
    
    if(indexOfOpenBracket == -1 || indexOfCloseBracket == -1) {
      return false;
    }
    
    return indexOfOpenBracket < indexOfCloseBracket;
  }
  
//  "5", "555", "12310", но не и "abc"
  private boolean isStringInteger(String token) {
    for(char ch: token.toCharArray()) {
      if(!Character.isDigit(ch)) {
        return false;
      }
    }
    
    return true;
  }
  
  private boolean isOperation(String token) {
    return (token.equals("+") || token.equals("-"));
  }
}

