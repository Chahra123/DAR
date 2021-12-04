package ex1;

public class MAIN {

	    public static void main(String[] args) throws InterruptedException {
        FIRST f=new FIRST();
        f.start();
        SECOND s=new SECOND();
        Thread s1=new Thread(s);
        s1.start();
        f.join();
        System.out.println("STATE OF THE THREAD FIRST: "+f.isAlive());
        s1.join();
        System.out.println("STATE OF THE THREAD SECOND: "+s1.isAlive());
        System.out.println("GAME OVER :D");
	    }
	    

}

