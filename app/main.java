package app;
import people.*;

public class main {
    public static void main(String[] args) {
        System.out.println("No. 1");
        Puppy b = new Puppy();
        System.out.println("No. 2");
        Puppy a = new Puppy("ww");
        a.say();
        
        System.out.println();
        Ren[] family = new Ren[2];
        family[0] = new Hf();
        family[1] = new Yq();
        for (Ren i : family) {
        	i.say();
        }
//        Hf c = new Hf();
//        Yq d = new Yq();
//        c.say();
//        d.say();
    }
}