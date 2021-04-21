import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    //System.out.print("Your Number (Int) is: ");
    int number = in.nextInt();
    int numberMulitplied = number*number;
    //System.out.println("Your Number is: "+numberMulitplied);
    System.out.println(numberMulitplied);
  }
}
