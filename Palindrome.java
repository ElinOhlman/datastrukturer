class Palindrome{
  public static void main(String[] args) {
    if (isPalindrome("Madam, I'm Adam!")){
      System.out.println("palindrome");
    }
    else{
      System.out.println("inte palindrome");
    }
  }
  public static boolean isPalindrome(String string){
    int posL = 0;
    int posR = string.length()-2;
    while (posL < posR){
      while (!Character.isAlphabetic(string.charAt(posL))){
        posL++;
      }
      while (!Character.isAlphabetic(string.charAt(posR))){
        posR--;
      }
      if (Character.toUpperCase(string.charAt(posR)) != Character.toUpperCase(string.charAt(posL))){
        return false;
      }
      posL++;
      posR--;
    }
    return true;
  }
}
