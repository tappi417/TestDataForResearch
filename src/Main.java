import java.util.ArrayList;

class Main {

	public static void main(String[] args) {

		ArrayList<String> newCustemerList = new ArrayList<String>();

		newCustemerList.add("Taro");
		newCustemerList.add("Jiro");
		newCustemerList.add("Hanako");

		CardManager maneger = new CardManager();
		maneger.makeCards(newCustemerList);

		Card card = maneger.getCard("Jiro");
		card.addPoint(100);
		System.out.println("Jiro's Point is " + card.getPoint());
		System.out.println("Jiro's Address is " + card.getAddress());
	}
}
