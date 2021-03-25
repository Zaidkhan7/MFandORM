package looslyCoupled;

public class MainApp {
	
	public static void main(String[] args) 
	{ 
	Iworker sw = Factory.getObject(); 
	Manager mn = new Manager(sw); 
	mn.ManageWork();
	} 
	} 

