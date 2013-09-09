import java.util.ArrayList;

class CardManager {

	private ArrayList<Card> cardList = new ArrayList<Card>();

	public void makeCards(ArrayList<String> nameList) {
		for(int i = 0; i < nameList.size(); i++) {
			Card newCard = new Card(nameList.get(i));
			ZipCode zipCode = new ZipCode();
			newCard.SetAddress(zipCode.searchAddress(i % 3));
			cardList.add(newCard);
		}
	}

	public Card getCard(String name) {
		for (int i = 0; i < cardList.size(); i++) {
			if (name.equals(cardList.get(i).getName())) return cardList.get(i);
		}
		return null;
	}

}
