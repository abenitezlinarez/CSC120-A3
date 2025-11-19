import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner; 

class Conversation implements ConversationRequirements {
  // Attributes 
  Scanner scanner = new Scanner(System.in);
  Random random = new Random();
  List<String> transcript = new ArrayList<>();
  int numberOfRounds;
  String inputString;
  String regex = " ";
  String I = "I";
  String me = "me";
  String am = "am";
  String you = "you";
  String my = "my";
  String your = "your";
  String period = ".";
  String[] cannedResponses = {"Hmmm....", "Wow!", "That's nice!", "Love that"};
  
  
  /**
   * Constructor 
   * We don't make any instances of objects so a constructor isn't very useful so I didn't add anything to it
   */
  Conversation() {
    
  }

  /**
   * Starts and runs the conversation with the user. 
   * It also has a variable, numberOfRounds that counts how many times the user and the computer talk
   */
  public void chat() {
    System.out.println("Welcome to Ari's Chatbot!");
    System.out.println("How many lines of conversation would you like:");
    numberOfRounds = scanner.nextInt();
    scanner.nextLine(); //moves scanner to next line for the rest of questions
    System.out.println("How was your day today?");

    for (int i = 0; i < numberOfRounds; i++){
      inputString = scanner.nextLine();
      System.out.println(respond(inputString));
    }
    System.out.println("Thank you so much for talking with me! Bye!");
  }

  /**
   * Prints transcript of conversation
   */
  public void printTranscript() {
    for (int i = 0; i < numberOfRounds; i++){
      
    }
    System.out.println("------Transcript-------");

    for (int i = 0; i < numberOfRounds*2; i++){
      System.out.println(transcript.get(i));
    }
    }

  /**
   * Gives appropriate response (mirrored or canned) to user input
   * @param inputString the users last line of input
   * @return mirrored or canned response to user input  
   */
  public String respond(String inputString) {  
        if (inputString.contains(I)){
        String replacedStatement = inputString.replaceAll(I, "you");
        String replacedStatement3 = replacedStatement.replaceAll(me, "you");
        String replacedStatement4 = replacedStatement3.replaceAll(am, "are");
        String replacedStatement5 = replacedStatement4.replaceAll(your, "my");
        String replacedStatement6 = replacedStatement5.replaceAll(my, "your");
        String ReplacedStatemnent7 = replacedStatement6.replace(period, "?");
        transcript.add(inputString);
        transcript.add(ReplacedStatemnent7);
        return(ReplacedStatemnent7);
        }else if(inputString.contains(you)){
          String replacedStatement = inputString.replaceAll(you, "I");    
          String replacedStatement3 = replacedStatement.replaceAll(me, "you");
          String replacedStatement4 = replacedStatement3.replaceAll(am, "are");
          String replacedStatement5 = replacedStatement4.replaceAll(your, "my");
          String replacedStatement6 = replacedStatement5.replaceAll(my, "your");
          String ReplacedStatemnent7 = replacedStatement6.replace(period, "?");
          transcript.add(inputString);
          transcript.add(ReplacedStatemnent7);
          return(ReplacedStatemnent7);
        }else{
        String replacedStatement = inputString.replaceAll(you, "I");    
        String replacedStatement2 = replacedStatement.replaceAll(I, "you");
        String replacedStatement3 = replacedStatement2.replaceAll(me, "you");
        String replacedStatement4 = replacedStatement3.replaceAll(am, "are");
        String replacedStatement5 = replacedStatement4.replaceAll(your, "my");
        String replacedStatement6 = replacedStatement5.replaceAll(my, "your");
        String ReplacedStatemnent7 = replacedStatement6.replace(period, "?");

        transcript.add(inputString);
        transcript.add(ReplacedStatemnent7);
        return(ReplacedStatemnent7);
        }
  }

  public static void main(String[] arguments) {
    Conversation myConversation = new Conversation();
    myConversation.chat();
    myConversation.printTranscript();

  }
}