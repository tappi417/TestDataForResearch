import java.util.ArrayList;

class AccountManager {

	private ArrayList<Account> accountList = new ArrayList<Account>();

	public void makeAccount(String name, boolean makingCard) {
		Account account = new Account(name);
		account.SetAddress(ZipCode.searchAddress(1));
		if (makingCard) {
			account.setTel("XXX-XXXX-XXXX");
			makeCard(account);
		}

		accountList.add(account);
	}

	public Account getAccount(String name) {
		for (int i = 0; i < accountList.size(); i++) {
			if (name.equals(accountList.get(i).getName())) return accountList.get(i);
		}
		return null;
	}
	
	public boolean makeCard(Account account) {
		if (account.getAddress() != null && account.getTel() != null) {
			 Card card = new Card();
			 card.setName(account.getName());
			 account.setCard(card);
			 return true;
		}
		return false;
	}
}
