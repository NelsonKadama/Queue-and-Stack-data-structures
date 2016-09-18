
import java.util.*;

// Question1, Assignment 9
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: 29/09/13

public class Question1 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String text_entered = "";
        String choice = "";
        Stack elements = new Stack();           // creates Stack
        
        while(true){
            System.out.println("MENU: Add node(A), Delete node(D), Display(L), Exit(^z)");       // displays the menu
            choice = input.nextLine();
            
            switch(choice.charAt(0)){
                case 'A':
                case 'a':
                    while(true){
                        System.out.println("Enter something or ^z to return to main menu:");
                        text_entered = input.nextLine();

                        if(text_entered.equalsIgnoreCase("^z")){             // checks whether to return to main menu
                            break;
                        }
                        elements.push(text_entered);            //adds input to head of stack
                    }
                    break;
                case 'D':
                case 'd':
                    if (elements.size() !=0){
                        elements.pop();                         //deletes elements at the head of the stack
                        System.out.println("Deletion done!");
                    }
                    else
                        System.out.println("Stack is empty");
                    break;
                    
                case 'L':
                case 'l':
                    if(elements.size() == 0){                   // checks size of stack
                        System.out.println("Stack is empty");       
                        break;
                    }
                    else{
                        for(int k = elements.size()-1; k >= 0; k--){            // display elements from head
                            System.out.println(elements.get(k));
                        }
                        System.out.println("");
                    }
                    break;
                    
                default:
                    if(choice.equalsIgnoreCase("^z")){
                        System.out.println("Bye bye");
                        System.exit(0);                             // exits program
                    }
                    else
                       System.out.println(choice.charAt(0) + " is not a valid option"); 
                            
                    
                    
            }
            
        }

    }

}
