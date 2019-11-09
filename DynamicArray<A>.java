class DynamicArray<A>{
  private A[] array;
  private int lastIndex = 0;
  public DynamicArray(){
    this.array = (A[]) new Object[10];
  }
  public DynamicArray(A[] a){
    this.array = (A[]) new Object[a.length*2];
    for (int i = 0; i < a.length; i++){
      this.array[i] = a[i];
    }
    this.lastIndex = a.length;
  }
  public void add(A value){
    this.lastIndex++;
    this.array[this.lastIndex] = value;
  }
  public A get(int index){
    if (index > this.lastIndex){
      throw new ArrayIndexOutOfBoundsException();
    }
    return this.array[index];
  }
  public void set(int index, A value){
    if (index > this.lastIndex){
      throw new ArrayIndexOutOfBoundsException();
    }
    this.array[index] = value;
  }
  public static void main(String[] args) {
    Integer[] array = {1,2,3};
    DynamicArray a = new DynamicArray(array);
    System.out.println(a.get(0));
  }
}
