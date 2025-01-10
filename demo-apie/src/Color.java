public enum Color {
  RED(1), 
  YELLOW(2), 
  BLUE(3);

  private final int value;


  private Color(int value) {
    this.value = value;
  }

  public int getValue(){
    return this.value;
  }

  public static void main(String[] args) {
    System.err.println(Color.BLUE.getValue());
  }
}
