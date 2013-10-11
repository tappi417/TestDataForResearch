class Main {

	public static void main(String[] args) {

		AccountManager manager = new AccountManager();
		manager.makeAccount("Taro", false);
		manager.makeAccount("Jiro", true);
		manager.makeAccount("Hanako", true);
		
		Account account = manager.getAccount("Jiro");
		if(account.getCard() != null) {
			System.out.println(account.getCard().getName());			
		}
	}
}
