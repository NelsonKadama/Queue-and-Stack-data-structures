
import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// Question , Assignment 
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: //13

public class Question2 {
    public static void main (String [] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));        //creates the i/0 buffer
        String in;
        Queue<String> elements = new LinkedList<String>();      //creates a queue to store elements
        
        while(!(in = input.readLine()).equalsIgnoreCase("x")){      // checks whether to exit or proceed
            if(in.equalsIgnoreCase("o")){
                if(elements.size()==0){                             // if there is no input typed in
                    System.out.println("Buffer empty");
                }
                else{
                    Iterator itr = elements.iterator();             // iterator to move through queue
                    if(itr.hasNext()){
                        String term = itr.next().toString();
                        System.out.println("Data: " + term);        // prints required output
                        elements.remove();
                    }
                    else
                        System.out.println("Buffer empty");
                    
                }
                    
            }
            else{
                elements.add(in);
                
            }
        }

    }

}
