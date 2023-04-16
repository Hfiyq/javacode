package people;

public class Ren {
	protected int age = 0;
    public Ren(){
//    	System.out.println("有一个没有名字的人。");
    }
 
    public Ren(String name){
        System.out.print("有一个人，它的名字是:");
        System.out.println(name);
    }
    
    public void say() {
    	System.out.println("喜欢黄飞！");
    }
    
	public boolean set_age(int n) {
		if(n < 0)
			return false;
		this.age = n;
		return true;
	}
	
	public int get_age() {
		return this.age;
	}
}
