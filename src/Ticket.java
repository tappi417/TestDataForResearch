public class Ticket {

	private String name;
	private boolean isUsed = false;
	
	public Ticket(String name) {
		this.name = name;
	}
	public void use() {
		this.isUsed = true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isUsed() {
		return isUsed;
	}
}
