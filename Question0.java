
import java.util.*;

// Question0, Assignment 9
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: 29/09/13

public class Question0 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String text_entered = "";
        String choice = "";
        Queue<String> elements = new LinkedList<String>();      // creates queue
        
        while(true){
            System.out.println("MENU: Add node(A), Delete node(D), Display(L), Exit(^z)");      // displays the menu
            choice = input.nextLine();
            
            switch(choice.charAt(0)){
                case 'A':
                case 'a':
                    while(true){
                        System.out.println("Enter something or ^z to return to main menu:");
                        text_entered = input.nextLine();

                        if(text_entered.equalsIgnoreCase("^z")){        // checks whether to return to main menu
                            break;
                        }
                        elements.add(text_entered);     //adds input to queue
                    }
                    break;
                case 'D':
                case 'd':
                    if (elements.size() !=0){
                        elements.remove();                          //deletes elements from queue
                        System.out.println("Deletion done!");
                    }
                    else
                        System.out.println("Queue is empty");
                    break;
                    
                case 'L':
                case 'l':
                    if(elements.size() == 0){                       // checks size of queue
                        System.out.println("Queue is empty");
                        break;
                    }
                    else{
                        String output = "";
                        Iterator itr = elements.iterator();         // iterator to go through queue
                        output = itr.next() + "";
                        while(itr.hasNext())
                            output += " - " + itr.next();
                        System.out.println(output);
                    }
                    break;
                    
                default:
                    if(choice.equalsIgnoreCase("^z")){          // exits program
                        System.out.println("Bye bye");
                        System.exit(0);
                    }
                    else
                       System.out.println(choice.charAt(0) + " is not a valid option"); 
                            
                    
                    
            }
            
        }

    }

}
