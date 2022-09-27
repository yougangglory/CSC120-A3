

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
<<<<<<< HEAD
 /* This is the name of the class*/
=======

>>>>>>> 946515600d651d6d41083ccf10ec254d2832d914
class Conversation {

  public static void main(String[] arguments) {
<<<<<<< HEAD

    // The conversation starts here. 
   ArrayList<String> Transcript = new ArrayList<String>();
   System.out.println("How many number of rounds do you want?");
    /* Scanner collects the input of the User*/
   Scanner input = new Scanner(System.in);
   int numberofrounds= input.nextInt();

   System.out.println("Hi!What's on your mind?");
   Transcript.add("Hi!What's on your mind?");
   String[]arrayofcannedresponses=new String[]{"Really? Mmm-hm.See ya!"};
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

 

      
  
=======
    // You will start the conversation here.
    ArrayList<String> transcript = new ArrayList<String>();
    // String[] transcript=new String []{"Hi!What's on your mind?", };
    System.out.println("How many number of rounds do you want?");
    Scanner input = new Scanner(System.in);
    int numberofrounds = input.nextInt();
    System.out.println("Hi!What's on your mind?");
    transcript.add("Hi!What's on your mind?");

    for (int i = 0; i < numberofrounds; i++) {

      // RJC: Careful with your calitalization: save capital letters for Class names
      String Userinput = input.next();
      // Print debugging statement
      System.out.println(Userinput); // RJC: looks like we found part of the problem!
      
      transcript.add(Userinput);
      System.out.println(i);
      String[] arrayofinput = Userinput.split(" ", 15);

      // Print debugging statement
      System.out.println("Split user input: " + Arrays.toString(arrayofinput));

      // RJC: These arrays don't need to be re-created every round, right?
      //      Consider moving them outside the loop :-)
      String[] arrayorigin = new String[] { "I'm", "I", "You", "am", "my", "your", "me" };
      String[] arrayreplacement = new String[] { "You're", "you", "I", "are", "your", "my", "you" };

      // For each word the user in the user's input
      for (int h = 0; h < arrayofinput.length; h++) {
        // Check against each mirror word
        for (int j = 0; j < arrayorigin.length; j++) {
          // If we match a mirror word
          if ((arrayofinput[h]).equals(arrayorigin[j])) {
            // Print debugging statement
            System.out.println("-->Found mirror word: " + arrayorigin[j] + " in position " + h);

            // Overwrite the original word with the replacement
            arrayofinput[h] = arrayreplacement[j];

            // Print debugging statement
            System.out.println("-->User input with replacement: " + Arrays.toString(arrayofinput));
          }
        }
      }
      for (int k = 0; k < arrayofinput.length; k++) {
        System.out.print(arrayofinput[k]);
      }

      // System.out.println("TRANSCRIPT:");
      // for (int k=0; k<transcript.size(); k++){
      // System.out.println(transcript.get(k));
      // }
      // } System.out.println("Mmm-hm.");
      // System.out.println("See ya!");
      // System.out.println("TRANSCRIPT:");

      // for (int a=0; a<sentence.size(); a++){
      // System.out.println(sentence.get(a));
      // }
      // System.out.println("Mmm-hm.");
      // System.out.println("See ya!");
      // transcript.add("Mmm-hm.");
      // transcript.add("See ya!");
    }
    input.close();
  }
}
>>>>>>> 946515600d651d6d41083ccf10ec254d2832d914
