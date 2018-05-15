
package javaapplication1;
import java.util.*;
import java.util.Scanner;


/**
 *
 * @author Cynthia
 */


public class assignment1b {
    public static void main(String[] args){
        //Arrays that store the values entered
        List<Integer> marksArray = new ArrayList<Integer>();
        List<String> namesArray = new ArrayList<String>();
        
        //WHILE loop for the whole program
        boolean choice = true;
          while(choice){
              
        Scanner input = new Scanner(System.in);
        //Prompt to enter Subject Name
        System.out.print("Enter Subject: ");
        String subject = input.nextLine();
         
       
        //Prompt to enter number of student taking that subject
          System.out.print("Enter No. of Students: ");
         int numstudents = input.nextInt();
        
         int[] marks = new int[numstudents];
         String[] names= new String[numstudents];
        
         System.out.println("subject is:" +subject +" " + "student size is: " + numstudents);
         
        
         int i;
         int mark = 0;
         String name ="";
         
         //FOR loop for the numstudents specified
         for(i=0; i< numstudents; i++){
             System.out.println("Enter name of Student");
             name = input.next();
             namesArray.add(name);
             
             System.out.println("Enter the marks");
             mark = input.nextInt();
             
             marksArray.add(mark);
             
             names[i] = name;
             marks[i] = mark;
             
             //Displays marks per student entered
             System.out.println("subject:" +subject);
             System.out.println("StudentName is: " + names[i] + " " + "marks is: " +marks[i]);
             
         }
         
         //Showing option to proceed or exit
         System.out.println("press 0 to exit and any other number to proceed");
         if(input.nextInt()==0){
          choice = false;
         }
         else{ 
           choice = true;
         }
         
          //Displaying all the student names and marks entered
             for(int j=0;j<namesArray.size();j++){
                System.out.println( namesArray.get(j) + " has " + marksArray.get(j));
             }
         
    }
    
    
    
    
    
    }  
    
}
