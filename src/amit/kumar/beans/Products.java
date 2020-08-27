package amit.kumar.beans;

public class Products {
	int value;
	String payitem;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getPayitem() {
		return payitem;
	}

	public void setPayitem(String payitem) {
		this.payitem = payitem;
	}

	@Override
	public String toString() {
		return "[Brand=" + payitem + ", Sales=" + value + "]";
	}



}
