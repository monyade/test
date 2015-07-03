package Day10;

public class Box {
	
	
	private int width;//added again
	private int depth;
	private int height;
	
	Box(){
		
		this(10,2,3);
		width = 10;
		depth = 10;
		height = 10;
		System.out.println("In default constructor of box class");
	}
	
	Box(int width, int depth, int height){
		
		//this();
		diplayData();
		System.out.println("In parameterized constructor");
		this.width = width;
		this.depth = depth;
		this.height = height;
		diplayData();
		
	}
		
	public void diplayData(){
		
		System.out.println("width: "+width+" depth: "+depth+" height: "+height);
	}
	
	

}
