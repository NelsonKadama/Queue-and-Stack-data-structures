
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;

// Question 3, Assignment9 
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: //13

public class Question3 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String test;                                                    //stores input
        Stack opening = new Stack();                                    // stores opening braces
        ArrayList<Character> closing = new ArrayList<Character>();      //stores closing braces
        String open = "({[<";                                           // possible opening braces
        String close = ")}]>";                                          // possible closing braces
        String statement = "";                                          // stores output statement
        
        
        
        System.out.println("Enter a string to test:");
        test = input.nextLine();
        
        for(int k = 0; k < test.length(); k++){
            char brace = test.charAt(k);
            
            switch(brace){                                              
                case '(':                                               //checks if opening brace
                case '{':
                case '[':
                case '<':
                    opening.push(brace);                                // adds to stack
                    break;
                case ')':                                               //checks if closing brace
                case '}':
                case ']':
                case '>':
                    if(!opening.empty()){
                        if(open.indexOf(String.valueOf(opening.peek()))  == close.indexOf(String.valueOf(brace))){          // checking if closing brace has a matching opening brace

                            opening.pop();      // removes the matching bracket
                        }
                        else{
                            statement += "error: '"+brace+"' does not match with '"+opening.pop()+"'.\n";                   // error if theres no matching bracket
                            System.out.println(statement);                                                                  // outputs error
                            System.exit(0);                                                                                 //exits
                        }    
                            

                    }
                    else{
                        
                        statement += "error at end: the close bracket '"+brace+"' does not have a corresponding opening bracket.\n";        //executes if a closing bracket had no matching close after queue was checked

                    }
                    break;
                    
            }
        }
        
        
        
         while((!opening.empty())){
                statement += "error at end: opening bracket '"+opening.pop()+"' remains unclosed.\n";                                       //executes if an opening bracket had no matching close after closing brackets were checked
                
            
        }
         
         if (statement.isEmpty())       
             statement = "The string is correct! There are no mismatched brackets.";                 // outputs if all brackets had matches
         
         System.out.println(statement);
        
        
        
    }
}