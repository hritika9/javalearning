package LEARNING;

 
class Machine{
	private String name;
	private int age;
	public Machine(){
		this("hritika");
	System.out.println("contructor running 1st");
	}
	public Machine(String name) {
		this.name= name;
		System.out.println("2nd running");
	}
	public Machine(String name , int age) {
		this("hritika");
		this.name=name;
		this.age=age;
		System.out.println("3rd constructor running");
	}
}


public class contructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("rohit");
		Machine machine3 = new Machine("rohit",12);
		

	}

}
