package amit.kumar.beans;

public class Product {
	
	String language;
	int talk;
	
	public Product(String language, int talk) {
		this.language = language;
		this.talk = talk;
	}

	@Override
	public String toString() {
		return "['"+language+"',"+talk+"]";
	}

}
