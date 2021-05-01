import java.sql.SQLOutput;

public class Game {

    public static  void main (String [] args){
        Card c1, c2;

        c1=new Card(Rank.ACE,Suit.HEARTS);
        c2=new Card(Rank.JACK, Suit.HEARTS);

        System.out.println(c1.toString()+ "\n" + c2.toString());


        // flip our cards
        c1.flipCard();
        c2.flipCard();


//        if (c1.getRank()> c2.getRank()) {
//            System.out.println(c1.toString() + " is greater than " + c2.toString());
//        }
//        else {
//            System.out.println(c1.toString() + " is not greater than " + c2.toString());
//        }
//        if(c1.getSuit()== c2.getSuit()){
//            System.out.println(c1.toString() + " is the same suit as " + c2.toString());
//        }
//        System.out.println("After flipping card 1 "+ c1.toString());


        // create a hand
        Hand h1 =new Hand();
        Hand h2 =new Hand();
        h1.add(c1);
        h1.add(c2);
        System.out.println(h1.showHand());
        h1.give(c1, h2);
        System.out.println(" Hand 1 is: " + h1.showHand() + "\n" + "Hand 2 is now: " + h2.showHand());


        // create a deck
        Deck d1= new Deck();
        d1.populate();
        System.out.println(" Deck has the following cards: " + d1.showHand() );


    }
}
