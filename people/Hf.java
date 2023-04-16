package people;

public class Hf extends Ren {
	private int id;
	public Hf() {
//		super();
		init_value();
		System.out.println("正是在下。");
		
	}
	
	public Hf(String name) {
//		super(name);
		init_value();
		System.out.println("我有名字，不用你告诉我");
	}
	
	private void init_value() {
		id = 411528;
		age = 24;
	}
	
	public void say() {
		System.out.println("是许玉奇的宝贝!");
	}
}
