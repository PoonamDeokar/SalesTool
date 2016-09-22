package thrymr.net.SalesTool;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalesData data=new SalesData();
		displayGreetings();
		data.display();

	}
	
	public static void displayGreetings(){
		System.out.println("Hello Happy Sales People");
		System.out.println("This app shows sales data");
	}


}
