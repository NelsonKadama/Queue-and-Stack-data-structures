
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Question4 {
    public static void main(String [] args){
       Scanner input = new Scanner(System.in);
       String line;
       Stack elements = new Stack();
       int first, second;                               // stores first and second number to be operated on
       
       line = input.nextLine();
       if(line.length() == 0){
           System.out.println("Insufficient symbols in expression");        // if there was no input, exit program;
           System.exit(0);
       }
           
       int ans;
           for(int k =0; k < line.length(); k++){
               char pos = line.charAt(k);
               if(pos != ' '){
                   
                   switch(pos){                                             // checks operation to be performed
                       case '+':
                           if(elements.size() < 2){                         // if theres only 1 or less number, if so, exits program
                               System.out.println("Insufficient arguments for +" );
                               System.exit(0);
                           }
                               
                           first = (int)Integer.parseInt(String.valueOf(elements.pop()));
                           second = (int)Integer.parseInt(String.valueOf(elements.pop()));
                           ans = (first + second );
                           elements.push(ans);
                           break;
                       case '-':
                           if(elements.size() < 2){
                               System.out.println("Insufficient arguments for -" );
                               System.exit(0);
                           }
                           
                           first = Integer.parseInt(String.valueOf(elements.pop()));            //gets the first number to be operated on and converts it to integer
                           second = Integer.parseInt(String.valueOf(elements.pop()));
                           ans = (first - second );
                           elements.push(ans);
                           break;
                       case '/':
                           if(elements.size() < 2){
                               System.out.println("Insufficient arguments for /" );
                               System.exit(0);
                           }
                           
                           
                           second = (int)Integer.parseInt(String.valueOf(elements.pop()));
                           first = (int)Integer.parseInt(String.valueOf(elements.pop()));       //gets the first number to be operated on and converts it to integer
                           ans = (first / second );
                           elements.push(-1*ans);
                           break;
                       case '*':
                           if(elements.size() < 2){
                               System.out.println("Insufficient arguments for *" );
                               System.exit(0);
                           }
                           
                           
                           first = (int)Integer.parseInt(String.valueOf(elements.pop()));
                           second = (int)Integer.parseInt(String.valueOf(elements.pop()));
                           ans = (first * second );
                           elements.push(ans);                                                  // stores the answer in the stack
                           break;
                       default:
                           if(Character.isAlphabetic(pos)){
                               System.out.println("Integer expected but not found");                // if a letter is input, exit program
                               System.exit(0);
                           }
                           elements.push(pos);
                           break;
                       
                           
                   }
                   
                   
                   
                   
               }
               
                   
               
           }
           if(elements.size() > 1){
               System.out.println("Extra symbols in expression");           // if theres more than 1 number after operations
               System.exit(0);
           }
           System.out.println("Answer: " + elements.pop());
       
       
       
       
    
    }
}
