
/**This is a subclass of the class Hand. It is used to model hand type of Triple. 
 * @author Shikhar
 *
 */
public class Triple extends Hand {
	private static final long serialVersionUID = 1L;
	/**Constructor method for building a hand with a specified player and list of cards 
	 * @param player The specified player who is playing the hand. 
	 * @param cards A CardList object containing cards to be played as the hand 
	 */
	public Triple(CardGamePlayer player, CardList cards) {
		super(player, cards);
		
	}
	
	/** This method checks whether the hand played is valid and conforms to the rules of the 'Triple' hand.
	 * @return The boolean value of true if it is valid, else false.
	 */
	public boolean isValid() {
		if(this.size()!=3)
			return false;
		else {
			int rank1=this.getCard(0).getRank();
			int rank2=this.getCard(1).getRank();
			int rank3=this.getCard(2).getRank();
			if(rank1==rank2 && rank1==rank3)
				return true;
			else
				return false;
		}
	}
	
	/** This method returns the type (String) of hand that is played.
	 * @return The string value of the hand played. 
	 */
	public String getType() {
		return "Triple";
	}

}
