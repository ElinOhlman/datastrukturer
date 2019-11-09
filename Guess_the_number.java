import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class Guess_the_number{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Guess any integer number larger than 0: "); // blir lite problem om man gissar ett nummer som är större än det största tillåtna integernumret
    String n = scanner.next();
    int number= 0;
    try{
      number = Integer.parseInt(n);
    }
    catch (NumberFormatException e){
      System.out.println("Please enter a valid input");
      System.exit(0);
    }
    if (number < 0){
      System.out.println("Please enter a valid input");
      System.exit(0);
    }
    int lo = 0;
    int hi = 10000;
    int noOfGuesses = 1; //Because if the number is < 10000 we have still asked once
    while (number > hi){
      hi = hi*2;
      noOfGuesses++;
    }
    int mid = (lo+hi)/2;
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
