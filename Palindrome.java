class Palindrome{
  public static void main(String[] args) {
    if (isPalindrome("madamimadam")){
      System.out.println("palindrome");
    }
    else{
      System.out.println("inte palindrome");
    }

  }
  public static boolean isPalindrome(String string){
    for (int i = 0; i< string.length(); i++){
      if (string.charAt(i) != string.charAt(string.length()-1-i)){
        return false;
      }
    }
    return true;
  }
}
