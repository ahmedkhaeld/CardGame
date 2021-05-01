public class Card {
    // private fields
    private Suit suit;
    private Rank rank;
    private boolean isFaceUp;

    //constructor
    public Card(Rank rank, Suit suit){
        this.rank=rank;
        this.suit=suit;
        isFaceUp=false;
    }

    public String getSuit(){
        return suit.printSuit();
    }

    public int getRank(){
        return  rank.getRank();
    }

    public void flipCard(){
        isFaceUp=!isFaceUp;
    }

    public  String toString(){
        String str="";
        if(isFaceUp) {
            str += rank.printRank() + "  of " + suit.printSuit();
        }
        else {
            str= " Face Down (nothing to see here)";}
        return str;
    }


}
