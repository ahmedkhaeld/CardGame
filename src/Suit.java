public enum Suit {
    HEARTS("Hearts"),
    SPADES("Spades"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs");

    private final String suitText;

    // constructor
    private Suit (String suitText){
        this.suitText=suitText;
    }

    // public method
    public String printSuit(){
    return suitText;
    }




}
