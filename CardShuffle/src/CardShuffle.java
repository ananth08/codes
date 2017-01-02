import java.util.Random;

/**
 * Created by ananthrkn on 1/2/17.
 */
public class CardShuffle {

    int[] cards;            //deck of cards consisting of 52 cards

    public CardShuffle(){
        cards = new int[52];
    }

    public void operation(){

        Random random = new Random();

        for(int i = 0; i < 52 ; i++){
            cards[i] = (i % 13);
        }

        System.out.println("Original Card Array");
        for(int i = 0; i < cards.length ; i++){
            System.out.print(cards[i]+"\t");
        }

        int i = 0;

        while(i < 52){
            int var = random.nextInt(51) + 0;
            int temp = cards[i];
            cards[i] = cards[var];
            cards[var] = temp;
            i++;
        }

        System.out.println("");
        System.out.println("Deck after shuffle");
        for(int j = 0; j < cards.length ; j++){
            System.out.print(cards[j]+"\t");
        }

    }

    public static void main(String[] args){
        CardShuffle c = new CardShuffle();
        c.operation();
    }
}
