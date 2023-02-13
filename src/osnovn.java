import java.util.Scanner;

public class osnovn {
double r;
	public static void main(String[] args) {
		
		Tovar t=new Tovar("Cars",100,3.4);
		Tovar t1=new Tovar("Moto",20,12.4);
		Tovar t2=new Tovar();
		System.out.println(t.nazva);
		System.out.println(t.number);
		System.out.println(t.price);
		System.out.println(t1.nazva);
		System.out.println(t1.number);
		System.out.println(t1.price);
		System.out.println(t2.nazva);
		System.out.println(t2.number);
		System.out.println(t2.price);
		
	}

}
