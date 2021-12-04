package ex2;

public class StaticCounter {
    private static int counter = 0;

    // todo : implement me
    synchronized public static void increment(){
    	//increment counter and print it
    	counter++;
    	System.out.println("COMPTEUR: "+counter);
        
    }
}
