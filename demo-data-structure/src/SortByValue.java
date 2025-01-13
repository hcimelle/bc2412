import java.util.Comparator;

public class SortByValue implements Comparator<Ball> {

  @Override
  public int compare(Ball b1, Ball b2) {
    // b1 (-1), b2 (1)

    if (b1.getValue() > b2.getValue())
      return -1;
    return 1;

    // = return b1.getValue() > b2.getValue() ? -1 : 1 ;
  }

}
