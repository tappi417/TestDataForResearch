class Account {

	
	private String name = null;
	private int point = 0;
	private String address = null;
	private String tel = null;
	private Card card;
	private Ticket ticket;

	Account(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void addPoint(int i) {
		point += i;
	}
	public int getPoint() {
		return point;
	}
	public void SetAddress(String address) {
		this.address = address;		
	}
	public String getAddress() {
		return this.address;
	}

	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;		
	}
	public Ticket getTicket() {
		return this.ticket;
	}
}
