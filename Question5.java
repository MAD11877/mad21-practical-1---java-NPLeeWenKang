import java.util.Scanner;
import java.util.ArrayList;
public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int numberOfInt = in.nextInt();
    ArrayList<Integer> intList = new ArrayList<>();
    int highestInt = 0;
    int highestOccurrence = 0;
    for(int i = 0; i<numberOfInt;i++){
      int intInput = in.nextInt();
      intList.add(intInput);
      int occurence = 0;
      for(int a = 0; a<intList.size();a++){
        if (intList.get(a) == intInput){
          occurence++;
        }
      }
      if (occurence > highestOccurrence){
        highestOccurrence = occurence;
        highestInt = intInput;
      }
    }
    System.out.println(highestInt);

  }
}
