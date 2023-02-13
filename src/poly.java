
public class poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
vihicle vih=new truck("1989", "Man");

	}

}
abstract class vihicle {
	String year;
	public vihicle(String year1) {
		this.year=year1;
	}
	
	public void start() {
		System.out.println("Hello from vihacle "+this.year);
	}
}
class truck extends vihicle{
	String name;
	public truck(String year,String name1) {
		super(year);
		this.name=name1;
	}
	@Override
	public void start() {
	
		System.out.println("Hello from truck"+this.name+this.year);
	}
}
class SportCar extends vihicle{
	String name;
	public SportCar(String year,String name1) {
		super(year);
		this.name=name1;
		// TODO Auto-generated constructor stub
	}

	void start(String name,int speed) {
		System.out.println("Hello from sport"+this.name+this.year);
	}
}
