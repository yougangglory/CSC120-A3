

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
 /* This is the name of the class*/
class Conversation {

  public static void main(String[] arguments) {

    // The conversation starts here. 
   ArrayList<String> Transcript = new ArrayList<String>();
   System.out.println("How many number of rounds do you want?");
    /* Scanner collects the input of the User*/
   Scanner input = new Scanner(System.in);
   int numberofrounds= input.nextInt();

   System.out.println("Hi!What's on your mind?");
   Transcript.add("Hi!What's on your mind?");
   String[]arrayofcannedresponses=new String[]{"Really? Oh! Mmm-hm.See ya!"};
    /* arrayorigin is the array of words to be identified and arrayreplacement is the one for words to replace */
   String[] arrayorigin= new String [] {"I'm","I","you","am","my","your","me"};
   String[] arrayreplacement= new String [] {"You're","you","I","are","your","my","you"};
   

  for(int i=0;i<=numberofrounds;i++){
    String Userinput= input.nextLine();
    Transcript.add(Userinput);
  
    System.out.println(i);
    
   String []arrayofinput= Userinput.split(" ",15);
   
    for (int h=0; h<arrayofinput.length; h++){
      
        for(int j=0;j<arrayorigin.length;j++){
          if (arrayofinput[h].equals(arrayorigin[j])){
            // System.out.println("1 "+ arrayofinput[h]);
            // System.out.println("2 "+ arrayreplacement[j]);
            arrayofinput[h]=arrayreplacement[j];
        
          }  
         
         
         
        }
        
    } 
     
     String fullsentence ="";

    for (String sentence: arrayofinput){
      System.out.print(sentence+" ");
      fullsentence = fullsentence+sentence+" ";
      
     }
     fullsentence = fullsentence+"?";
     Transcript.add(fullsentence);
     System.out.print("?\n");
    
 
  } 
   input.close();
   System.out.println("It was a pleasure to talk to you!Good Bye!");
   Transcript.add("It was a pleasure to talk to you!Good Bye!");
   System.out.println("");
   System.out.println("TRANSCRIPT:");
      for (int k=0; k<Transcript.size(); k++){
      System.out.println(Transcript.get(k));
      }
    
  }

}

 

      
  
