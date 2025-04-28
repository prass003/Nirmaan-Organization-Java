package day12;

class met {
	met(){}
}
public class MethodOverloading {
	
	private int no;
	private String name;
	
	public MethodOverloading(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		  MethodOverloading mo = new MethodOverloading(2,"bvb");
		  System.out.println(mo.getNo());
		  System.out.println(mo.getName());
	}

}
