
public class Telephons {
	private String brand;
	private boolean stan;
	double price;
	Telephons(){
//		this.brand="Samsung";
	}
	void set_brand(String name){
		if (name.length()<30) {
			this.brand=name;
		}
		else {
			this.brand=null;
			}}
	String get_brand() {
		return this.brand;
	}
	boolean isStan() {
		return stan;
	}
	void setStan(boolean stan) {
		this.stan = stan;
	}
}
