class Upp1_2_6{
  public static void main(String[] args) {
    if (circular("ACTGACG", "TGACGAC")){
      System.out.println("Circular rotation");
    }
    else{
      System.out.println("Not circular rotation");
    }

  }
  public static boolean circular(String word1, String word2){
    return (word1.length() == word2.length()) && (word1.concat(word1).indexOf(word2) >= 0);
  }
}
