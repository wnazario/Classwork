import java.util.Scanner;

public class AdditionQuiz {
  public static void main(String[] args) {
    //create two random integers from 0 - 9
    int n1 = (int)(Math.random() * 10);  
    int n2 = (int)(Math.random() * 10);

    Scanner input = new Scanner(System.in);

    System.out.print("What is " + n1 + " + " + n2 + "? ");
    int userAnswer = input.nextInt();
    int count = 0;
    
    do {
      if (count > 0)
      System.out.println("Wrong Answer. Try again.");
      System.out.print("What is " + n1 + " + " + n2 + "? ");
      userAnswer = input.nextInt();
      count ++;
    } while (n1 + n2 != userAnswer);

    System.out.println("You got it!");
    System.out.println("It takes you " + count + " times to get answer correct.");
  }
}
