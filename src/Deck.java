public class Deck extends  Hand {
    public void populate(){
        /**
         *  for suit in suits
         *   for rank in Ranks
         *      set card to Card with rank & suit
         *       Call cards.add with card
         *      End for
         *   End for
         */
        for ( Suit suit: Suit.values()) {
            for(Rank rank : Rank.values()){
                Card card =new Card(rank ,suit);
                card.flipCard();
                this.add(card);

            }

        }


    }
}
