package backend;

public class Spending {
	private String name;
	private int amount;
	private String recurring;
	
	public Spending(String name, int amount, String recurring) {
		this.name = name;
		this.amount = amount;
		this.recurring = recurring;
	}

	/*
	 * Following getters/setters allow editing of attributes of Spending.
	 */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getRecurring() {
		return recurring;
	}

	public void setRecurring(String recurring) {
		this.recurring = recurring;
	}
	

	
}
