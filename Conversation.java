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
        String replacedStatement = inputString.replaceAll(I, "You");
        String replacedStatement2 = replacedStatement.replaceAll(me, "You");
        String replacedStatement3 = replacedStatement2.replaceAll(am, "are");
        String replacedStatement4 = replacedStatement3.replaceAll(you, "I");
        String replacedStatement5 = replacedStatement4.replaceAll(my, "your");
        String ReplacedStatemnent6 = replacedStatement5.replace(period, "?");
        transcript.add(inputString);
        transcript.add(ReplacedStatemnent6);
        return(ReplacedStatemnent6);

      }
      else if (inputString.contains(me)){
        String replacedStatement = inputString.replaceAll(I, "You");
        String replacedStatement2 = replacedStatement.replaceAll(me, "You");
        String replacedStatement3 = replacedStatement2.replaceAll(am, "are");
        String replacedStatement4 = replacedStatement3.replaceAll(you, "I");
        String replacedStatement5 = replacedStatement4.replaceAll(my, "your");
        String ReplacedStatemnent6 = replacedStatement5.replace(period, "?");
        transcript.add(inputString);
        transcript.add(ReplacedStatemnent6);
        return(ReplacedStatemnent6);

        }
      else if (inputString.contains(am)){
        String replacedStatement = inputString.replaceAll(I, "You");
        String replacedStatement2 = replacedStatement.replaceAll(me, "You");
        String replacedStatement3 = replacedStatement2.replaceAll(am, "are");
        String replacedStatement4 = replacedStatement3.replaceAll(you, "I");
        String replacedStatement5 = replacedStatement4.replaceAll(my, "your");
        String ReplacedStatemnent6 = replacedStatement5.replace(period, "?");
        transcript.add(inputString);
        transcript.add(ReplacedStatemnent6);
        return(ReplacedStatemnent6);

        }
      else if (inputString.contains(you)){
        String replacedStatement = inputString.replaceAll(I, "You");
        String replacedStatement2 = replacedStatement.replaceAll(me, "You");
        String replacedStatement3 = replacedStatement2.replaceAll(am, "are");
        String replacedStatement4 = replacedStatement3.replaceAll(you, "I");
        String replacedStatement5 = replacedStatement4.replaceAll(my, "your");
        String ReplacedStatemnent6 = replacedStatement5.replace(period, "?");
        transcript.add(inputString);
        transcript.add(ReplacedStatemnent6);
        return(ReplacedStatemnent6);

        }
      else if (inputString.contains(my)){
        String replacedStatement = inputString.replaceAll(I, "You");
        String replacedStatement2 = replacedStatement.replaceAll(me, "You");
        String replacedStatement3 = replacedStatement2.replaceAll(am, "are");
        String replacedStatement4 = replacedStatement3.replaceAll(you, "I");
        String replacedStatement5 = replacedStatement4.replaceAll(my, "your");
        String ReplacedStatemnent6 = replacedStatement5.replace(period, "?");
        transcript.add(inputString);
        transcript.add(ReplacedStatemnent6);
        return(ReplacedStatemnent6);
      
      }else{
        int index = random.nextInt(cannedResponses.length);
        String randomResponse = cannedResponses[index];
        transcript.add(inputString);
        transcript.add(randomResponse);
        return(randomResponse);
      }
  }

  public static void main(String[] arguments) {
    Conversation myConversation = new Conversation();
    myConversation.chat();
    myConversation.printTranscript();

  }
}
