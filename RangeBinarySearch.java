import java.util.*;
import java.lang.*;

public class RangeBinarySearch {
    // Returns the index of the first key in a[] that equals the search key, or -1 if no such key.
    // Complexity: O(log N), where N is the length of the array
    public static <Key> int firstIndexOf(Key[] a, Key key, Comparator comparator){
    int lo = 0;
    int hi = a.length-1;
    int keyLeft = -1;
    while (lo <= hi){
      int mid = (lo+hi)/2;
      if (comparator.compare(a[mid], key) > 0){
        hi = mid-1;
      }
      else if (comparator.compare(a[mid], key) < 0){
        lo = mid +1;
      }
      else {
        keyLeft = mid;
        hi = mid-1;
      }
    }
    return keyLeft;
}
    // Returns the index of the last key in a[] that equals the search key, or -1 if no such key.
    // Complexity: O(log N)
    public static <Key> int lastIndexOf(Key[] a, Key key, Comparator comparator){
    int lo = 0;
    int hi = a.length-1;
    int keyRight = -1;
    int mid = (lo+hi)/2;
    while (lo < hi){
      if (comparator.compare(a[mid], key) > 0){
        hi = mid-1;
      }
      else if (comparator.compare(a[mid], key) < 0){
        lo = mid +1;
      }
      else {
        keyRight = mid;
        lo = mid+1;
      }
      mid = (lo+hi)/2;
    }
    return keyRight;
  }
  public static void main(String[] args) {
    Term t1 = new Term("a", 1);
    Term t2 = new Term("a", 2);
    Term t3 = new Term("a", 2);
    Term t4 = new Term("b", 2);
    Term t5 = new Term("b", 2);
    Term t6 = new Term("c", 2);
    Term key = new Term("c",1);
    Term[] array = {t1,t2,t3,t4,t5,t6};
    Arrays.sort(array, Term.byLexicographicOrder());
    System.out.println(firstIndexOf(array,key,Term.byLexicographicOrder()));

  }
}
