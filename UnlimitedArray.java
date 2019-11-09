

public class UnlimitedArray{
  private Integer[] array;

  public UnlimitedArray(){
    this.array = new Integer[10];
  }
  public UnlimitedArray(Integer[] a){
    this.array = new Integer[a.length*2];
    for (int i=0; i<a.length; i++){
      this.array[i] = a[i];
    }
  }

  public Integer get(int index){
    try{
      return array[index];
    }
    catch(Exception e){
      return null;
    }
  }
  public void set(int index, int value){
    if (index > this.array.length){
      Integer[] temp = new Integer[index*2];
      for (int i=0; i<this.array.length; i++){
        temp[i] = this.array[i];
      }
      this.array = new Integer[index*2];
      for (int i = 0; i < temp.length; i++){
        this.array[i] = temp[i];
      }
    }
    this.array[index] = value;
  }
  public static void main(String[] args) {
    Integer[] b = {1,2,3};
    UnlimitedArray a = new UnlimitedArray(b);
    a.set(700,3);
    System.out.println(a.get(700));
  }


}
