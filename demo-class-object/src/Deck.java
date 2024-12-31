public class Deck {

  private Card[] cards;// 52 cards

  public Deck (){

    this.cards= new Card[Card.SUITES.length * RANKS.length]; // 13 x4
    int idx = 0;
    for (char rank : Card.RANKS){
      for (char suite : Card.SUITES){
        this.cards[idx++] = new Card(rank, suite);
      }
    }
  }

  public static void main(String[] args){
    Deck deck = new Deck(); // 52cards

    System.out.println(Math.PI); // public & static
    // Math.PI
  }
}
