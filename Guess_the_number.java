import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class Guess_the_number{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Guess an integer number between 0 and 10000: ");
    String n = scanner.next();
    int number= 0;
    try{
      number = Integer.parseInt(n);
    }
    catch (NumberFormatException e){
      System.out.println("Please enter a valid input");
      System.exit(0);
    }
    int lo = 0;
    int hi = 10000;
    int mid = (lo+hi)/2;
    int noOfGuesses = 0;
    while (lo <= mid){
      noOfGuesses++;
      if (number > mid){
        lo = mid + 1;
      }
      else if (number < mid){
        hi = mid - 1;
      }
      else{
        System.out.println("Your number was "+ mid);
        System.out.println("It took " + noOfGuesses + " guesses to find your number!");
        break;
      }
      mid = (lo+hi)/2;
    }
  }
}
