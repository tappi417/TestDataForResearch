class Main {

	public static void main(String[] args) {

		AccountManager manager = new AccountManager();
		manager.makeAccount("Taro", true);

		Account account = manager.getAccount("Taro");
		if(account.getCard() != null) {
			System.out.println("Taro has a card");
			account.setTicket(new Ticket("Taro"));
		} else {
			return;
		}
		Ticket ticket = account.getTicket();
		System.out.println(ticket.isUsed());
		if (!ticket.isUsed()) {
			account.getTicket().use();
		}
		System.out.println(ticket.isUsed());
	}
}
