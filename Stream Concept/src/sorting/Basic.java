package sorting;
class Parent{

	int i=100;

	public Parent(){
		System.out.println("Inside parent : constructor");
	}
	public String getMessgae(String str) {
		
		return str+"parent";
	}
    
}
public class Basic extends Parent {
	
	int i=200;

	public Basic(){
		System.out.println("Inside Child : constructor");
	}
	public String getMessgae(String str) {
		return str+"child";
	}
	
	public static void main(String[] args) {
         Parent p = new Basic();
         System.out.println(p.i);
         System.out.println(p.getMessgae("Shrikar"));
	}
}
