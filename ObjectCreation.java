package day1.oct;

public class ObjectCreation {

  int speed =90;
	String name ="Bike";
	
	
	public void BikeName() {
	
	System.out.println("Yamaha");
	}
	


    public void ReleaseYear() {
    	
    	System.out.println("1997");
    }


public static void main(String[] args) {
	
	ObjectCreation T1 = new ObjectCreation();
		
	T1.BikeName();
	T1.ReleaseYear();
	
	
	System.out.println("T1.speed="+ T1.speed);
	
	System.out.println("T1.name="+ T1.name);
	
	
}

}
