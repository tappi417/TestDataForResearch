class Card {

	
	private String name = null;
	private int point = 0;
	private String address = null;
	private String tel = null;

	Card(String name) {
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
}
