import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner word = new Scanner(System.in);
    System.out.println("Enter the word you would like to find the length of: ");
    String userInput = word.next();
            int len = userInput.length();
     System.out.println("Length of the word " + userInput + " is: " + len);
  }
}