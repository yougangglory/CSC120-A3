import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class Conversation {
  public static void main(String[] arguments) {
    // You will start the conversation here.
    ArrayList<String> transcript = new ArrayList<String>();
    // String[] transcript=new String []{"Hi!What's on your mind?", };
  System.out.println("How many number of rounds do you want?");
  Scanner input = new Scanner(System.in);
  int numberofrounds= input.nextInt();
  System.out.println("Hi!What's on your mind?");
  transcript.add("Hi!What's on your mind?");
 
  for(int i=0;i<numberofrounds;i++){
   
  String Userinput = input.next();
    transcript.add(Userinput);
    System.out.println(i);
   String[] arrayofinput= Userinput.split(" ",15);
   String[] arrayorigin= new String [] {"I'm","I","You","am","my","your","me"};
   String[] arrayreplacement= new String [] {"You're","you","I","are","your","my","you"};
  
    for (int h=0; h<arrayofinput.length; h++){
        for(int j=0;j<arrayorigin.length;j++){
          if ((arrayofinput[h]).equals(arrayorigin[j])){
            arrayofinput[h]=arrayreplacement[j]; 
          }
        } 
      }
      for (int k=0; k<arrayofinput.length; k++){
        System.out.print(arrayofinput[k]);
         }
      
    //      System.out.println("TRANSCRIPT:");
    //  for (int k=0; k<transcript.size(); k++){
    //   System.out.println(transcript.get(k));
    //   }
            // } System.out.println("Mmm-hm.");
           // System.out.println("See ya!");
         // System.out.println("TRANSCRIPT:");
         
// for (int a=0; a<sentence.size(); a++){
//   System.out.println(sentence.get(a));
//    }
//  System.out.println("Mmm-hm.");
//  System.out.println("See ya!");
//  transcript.add("Mmm-hm.");
//  transcript.add("See ya!");
 }
 input.close();
}
}






   
    