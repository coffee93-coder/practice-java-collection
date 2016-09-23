package HashTest;

public class Money {

	private int amout;
	
	public Money(int amout) {
		this.amout = amout;
	}

	@Override
	public String toString() {
		return "Money [amout=" + amout + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amout;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amout != other.amout)
			return false;
		return true;
	}
	
	
	
	
}
