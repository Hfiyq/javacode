package app;
public class Puppy{
    public Puppy(){
    	System.out.println("有一只没有名字的小狗。");
    }
 
    public Puppy(String name){
        System.out.print("有一只小狗，它的名字是:");
        System.out.println(name);
    }
    
    public void say() {
    	System.out.println("汪， 汪， 汪！");
    }
}
